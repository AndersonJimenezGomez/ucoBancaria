/**
 * 
 */
package co.edu.uco.ucobancaria.dto;

import static co.edu.uco.ucobase.utilitarios.cadenas.UtilTexto.obtenerUtilTexto;

/**
 * objeto de tansferencias que representa a un cliente 
 * @author andres
 *
 */
public final class ClienteDTO {
	
	private int codigo;
	private String numeroidentificacion;
	private String nombre;
	private String correo;
	private String clave;
	
	public ClienteDTO(int codigo, String numeroidentificacion, String nombre, String correo, String clave) {
		super();
		setCodigo(codigo);
		setNumeroidentificacion(numeroidentificacion);
		setNombre(nombre);
		setCorreo(correo);
		setClave(clave);
		this.codigo = codigo;
		this.numeroidentificacion = numeroidentificacion;
		this.nombre = nombre;
		this.correo = correo;
		this.clave = clave;
	}
	public ClienteDTO() {
		super();
	}
	public final int getCodigo() {
		return codigo;
	}
	public final void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public final String getNumeroidentificacion() {
		return numeroidentificacion;
	}
	public final void setNumeroidentificacion(String numeroidentificacion) {
		this.numeroidentificacion = obtenerUtilTexto().aplicarTrim(numeroidentificacion);
	}
	public final String getNombre() {
		return nombre;
	}
	public final void setNombre(String nombre) {
		this.nombre = obtenerUtilTexto().aplicarTrim(nombre);
	}
	public final String getCorreo() {
		return correo;
	}
	public final void setCorreo(String correo) {
		this.correo = obtenerUtilTexto().aplicarTrim(correo);
	}
	public final String getClave() {
		return clave;
	}
	public final void setClave(String clave) {
		this.clave = obtenerUtilTexto().aplicarTrim(clave);
	}
	
}
