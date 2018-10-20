/**
 * 
 */
package co.edu.uco.ucobase.utilitarios.exepcion.enumeracion;

/**
 * @author andres
 *
 */
public enum ExepcionEnumeracion {
	
	DATOS("DATOS","exepcion en la capa de datos"), 
	NEGOCIO("NEGOCIO","exepcion en la capa de negocio"), 
	FACHADA("FACHADA","exepcion en la capa de la fachada"), 
	API("API","exepcion en la capa de servicios"),
	DTO("DTO","exepcion en la capa dto"), 
	DOMINIO("DOMINIO","exepcion en la capa de dominio"), 
	GENERAL("GENERAL","exepcion presentada a nivel general");
	
	private String codigo;
	private String nombre;
	
	private ExepcionEnumeracion(final String codigo,final String nombre) {
		setCodigo(codigo);
		setNombre(nombre);
	}
	
	public final String getCodigo() {
		return codigo;
	}
	private final void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public final String getNombre() {
		return nombre;
	}
	private final void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
