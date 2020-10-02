package controller;

import java.util.Calendar;
import java.util.GregorianCalendar;

import Proyecto_2_Codigo.DataFacturas;
import Proyecto_2_Codigo.DataSistema;
import Proyecto_2_Codigo.Facturacion;
import Proyecto_2_Codigo.ItemOrden;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

/**
 * ESta clase permitira crear las facturas necesarias para clientes individuales
 * y de empresa
 * 
 * @author Daniel Valdez
 * @author Daniel Valdez
 *
 */
public class ControladorCrearFactura {

	public TextField txtcodig;
	public TextField txtcodpro;
	public TextField txtcantidad;
	public static int psosicion;

	/**
	 * Constructor para la creacion de la factura
	 * 
	 * @param actionEvent
	 */

	public void agregarCliente(ActionEvent actionEvent) {
		Calendar c1 = GregorianCalendar.getInstance();

		/**
		 * Metodo que permitira agregar al cliente a los datos de la factura
		 */

		try {
			for (int i = 0; i < DataSistema.clientes.size(); i++) {

				int num1 = Integer.parseInt(txtcodig.getText());

				if (num1 == DataSistema.clientes.get(i).getIdCliente()) {
					DataFacturas.factura.add(new Facturacion(c1.getTime(), DataSistema.clientes.get(i)));
					ControladorCrearFactura.psosicion = DataFacturas.factura.size() - 1;
					System.out.println("hola");
				}
				// Cierre del metodo

			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public void facturar(ActionEvent actionEvent) {

		/**
		 * Metodo que permitira general la creacion de la factura
		 */

		try {
			DataFacturas.factura.get(ControladorCrearFactura.psosicion);
			System.out.println("SSSSSSSSSSS");

			System.out.println(DataFacturas.factura.get(psosicion).toString());

			// cierre del metodo

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void agregarItems(ActionEvent actionEvent) {

		/**
		 * Metodo que agregara el Items de los productos
		 */

		try {
			for (int i = 0; i < DataSistema.productos.size(); i++) {

				int num2 = Integer.parseInt(txtcodpro.getText());

				if (num2 == DataSistema.productos.get(i).getIdProducto()) {

					DataSistema.item.add(
							new ItemOrden(1, Integer.parseInt(txtcantidad.getText()), DataSistema.productos.get(i)));
					DataFacturas.factura.get(psosicion).agregarItem(DataSistema.item.get(DataSistema.item.size() - 1));
					System.out.println("---------------------------------------------");
				}

			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
