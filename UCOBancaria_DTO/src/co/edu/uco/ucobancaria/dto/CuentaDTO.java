package co.edu.uco.ucobancaria.dto;

import static co.edu.uco.ucobase.utilitarios.cadenas.UtilTexto.obtenerUtilTexto;

/**
 * objeto de transeferencia de datos que representa a una cuenta
 * @author andres
 *
 */

public final class CuentaDTO {
	
	private int codigo;
	private String numero;
	private TipoCuentaDTO tipoCuenta;
	private ClienteDTO cliente;
	private double saldo;
	
	public CuentaDTO(int codigo, String numero, TipoCuentaDTO tipoCuenta, ClienteDTO cliente, double saldo) {
		super();
		setCodigo(codigo);
		setNumero(numero);
		setTipoCuenta(tipoCuenta);
		setCliente(cliente);
		setSaldo(saldo);
		this.codigo = codigo;
		this.numero = numero;
		this.tipoCuenta = tipoCuenta;
		this.cliente = cliente;
		this.saldo = saldo;
	}
		
	public CuentaDTO() {
		super();
	}

	public final int getCodigo() {
		return codigo;
	}

	public final void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public final String getNumero() {
		return numero;
	}

	public final void setNumero(String numero) {
		this.numero = obtenerUtilTexto().aplicarTrim(numero);
	}

	public final TipoCuentaDTO getTipoCuenta() {
		return tipoCuenta;
	}

	public final void setTipoCuenta(TipoCuentaDTO tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}

	public final ClienteDTO getCliente() {
		return cliente;
	}

	public final void setCliente(ClienteDTO cliente) {
		this.cliente = cliente;
	}

	public final double getSaldo() {
		return saldo;
	}

	public final void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
