package Proyecto_2_Codigo;

/**
 * Esta clase representa el calculo de un producto que forma parte de la orden
 * @author Edy Chay
 * @author Daniel Valdez
 *
 */
public class ItemOrden {

	private int noLinea;//
	private int cantidad;
	private Producto producto;
	
	/**
	 * Constructor, noLinea correlativo de la orden
	 * cantidad, producto 
	 * @param noLinea
	 * @param cantidad
	 * @param producto
	 */

	public ItemOrden(int noLinea, int cantidad, Producto producto) {
		this.noLinea = noLinea;
		this.cantidad = cantidad;
		this.producto = producto;
	}
	/**
	 * regresa itemOrden
	 * @return iutemOroden
	 */

	public double getTotalItem() {
		return cantidad * producto.getPrecio();
	}
	/**
	 * regresa totalItem
	 * @return totalItem
	 */


	public int getCantidad() {
		return cantidad;
	}
	/**
	 * cantidad que se registrara para calcular el total de un producto
	 * @param cantidad
	 */
	
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	/**
	 * regresa cantidad 
	 * @return cantidad 
	 */

	public Producto getProducto() {
		return producto;
	}
	/**
	 * se registra el tipo de producto que el cliente eligira
	 * @param producto
	 */


	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	@Override
	public String toString() {
		return "[ItemOrden] noLinea=" + noLinea + ", cantidad=" + cantidad + ", producto=" + producto;
	}

}
