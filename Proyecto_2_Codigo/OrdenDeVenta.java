package Proyecto_2_Codigo;

import java.util.Date;

/**
 * Esta clase representa la orden de venta 
 * @author Edy Chay
 * @author Daniel Valdez
 *
 */
public class OrdenDeVenta {
	
	/**
	 * Clase orden de venta, representa el orden de cada venta a realizar 
	 */


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
	
	/**
	 * regresa todas la variables 
	 * @return
	 */

	public static int siguienteId() {
		return sigIdOrden++;
	}
	/**
	 * regresa siguiente 
	 * @return
	 */

	public int getIdOrdenV() {
		return idOrdenV;
	}
	/**
	 * get idOrdenv, orden de la vena
	 * @param idOrdenV
	 */

	public void setIdOrdenV(int idOrdenV) {
		this.idOrdenV = idOrdenV;
	}
	/**
	 * regresa el orden
	 * @return
	 */

	public Cliente getCliente() {
		return cliente;
	}
	/**
	 * se guarda informacion del cliente para general la orden de venta  
	 * @param cliente
	 */

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	/**
	 * Regresa cliente
	 * @return
	 */

	public Date getFechaorden() {
		return fechaorden;
	}
	/**
	 * se toma la fecha de la orden
	 * @param fechaorden
	 */

	public void setFechaorden(Date fechaorden) {
		this.fechaorden = fechaorden;
	}
	/**
	 * regresa fecha 
	 * @return
	 */

	public double getPrecioEnvio() {
		return precioEnvio;
	}
	/**
	 * precio adicionar por envio 
	 * @param precioEnvio
	 */

	public void setPrecioEnvio(double precioEnvio) {
		this.precioEnvio = precioEnvio;
	}
	/**
	 * regresa el precio del envio 
	 * @return
	 */

	public double getTotal() {
		return total;
	}
	/**
	 * Total de la orden de la venta
	 * @param total
	 */

	public void setTotal(double total) {
		this.total = total;
	}
	/**
	 * regresa el total de venta 
	 * @return
	 */

	public String getTipoEnvio() {
		return tipoEnvio;
	}
	/**
	 * Se especifica el tipo de envio
	 * @param tipoEnvio
	 */

	public void setTipoEnvio(String tipoEnvio) {
		this.tipoEnvio = tipoEnvio;
	}
	/**
	 * regresa el tipo de envio
	 * @return
	 */

	public String getEstado() {
		return estado;
	} 
	/**
	 * estado de la venta
	 * @param estado
	 */

	public void setEstado(String estado) {
		this.estado = estado;
	}
	/**
	 * regresa el estado de la venta
	 * @return
	 */

	public int getDiasEnvio() {
		return diasEnvio;
	}
	
	/**
	 * Los dias que se tomara para enviar el producto 
	 * @param diasEnvio
	 */

	public void setDiasEnvio(int diasEnvio) {
		this.diasEnvio = diasEnvio;
	}
	/**
	 * Los dias que se tomara para realizar el envio
	 */
	

	public OrdenDeVenta() {
		idOrdenV = OrdenDeVenta.siguienteId();
		total = 0;
		fechaorden = new Date();
	}
	
	/**
	 * Toma la orden de venta 
	 * @param fechaorden
	 */

	public OrdenDeVenta(Date fechaorden) {
		this();
		this.fechaorden = fechaorden;
	}
	/**
	 * fecha de la orden, cliente
	 * @param fechaorden
	 * @param cliente
	 */

	public OrdenDeVenta(Date fechaorden, Cliente cliente) {
		this(fechaorden);
		this.cliente = cliente;
		item1 = DataSistema.item.get(0);
		item2 = DataSistema.item.get(1);

	}
	
	/**
	 * regresa fecha y cliente 
	 * @return
	 */

	public double getTotalOrden() {

		return item1.getTotalItem() + item2.getTotalItem();

	}

}
