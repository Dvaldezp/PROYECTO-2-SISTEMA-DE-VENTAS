package controller;

import java.util.Calendar;
import java.util.GregorianCalendar;

import Proyecto_2_Codigo.DataFacturas;
import Proyecto_2_Codigo.DataSistema;
import Proyecto_2_Codigo.Facturacion;
import Proyecto_2_Codigo.ItemOrden;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class ControladorCrearFactura {

	public TextField txtcodig;
	public TextField txtcodpro;
	public TextField txtcantidad;
	public static int psosicion;

	public void agregarCliente(ActionEvent actionEvent) {
		Calendar c1 = GregorianCalendar.getInstance();

		try {
			for (int i = 0; i < DataSistema.clientes.size(); i++) {
				
				int num1 = Integer.parseInt(txtcodig.getText());

				if (num1 == DataSistema.clientes.get(i).getIdCliente()) {
					DataFacturas.factura.add(new Facturacion(c1.getTime(), DataSistema.clientes.get(i)));
					ControladorCrearFactura.psosicion = DataFacturas.factura.size()-1;
					System.out.println("hola");
				}

			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public void facturar(ActionEvent actionEvent) {

		try {
			DataFacturas.factura.get(ControladorCrearFactura.psosicion);
			System.out.println("SSSSSSSSSSS");
			
			System.out.println(DataFacturas.factura.get(psosicion).toString());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void agregarItems(ActionEvent actionEvent) {

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
