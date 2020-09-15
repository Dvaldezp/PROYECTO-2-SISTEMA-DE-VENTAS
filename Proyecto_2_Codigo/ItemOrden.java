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
		return cantidad*producto.getPrecio();
	}
	
	
	@Override
	public String toString() {
		return "[ItemOrden] noLinea=" + noLinea + ", cantidad=" + cantidad + ", producto=" + producto;
	}
	
	
	
	

}
