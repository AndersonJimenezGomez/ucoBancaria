/**
 * 
 */
package co.edu.uco.ucobase.utilitarios.exepcion.exepcion;

import static co.edu.uco.ucobase.utilitarios.cadenas.UtilTexto.obtenerUtilTexto;
import co.edu.uco.ucobase.utilitarios.exepcion.enumeracion.ExepcionEnumeracion;
import static co.edu.uco.ucobase.utilitarios.objeto.UtilObjeto.obtenerUtilObjeto;

/**
 * @author andres serial version por defecto de la clase
 *
 */
public final class AplicacionExepcion extends RuntimeException {

	private static final long serialVersionUID = 1L;
	private String mensajeTecnico;
	private String mensajeUsuario;
	private Exception excepcionRaiz;
	private boolean existeExceptionRaiz;
	private ExepcionEnumeracion lugarExcepcion;

	private AplicacionExepcion(final String mensajeTecnico, final String mensajeUsuario, final Exception excepcionRaiz,
			final ExepcionEnumeracion lugarExcepcion) {
		super();
		setMensajeTecnico(mensajeTecnico);
		setMensajeUsuario(mensajeUsuario);
		setExcepcionRaiz(excepcionRaiz);
		setLugarExcepcion(lugarExcepcion);
	}

	public static AplicacionExepcion CREAR(final String mensajeTecnico, final String mensajeUsuario,
			final Exception excepcionRaiz, final ExepcionEnumeracion lugarExcepcion) {

		return new AplicacionExepcion(mensajeTecnico, mensajeUsuario, excepcionRaiz, lugarExcepcion);
	}

	public static AplicacionExepcion CREAR(final String mensajeUsuario, final ExepcionEnumeracion lugarExcepcion) {

		return new AplicacionExepcion(mensajeUsuario, mensajeUsuario, null, lugarExcepcion);
	}

	public static AplicacionExepcion CREAR(final String mensajeUsuario) {

		return new AplicacionExepcion(mensajeUsuario, mensajeUsuario, null, null);
	}

	public final void setMensajeTecnico(final String mensajeTecnico) {
		this.mensajeTecnico = obtenerUtilTexto().aplicarTrim(mensajeTecnico);
	}

	public final void setMensajeUsuario(final String mensajeUsuario) {
		this.mensajeUsuario = obtenerUtilTexto().aplicarTrim(mensajeUsuario);
	}

	public final void setExcepcionRaiz(final Exception excepcionRaiz) {

		setExisteExceptionRaiz(!obtenerUtilObjeto().objetoEsNulo(excepcionRaiz));

		this.excepcionRaiz = obtenerUtilObjeto().obtenerValorDefecto(excepcionRaiz, new Exception());
	}

	public final void setExisteExceptionRaiz(final boolean existeExceptionRaiz) {

		this.existeExceptionRaiz = existeExceptionRaiz;
	}

	public final void setLugarExcepcion(final ExepcionEnumeracion lugarExcepcion) {
		this.lugarExcepcion = obtenerUtilObjeto().obtenerValorDefecto(lugarExcepcion, ExepcionEnumeracion.GENERAL);
	}

	public final String getMensajeTecnico() {
		return mensajeTecnico;
	}

	public final String getMensajeUsuario() {
		return mensajeUsuario;
	}

	public final Exception getExcepcionRaiz() {
		return excepcionRaiz;
	}

	public final boolean isExisteExceptionRaiz() {
		return existeExceptionRaiz;
	}

	public final ExepcionEnumeracion getLugarExcepcion() {
		return lugarExcepcion;
	}

}
