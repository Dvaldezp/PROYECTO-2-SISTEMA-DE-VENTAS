package Proyecto_2_Codigo;

import java.util.Date;

public class OrdenDeVenta {

	private int idOrdenV;
	private Cliente cliente;
	private ItemOrden item1;
	private ItemOrden item2;
	private Date fechaorden;
	private double precioEnvio;
	private double total;
	private String tipoEnvio;
	private String estado;
	private int diasEnvio;
	private static int sigIdOrden = 3000;

	public static int siguienteId() {
		return sigIdOrden++;
	}

	public int getIdOrdenV() {
		return idOrdenV;
	}

	public void setIdOrdenV(int idOrdenV) {
		this.idOrdenV = idOrdenV;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Date getFechaorden() {
		return fechaorden;
	}

	public void setFechaorden(Date fechaorden) {
		this.fechaorden = fechaorden;
	}

	public double getPrecioEnvio() {
		return precioEnvio;
	}

	public void setPrecioEnvio(double precioEnvio) {
		this.precioEnvio = precioEnvio;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public String getTipoEnvio() {
		return tipoEnvio;
	}

	public void setTipoEnvio(String tipoEnvio) {
		this.tipoEnvio = tipoEnvio;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getDiasEnvio() {
		return diasEnvio;
	}

	public void setDiasEnvio(int diasEnvio) {
		this.diasEnvio = diasEnvio;
	}

	public OrdenDeVenta() {
		idOrdenV = OrdenDeVenta.siguienteId();
		total = 0;
		fechaorden = new Date();
	}

	public OrdenDeVenta(Date fechaorden) {
		this();
		this.fechaorden = fechaorden;
	}

	public OrdenDeVenta(Date fechaorden, Cliente cliente) {
		this(fechaorden);
		this.cliente = cliente;
		item1 = DataSistema.item.get(0);
		item2 = DataSistema.item.get(1);

	}

	public double getTotalOrden() {

		return item1.getTotalItem() + item2.getTotalItem();

	}

	

	

}
