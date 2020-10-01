package Proyecto_2_Codigo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Facturacion extends OrdenDeVenta {

	private List<ItemOrden> colecItem;
	private double totalDeFacturacion;
	private int numeroDeFactura;
	private static int sigIdFactura = 70000;
	private boolean liberado=true;

	public static int siguienteIdF() {
		return sigIdFactura++;
	}

	public Facturacion(Date fechaorden, Cliente cliente) {
		super(fechaorden, cliente);
		colecItem = new ArrayList();
		numeroDeFactura = siguienteIdF();
	}

	public void agregarItem(ItemOrden i) {
		if(liberado==true) {
		if (verificaitem(i) == true) {

			colecItem.add(i);
			rebajarInventario(i);

		} }else {

			System.out.println(
					"NO SE PUEDE AGREGAR ESTE ITEM PORQUE SOBRE PASA EL VALOR DEL STOCK ACTUAL, el codigo es --> "
							+ i.getProducto().getIdProducto());
		}

	}
	
	
	public void cerrarfactura() {
		liberado=false;
		getTotalOrden();
	}
	
	

	public boolean verificaitem(ItemOrden io) {
		boolean veri = false;

		for (int j = 0; j < DataSistema.productos.size(); j++) {

			if (DataSistema.productos.get(j).getIdProducto() == io.getProducto().getIdProducto()) {

				if (DataSistema.productos.get(j).getCantidadInventario() >= io.getCantidad()) {

					System.out.println(
							"--------------------------" + DataSistema.productos.get(j).getCantidadInventario());
					System.out.println("--------------------------" + io.getCantidad());
					veri = true;
				}

			}

		}

		return veri;

	}

	public void rebajarInventario(ItemOrden io) {

		int rebajar = 0;

		for (int i = 0; i < DataSistema.productos.size(); i++) {

			if (DataSistema.productos.get(i).getIdProducto() == io.getProducto().getIdProducto()) {

				rebajar = DataSistema.productos.get(i).getCantidadInventario() - io.getCantidad();
				DataSistema.productos.get(i).setCantidadInventario(rebajar);

			}

		}
	}

	public double getTotalOrden() {

		totalDeFacturacion = 0;
		for (ItemOrden itemOrden : colecItem) {
			totalDeFacturacion = totalDeFacturacion + itemOrden.getTotalItem();
		}

		return totalDeFacturacion;

	}

	@Override
	public String toString() {
		
		for (int i = 0; i < DataFacturas.factura.size(); i++) {
			
			DataFacturas.factura.get(i).getTotalOrden();
			
		}

		String tmp = "NUMERO DE FACTURA= " + numeroDeFactura + "\n";
		tmp = tmp + "Cliente=" + getCliente().toString() + "\n";

		for (ItemOrden itemOrden : colecItem) {
			tmp = tmp + itemOrden.toString() + ", Subtotal de linea es=" + itemOrden.getTotalItem() + "\n";
		}
		
		tmp = tmp + "total de factura es =" + totalDeFacturacion;
		return tmp;
	}

	public int getNumerodefactura() {
		return numeroDeFactura;
	}

	
	public String verCliente() {
		return getCliente().getNombreCliente();
	}
}
