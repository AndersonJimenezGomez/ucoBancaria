/**
 * 
 */
package co.edu.uco.ucobancaria.dto;

import static co.edu.uco.ucobase.utilitarios.cadenas.UtilTexto.obtenerUtilTexto;
import static co.edu.uco.ucobase.utilitarios.fechas.UtilFecha.obtenerUtilFecha;
import java.util.Date;

/**
 * objeto de tansferencias que representa un tipo de movimientos
 * @author andres
 *
 */
public final class MovimientoDTO {
	
	private int codigo;
	private Date fecha;
	private TipoMovimientoDTO tipoMovimiento;
	private CuentaDTO cuenta;
	private double valor;
	private String comentario;
	
	public MovimientoDTO(int codigo, Date fecha, TipoMovimientoDTO tipoMovimiento, CuentaDTO cuenta, double valor,
			String comentario) {
		super();
		setCodigo(codigo);
		setFecha(fecha);
		setTipoMovimiento(tipoMovimiento);
		setCuenta(cuenta);
		setValor(valor);
		setComentario(comentario);
		this.codigo = codigo;
		this.fecha = fecha;
		this.tipoMovimiento = tipoMovimiento;
		this.cuenta = cuenta;
		this.valor = valor;
		this.comentario = comentario;
	}
	
	public MovimientoDTO() {
		super();
	}

	public final int getCodigo() {
		return codigo;
	}

	public final void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public final Date getFecha() {
		return fecha;
	}

	public final void setFecha(Date fecha) {
		this.fecha = obtenerUtilFecha().fechaActual(fecha);
	}

	public final TipoMovimientoDTO getTipoMovimiento() {
		return tipoMovimiento;
	}

	public final void setTipoMovimiento(TipoMovimientoDTO tipoMovimiento) {
		this.tipoMovimiento = tipoMovimiento;
	}

	public final CuentaDTO getCuenta() {
		return cuenta;
	}

	public final void setCuenta(CuentaDTO cuenta) {
		this.cuenta = cuenta;
	}

	public final double getValor() {
		return valor;
	}

	public final void setValor(double valor) {
		this.valor = valor;
	}

	public final String getComentario() {
		return comentario;
	}

	public final void setComentario(String comentario) {
		this.comentario = obtenerUtilTexto().aplicarTrim(comentario);
	}

}
