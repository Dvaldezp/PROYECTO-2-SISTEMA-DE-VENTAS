package Proyecto_2_Codigo;

public class Cliente_Empresa extends Cliente {

	private String contacto;
	private int descuentoEmpresa;

	public Cliente_Empresa(String nombreCliente, String apellidoCliente, String direccion, String contacto,
			int descuentoEmpresa) {
		super(nombreCliente, apellidoCliente, direccion);
		this.contacto = contacto;
		this.descuentoEmpresa = descuentoEmpresa;

	}

	public String getContacto() {
		return contacto;
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

	@Override
	public String toString() {
		return "Cliente_Empresa ["+super.toString()+"contacto=" + contacto + ", descuentoEmpresa=" + descuentoEmpresa + "]";
	}
	
	

}
