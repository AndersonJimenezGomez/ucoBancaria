/**
 * 
 */
package co.edu.uco.ucobase.utilitarios.objeto;

/**
 * objeto utilitario que expone servicios que pueden ser utilizados de forma por algun objeto
 * @author andres
 *
 */
public final class UtilObjeto {
	
	private static final UtilObjeto INSTANCIA = new UtilObjeto();
	
	public UtilObjeto() {
		super();
	}
	
	public static final UtilObjeto obtenerUtilObjeto() {
		return INSTANCIA;
	}
	
	public <T> T obtenerValorDefecto(T objeto, T valorDefecto) {
		
		T retorno = objeto;
		
		if(objetoEsNulo(objeto)) {
			retorno = valorDefecto;
		}
		return retorno;
	}
	
	public <T> boolean objetoEsNulo(T objeto) {
		return (objeto==null);
	}

}
