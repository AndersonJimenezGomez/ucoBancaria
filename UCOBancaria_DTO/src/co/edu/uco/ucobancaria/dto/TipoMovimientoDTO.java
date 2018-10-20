/**
 * 
 */
package co.edu.uco.ucobancaria.dto;

import static co.edu.uco.ucobase.utilitarios.cadenas.UtilTexto.obtenerUtilTexto;

import co.edu.uco.ucobase.utilitarios.objeto.UtilObjeto;

/**
 * objeto de tansferencias que representa un tipo de movimientos o de transeferencias
 * realizada sobre una cuenta
 * @author andres
 *
 */
public final class TipoMovimientoDTO {
	
	private int codigo;
	private String nombre;
	private String signo;
	
	public TipoMovimientoDTO(int codigo, String nombre, String signo) {
		super();
		setCodigo(codigo);
		setNombre(nombre);
		setSigno(signo);
		this.codigo = codigo;
		this.nombre = nombre;
		this.signo = signo;
	}
	
	public TipoMovimientoDTO() {
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

	public final String getSigno() {
		return signo;
	}

	public final void setSigno(String signo) {
		this.signo = obtenerUtilTexto().aplicarTrim(signo);
	}

}
