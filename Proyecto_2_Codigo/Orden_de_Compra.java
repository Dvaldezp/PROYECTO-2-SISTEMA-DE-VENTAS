package Proyecto_2_Codigo;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase representa la orden de compra de algun cliente 
 * @author Edy Chay
 * @author Daniel Valdez
 *
 */
public class Orden_de_Compra{
	
	/**
	 * Orden de compra,id, totalOrdencompra, numeroDeCompra
	 */
	
	private List<ItemOrden> colecItem;
	private double totalOrdeCompra;
	private int numeroDeCompra;
	private static int sigIdOrden=10000;
	
	/**
	 * Regresa la orden 
	 * @return
	 */
	
	public static int siguienteIdF() {
		return sigIdOrden++;
	}
	
	/**
	 * siguiente condicion  
	 */
	
	public Orden_de_Compra() {
		colecItem = new ArrayList();
		numeroDeCompra=siguienteIdF();
	}
	
	/**
	 * toma la orden de compra para ordenarla
	 * @param i
	 */
	
	public void agregarItem(ItemOrden i) {
		
		/**
		 * agregara una orden
		 */
		
		if (verificaitem(i) == true) {

			colecItem.add(i);
			

		} else {

			System.out.println("NO EXISTE EL CODIGO POR FAVOR CREE EL CODIGO PARA INGRESARLO COMO COMPRA");
		}

	}
	
	/**
	 * recorre la verificacion y confirma que el codigo sea correcto
	 * @param io
	 * @return
	 */
	
	public boolean verificaitem(ItemOrden io) {
		boolean veri = false;

		for (int j = 0; j < DataSistema.productos.size(); j++) {

			if (DataSistema.productos.get(j).getIdProducto() == io.getProducto().getIdProducto()) {

					int subirstock=io.getProducto().getCantidadInventario();
					DataSistema.productos.get(j).setCantidadInventario(DataSistema.productos.get(j).getCantidadInventario()+io.getCantidad());
					veri = true;
				

			}

		}
		// verifica el item si se guardara correctamente 
		
		return veri;

	}
	
	
	public double getTotalOrden() {
		// total de la orden
		
		totalOrdeCompra = 0;
		for (ItemOrden itemOrden : colecItem) {
			totalOrdeCompra = totalOrdeCompra + itemOrden.getTotalItem();
		}

		totalOrdeCompra=totalOrdeCompra*0.60;
		return totalOrdeCompra;

	}
	// tpma el total de la compra y compara con la orden 
	
	public String toString() {

		String tmp = "NUMERO DE LA ORDEN DE COMPRA= " + numeroDeCompra + "\n";
		//tmp = tmp + "Cliente=" + getCliente().toString() + "\n";

		for (ItemOrden itemOrden : colecItem) {
			tmp = tmp + itemOrden.toString() + ", Subtotal de linea es=" + itemOrden.getTotalItem() + "\n";
		}
		
		

		tmp = tmp + "total de orden de compra es =" + totalOrdeCompra;
		return tmp;
	}
	
	// compara el nomero de orden de compra
		// por ultima regresa la orden de compra 
	

}
