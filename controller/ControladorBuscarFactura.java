package controller;

import Proyecto_2_Codigo.DataFacturas;
import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ControladorBuscarFactura {

	public TextField txtcodi;
	public TextArea campo;
	

	/**
	 * Constructor que permitira la creacion de la factura
	 * 
	 * @param actionEvent
	 */

	public void buscar(ActionEvent actionEvent) {

		/**
		 * metodo que buscara los datos para luego imprimirlos en la factua
		 */
		try {
			boolean ver = false;
			
			for (int i = 0; i < DataFacturas.factura.size(); i++) {
				
				int num = Integer.parseInt(txtcodi.getText());

				if (num == DataFacturas.factura.get(i).getNumerodefactura()) {
					campo.setText("");
					campo.appendText(DataFacturas.factura.get(i).toString());
					ver = true;

				}

				

			}
			
			if (ver == false) {
				campo.setText("NO SE ENCONTRO FACTURA");
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
