package co.edu.uco.ucobancaria.dominio;

import co.edu.uco.ucobase.utilitarios.dominio.enumeracion.OperacionEnum;
import co.edu.uco.ucobase.utilitarios.exepcion.enumeracion.ExepcionEnumeracion;
import co.edu.uco.ucobase.utilitarios.exepcion.exepcion.AplicacionExepcion;
import co.edu.uco.ucobase.utilitarios.objeto.UtilObjeto;

public final class TipoMovimientoDominio {

	private int codigo;
	private String nombre;
	private String signo;
	private OperacionEnum operacion;

	private TipoMovimientoDominio(final int codigo, final String nombre, final String signo, final OperacionEnum operacion) {
		super();
		setCodigo(codigo);
		setNombre(nombre);
		setOperacion(operacion);
		setSigno(signo);
	}

	public static TipoMovimientoDominio CREAR(final int codigo, final String nombre, final String signo,final OperacionEnum operacion) {
		final TipoMovimientoDominio retorno = new TipoMovimientoDominio(0, nombre, signo,operacion);
		
		switch (retorno.getOperacion()) {
		case CREAR:
			retorno.asegurarIntegridadNombbre();
			retorno.asegurarIntegridadSigno();
			break;
			
		case ACTUALIZAR:

			break;
			
		case ELIMINAR:
			retorno.asegurarIntegridadCodigo();
			break;
			
			
		case CONSULTAR:
			if (retorno.getCodigo()>0) {
				retorno.asegurarIntegridadCodigo();
				
			}
			if (retorno.getNombre()!= null && retorno.getNombre().trim().intern()!="") {
				retorno.asegurarIntegridadNombbre();
			}
			if(retorno.getSigno() != null && retorno.getSigno().trim().intern()!= "") {
				retorno.asegurarIntegridadSigno();
			}

			break;			
		case POBLAR:
			retorno.asegurarIntegridadCodigo();
			retorno.asegurarIntegridadNombbre();
			retorno.asegurarIntegridadSigno();
			break;
			

		default:
			String mensaje = "El objeto tipo movimiento no se puede crear, debido a que la operacion para validar integridad no existe";
			throw AplicacionExepcion.CREAR(mensaje, ExepcionEnumeracion.DOMINIO);
			
		}
		
		
		retorno.asegurarIntegridadSigno();
		retorno.asegurarIntegridadNombbre();
		return retorno;

	}

	public static TipoMovimientoDominio CREAR_ACTUALIZAR(final int codigo, final String nombre, final String signo, OperacionEnum operacion) {
		final TipoMovimientoDominio retorno = new TipoMovimientoDominio(codigo, nombre, signo, operacion);
		retorno.asegurarIntegridadSigno();
		retorno.asegurarIntegridadNombbre();
		retorno.asegurarIntegridadCodigo();
		return retorno;

	}

//	public static TipoMovimientoDominio CREAR_ELIMINAR(final int codigo) {
//		final TipoMovimientoDominio retorno = new TipoMovimientoDominio(codigo, "oe", "oe", );
//		retorno.asegurarIntegridadSigno();
//		retorno.asegurarIntegridadNombbre();
//		retorno.asegurarIntegridadCodigo();
//		return retorno;
//
//	}

	public OperacionEnum getOperacion() {
		return operacion;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public String getSigno() {
		return signo;
	}

	private void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	private void setNombre(String nombre) {
		this.nombre = UtilObjeto.obtenerUtilObjeto().obtenerValorDefecto(nombre, "");
	}

	private void setSigno(String signo) {
		this.signo =  UtilObjeto.obtenerUtilObjeto().obtenerValorDefecto(signo, "");
	}

	private void setOperacion(OperacionEnum operacion) {
		this.operacion =  operacion;
	}

	private void asegurarIntegridadCodigo() {
		if (getCodigo() <= 0) {
			String mensaje = "El codigo de un tipo de movimiento debe ser mayor a cero";
			throw AplicacionExepcion.CREAR(mensaje, ExepcionEnumeracion.DOMINIO);
		}
	}
	
	private void asegurarIntegridadOperacion() {
		if (getOperacion()== null) {
			String mensaje = "La operacion para llevar a cabo la creacion del objeto tipo movimiento es requerida";
			throw AplicacionExepcion.CREAR(mensaje, ExepcionEnumeracion.DOMINIO);
		}
	}

	private void asegurarIntegridadNombbre() {
		if (getNombre() == null) {
			String mensaje = "El nombre de un tipo de movimiento no debe ser nulo";
			throw AplicacionExepcion.CREAR(mensaje, ExepcionEnumeracion.DOMINIO);
		} else if (getNombre().trim().intern() == "") {
			String mensaje = "El nombre de un tipo de movimiento no debe estar vacio";
			throw AplicacionExepcion.CREAR(mensaje, ExepcionEnumeracion.DOMINIO);

		} else if (getNombre().trim().length() > 250) {
			String mensaje = "El nombre de un tipo de movimiento no debe tener mas de 250 caracteres";
			throw AplicacionExepcion.CREAR(mensaje, ExepcionEnumeracion.DOMINIO);
		} else if (getNombre().trim().matches("^[a-zA-Z]+$")) {
			String mensaje = "El nombre de un tipo de movimiento no debe tener mas de 250 caracteres";
			throw AplicacionExepcion.CREAR(mensaje, ExepcionEnumeracion.DOMINIO);
		}

	}

	private void asegurarIntegridadSigno() {
		if (getNombre() == null) {

			String mensaje = "El signo de un tipo de movimiento no  puede ser nulo. ";
			throw AplicacionExepcion.CREAR(mensaje, ExepcionEnumeracion.DOMINIO);

		} else if (getNombre().trim().intern() == "") {
			String mensaje = "El signo de un tipo de movimiento no  puede sestar vacio. ";
			throw AplicacionExepcion.CREAR(mensaje, ExepcionEnumeracion.DOMINIO);

		} else if (getNombre().trim().intern() != "+" || getNombre().trim().intern() != "-") {
			String mensaje = "El signo de un tipo de movimiento solo puede tener letras y espacios.";
			throw AplicacionExepcion.CREAR(mensaje, ExepcionEnumeracion.DOMINIO);

		} else if (getNombre().trim().matches("^[+-]+$")) {
			String mensaje = "El signo de un tipo de movimiento solo puede tener letras y espacios. ";
			throw AplicacionExepcion.CREAR(mensaje, ExepcionEnumeracion.DOMINIO);
		}

	}
	
	public static void main(String[] args) {
		try {
			CREAR(0, "", "", OperacionEnum.CREAR);
			
		}catch(AplicacionExepcion excepcion) {
			System.out.println(excepcion.getMensajeUsuario());
			System.out.println(excepcion.getMensajeTecnico());
			
		}
	}

}
