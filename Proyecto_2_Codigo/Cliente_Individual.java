package Proyecto_2_Codigo;

/**
 * Esta clase define al cliente individual, cliente minorista 
 * @author Edy Chay
 * @author Daniel Valdez
 *
 */
public class Cliente_Individual extends Cliente {
	//Campos de la clase
	
	private String dpi;
	
	/**
	 * Constructor para la clase individual
	 * @param nombreCliente
	 * @param apellidoCliente
	 * @param direccion
	 * @param dpi
	 */
	
	public Cliente_Individual(String nombreCliente, String apellidoCliente, String direccion, String dpi) {

		super(nombreCliente, apellidoCliente, direccion);
		this.dpi = dpi;
	}
	/**
	 * metodo que devuele el cliente individual
	 * @return
	 */

	// metodos publicos
	
	public String getDpi() {
		return dpi;
	}
	/**
	 * Dpi del cliente
	 * @param dpi
	 */
	
	public void setDpi(String dpi) {
		this.dpi = dpi;
	}

	@Override
	public String toString() {
		return "[Cliente_Individual] " + super.toString() + "dpi=" + dpi + "";
	}
	
	@Override
	public void setDpipadre(String dpi) {
		this.dpi = dpi;
	}
	/**
	 * dpi padre
	 */
	@Override
	public String getDpipadre() {
		return dpi;
	}

}
