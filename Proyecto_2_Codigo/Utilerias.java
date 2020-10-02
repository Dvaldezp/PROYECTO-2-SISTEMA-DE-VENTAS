package Proyecto_2_Codigo;


/**
 * Esta clase es para devolver el nombre de la clase de forma especifica 
 * @author Edy Chay
 * @author Daniel Valdez
 *
 */
public class Utilerias {

	/**
	 * Variable, regresa el parametro
	 * @param c
	 * @return
	 */
		
	
	public static String getNombreClase(Class c) {
		return c.getSimpleName().toString();
		
	}
	
	
}
