package co.edu.uco.ucobase.utilitarios.fechas;

import static co.edu.uco.ucobase.utilitarios.objeto.UtilObjeto.obtenerUtilObjeto;

import java.util.Date;

public final class UtilFecha {
	
	private static final UtilFecha INSTANCIA = new UtilFecha();
	private static Date fechActual;


	public UtilFecha() {
		
	}
	
	public static final UtilFecha obtenerUtilFecha() {
		return INSTANCIA;
	}

	public Date fechaActual(Date fecha) {
		fechActual = new Date();
		return obtenerUtilObjeto().obtenerValorDefecto(fecha,fechActual);
	}
	
}
