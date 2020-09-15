package Proyecto_2_Codigo;

public class Producto {
	
	private int idProducto;
	private static int idSiguiente = 2000;
	private String nombreProducto;
	private double precio;
	
	
	
	public static int sigIdProducto() {
		return idSiguiente;

	}
	
	public Producto() {//Default
		idProducto=Producto.sigIdProducto();
		
	}

	public Producto(String nombreProducto, double precio) {
		this();
		this.nombreProducto = nombreProducto;
		this.precio = precio;
	}

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "[Producto] idProducto=" + idProducto + ", nombreProducto=" + nombreProducto + ", precio=" + precio;
	}
	
	
	
	
	
	
	

}
