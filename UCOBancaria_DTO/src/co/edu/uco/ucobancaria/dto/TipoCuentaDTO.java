package co.edu.uco.ucobancaria.dto;

import static co.edu.uco.ucobase.utilitarios.cadenas.UtilTexto.obtenerUtilTexto;

/**
 * objeto de transferencia de datos que representa a un tipo de cuenta
 * 
 * @author andres
 *
 */

public final class TipoCuentaDTO {

	private int codigo;
	private String nombre;
	
	public TipoCuentaDTO(int codigo, String nombre) {
		super();
		setCodigo(codigo);
		setNombre(nombre);
		this.codigo = codigo;
		this.nombre = nombre;
	}
	
	public TipoCuentaDTO() {
		super();
	}

	public final int getCodigo() {
		return codigo;
	}

	public final void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public final String getNombre() {
		return nombre;
	}

	public final void setNombre(String nombre) {
		this.nombre = obtenerUtilTexto().aplicarTrim(nombre);
	}

}
