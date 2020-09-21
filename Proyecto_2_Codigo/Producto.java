package Proyecto_2_Codigo;

public class Producto {

	private int idProducto;
	private static int idSiguiente = 2000;
	private String nombreProducto;
	private TipoProducto tipodeProducto;
	private int cantidadInventario;
	private double precio;

	public TipoProducto getTipodeProducto() {
		return tipodeProducto;
	}

	public void setTipodeProducto(TipoProducto tipodeProducto) {
		this.tipodeProducto = tipodeProducto;
	}

	public int getCantidadInventario() {
		return cantidadInventario;
	}

	public void setCantidadInventario(int cantidadInventario) {
		this.cantidadInventario = cantidadInventario;
	}

	public static int sigIdProducto() {
		return idSiguiente++;

	}

	public Producto() {// Default
		idProducto = Producto.sigIdProducto();

	}

	public Producto(String nombreProducto, TipoProducto tipodeProducto, int cantidadInventario, double precio) {
		this();
		this.nombreProducto = nombreProducto;
		this.tipodeProducto = tipodeProducto;
		this.cantidadInventario = cantidadInventario;
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
		return "[Producto] Id de Producto=" + idProducto + ", Nombre=" + nombreProducto + ", Stock="
				+ cantidadInventario + ", Tipo de Producto=" + tipodeProducto + ", precio=" + precio;
	}

}
