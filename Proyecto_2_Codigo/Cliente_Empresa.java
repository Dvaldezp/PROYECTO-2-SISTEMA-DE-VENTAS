package Proyecto_2_Codigo;

/**
 * Esta clase define el objeto de cliente empresa, que se encargara de todos los
 * clientes mayoritarios
 * 
 * @author Daniel Valdez
 * @author Edy Chay
 *
 */

public class Cliente_Empresa extends Cliente {
	
	// Campos de la clase

	private String contacto;
	private int descuentoEmpresa;
	
	/**
	 * Constructor para la serie cliente empresa
	 * 
	 * @param nombreCliente
	 * @param apellidoCliente
	 * @param direccion
	 * @param contacto
	 * @param descuentoEmpresa
	 */

	public Cliente_Empresa(String nombreCliente, String apellidoCliente, String direccion, String contacto,
			int descuentoEmpresa) {
		super(nombreCliente, apellidoCliente, direccion);
		this.contacto = contacto;
		this.descuentoEmpresa = descuentoEmpresa;
	
	// metodos publicos

	}

	public String getContacto() {
		return contacto;
	/**
	* contacto del cliente
	*/
		
	}

	public void setContacto(String contacto) {
		this.contacto = contacto;
	}

	public int getDescuentoEmpresa() {
		return descuentoEmpresa;
	}

	public void setDescuentoEmpresa(int descuentoEmpresa) {
		this.descuentoEmpresa = descuentoEmpresa;
	}
	
	/**
	 * Descuento que se le realizara al producto
	 */

	@Override
	public String toString() {
		return "[Cliente_Empresa] " + super.toString() + "contacto=" + contacto + ", descuentoEmpresa="
				+ descuentoEmpresa + "";
	}
	/**
	 * El cliente empresa guarda el contacto y a ese contacto le realizara el
	 * descuento
	 */
	
	@Override
	public void setDContactopadre(String contacto) {
		this.contacto = contacto;
	}
	
	/**
	 * contacto padre tomara informacion sobre contacto empresa para mostrarla luego
	 */
	@Override
	public void setDescuentopadre(int descuentoEmpresa) {
		this.descuentoEmpresa = descuentoEmpresa ;
	}
	
	/**
	 * Realizara el descuento a padre
	 */
	@Override
	public String getContactopadre() {
		return contacto;
	}
	
	
	@Override
	public int getDescuentoEmpresaPadre() {
		return descuentoEmpresa;
	}

}
