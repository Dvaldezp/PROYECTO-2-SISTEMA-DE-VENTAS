package Proyecto_2_Codigo;
/**
 * Esta clase esta obligada a mantener una propiedad para identificar a cada producto
 * @author Edy Chay
 * @author Daniel Valdez
 *
 */

public class Producto {

	private int idProducto;
	private static int idSiguiente = 2000;
	private String nombreProducto;
	
	private TipoProducto tipodeProducto;
	private int cantidadInventario;
	private double precio;
	
	/**
	 * Regresa al objeto producto 
	 * @return
	 */

	public TipoProducto getTipodeProducto() {
		return tipodeProducto;
	}
	/**
	 * Parametro para tipo producto 
	 * @param tipodeProducto
	 */

	public void setTipodeProducto(TipoProducto tipodeProducto) {
		this.tipodeProducto = tipodeProducto;
	}
	/**
	 * regresa el tipo de producto
	 * @return
	 */
	public int getCantidadInventario() {
		return cantidadInventario;
	}
	/**
	 * calcula la cantidad de inventario
	 * @param cantidadInventario
	 */
	
	public void setCantidadInventario(int cantidadInventario) {
		this.cantidadInventario = cantidadInventario;
	}
	/**
	 * regresa cantidad de inventario 
	 * @return
	 */

	public static int sigIdProducto() {
		return idSiguiente++;

	}

	public Producto() {
		idProducto = Producto.sigIdProducto();

	}
	
	/**
	 * parametros para nombreProducto, tipoProducto, Cantidadinventario y precio
	 * @param nombreProducto
	 * @param tipodeProducto
	 * @param cantidadInventario
	 * @param precio
	 */
	
	

	public Producto(String nombreProducto, TipoProducto tipodeProducto, int cantidadInventario, double precio) {
		this();
		this.nombreProducto = nombreProducto;
		this.tipodeProducto = tipodeProducto;
		this.cantidadInventario = cantidadInventario;
		this.precio = precio;
	}
	
	/**
	 * Regresa el producto
	 * @return
	 */
	public int getIdProducto() {
		return idProducto;
	} 
	/**
	 * parametro para idProducto
	 * @param idProducto
	 */
	
	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}
	/**
	 * regresa idProducto
	 * @return
	 */
	
	public String getNombreProducto() {
		return nombreProducto;
	}
	/**
	 * nombre producto, para llevar el control del producto
	 * @param nombreProducto
	 */

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	/**
	 * regresa NombreProducto
	 * @return
	 */
	
	public double getPrecio() {
		return precio;
	}
	
	/**
	 * Precio del producto
	 * @param precio
	 */

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	/**
	 *Regresa Precio 
	 */

	public String toString() {
		return "[Producto] Id de Producto=" + idProducto + ", Nombre=" + nombreProducto + ", Stock="
				+ cantidadInventario + ", Tipo de Producto=" + tipodeProducto + ", precio=" + precio;
	}

}
