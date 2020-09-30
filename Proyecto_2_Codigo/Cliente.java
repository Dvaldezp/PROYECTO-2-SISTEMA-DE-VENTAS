package Proyecto_2_Codigo;

import Proyecto_2_Codigo.Cliente_Individual;

public class Cliente {

	private int idCliente;
	private static int idSiguiente = 1;
	private String nombreCliente;
	private String apellidoCliente;
	private String direccion;

	public static int sigIdCLiente() {
		return idSiguiente++;

	}

	public Cliente() {// Default
		idCliente = Cliente.sigIdCLiente();
	}

	public Cliente(String nombreCliente, String apellidoCliente, String direccion) {
		this();
		this.nombreCliente = nombreCliente;
		this.apellidoCliente = apellidoCliente;
		this.direccion = direccion;
	}

	public int getIdCliente() {
		return idCliente;
	}
	
	
	

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getApellidoCliente() {
		return apellidoCliente;
	}

	public void setApellidoCliente(String apellidoCliente) {
		this.apellidoCliente = apellidoCliente;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "idCliente=" + idCliente + ", nombreCliente=" + nombreCliente + ", apellidoCliente=" + apellidoCliente
				+ ", direccion=" + direccion + ", ";
	}

	

	public void setDpipadre(String dpi) {
		// TODO Auto-generated method stub
		
	}

	public void setDContactopadre(String contacto) {
		// TODO Auto-generated method stub
		
	}

	public void setDescuentopadre(int descuentoEmpresa) {
		// TODO Auto-generated method stub
		
	}

	public String getContactopadre() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getDescuentoEmpresaPadre() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getDpipadre() {
		// TODO Auto-generated method stub
		return null;
	}

}
