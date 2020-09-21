package Proyecto_2_Codigo;

public class ItemOrden {

	private int noLinea;//
	private int cantidad;
	private Producto producto;

	public ItemOrden(int noLinea, int cantidad, Producto producto) {
		this.noLinea = noLinea;
		this.cantidad = cantidad;
		this.producto = producto;
	}

	public double getTotalItem() {
		return cantidad * producto.getPrecio();
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	@Override
	public String toString() {
		return "[ItemOrden] noLinea=" + noLinea + ", cantidad=" + cantidad + ", producto=" + producto;
	}

}
