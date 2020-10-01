package Proyecto_2_Codigo;

import java.util.ArrayList;
import java.util.List;

public class Orden_de_Compra{
	
	private List<ItemOrden> colecItem;
	private double totalOrdeCompra;
	private int numeroDeCompra;
	private static int sigIdOrden=10000;
	
	
	public static int siguienteIdF() {
		return sigIdOrden++;
	}
	
	
	public Orden_de_Compra() {
		colecItem = new ArrayList();
		numeroDeCompra=siguienteIdF();
	}
	
	
	
	public void agregarItem(ItemOrden i) {

		if (verificaitem(i) == true) {

			colecItem.add(i);
			

		} else {

			System.out.println("NO EXISTE EL CODIGO POR FAVOR CREE EL CODIGO PARA INGRESARLO COMO COMPRA");
		}

	}
	
	public boolean verificaitem(ItemOrden io) {
		boolean veri = false;

		for (int j = 0; j < DataSistema.productos.size(); j++) {

			if (DataSistema.productos.get(j).getIdProducto() == io.getProducto().getIdProducto()) {

					int subirstock=io.getProducto().getCantidadInventario();
					DataSistema.productos.get(j).setCantidadInventario(DataSistema.productos.get(j).getCantidadInventario()+io.getCantidad());
					veri = true;
				

			}

		}

		return veri;

	}
	
	
	public double getTotalOrden() {

		totalOrdeCompra = 0;
		for (ItemOrden itemOrden : colecItem) {
			totalOrdeCompra = totalOrdeCompra + itemOrden.getTotalItem();
		}

		totalOrdeCompra=totalOrdeCompra*0.60;
		return totalOrdeCompra;

	}
	
	public String toString() {

		String tmp = "NUMERO DE LA ORDEN DE COMPRA= " + numeroDeCompra + "\n";
		//tmp = tmp + "Cliente=" + getCliente().toString() + "\n";

		for (ItemOrden itemOrden : colecItem) {
			tmp = tmp + itemOrden.toString() + ", Subtotal de linea es=" + itemOrden.getTotalItem() + "\n";
		}
		
		

		tmp = tmp + "total de orden de compra es =" + totalOrdeCompra;
		return tmp;
	}
	
	
	
	
	

}
