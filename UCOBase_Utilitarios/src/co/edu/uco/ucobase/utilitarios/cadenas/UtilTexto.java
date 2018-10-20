package co.edu.uco.ucobase.utilitarios.cadenas;

import static co.edu.uco.ucobase.utilitarios.objeto.UtilObjeto.obtenerUtilObjeto;

public final class UtilTexto {
	
	private static final UtilTexto INSTANCIA = new UtilTexto();

	public UtilTexto() {
		super();
	}
	
	public static final UtilTexto obtenerUtilTexto() {
		return INSTANCIA;
	}
	
	public String aplicarTrim(String cadena) {
		return obtenerUtilObjeto().obtenerValorDefecto(cadena,"").trim();
	}

}
