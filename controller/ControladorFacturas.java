package controller;

import Proyecto_2_Codigo.DataFacturas;
import Proyecto_2_Codigo.DataSistema;
import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ControladorFacturas {
	
	
	public TextField txtcodigo;
	public TextField txtcampo;
	

	public void buscar(ActionEvent actionEvent) {

		try {

			for (int i = 0; i < DataFacturas.factura.size(); i++) {

				int num = Integer.parseInt(txtcodigo.getText());

				if (num == DataFacturas.factura.get(i).getNumerodefactura()) {

					txtcampo.setText(DataFacturas.factura.get(i).toString());

				}

			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}
	
	
	public TextArea txtfacturas;
	public void verfacturas(ActionEvent actionEvent) {

		try {
				
			String todo="";
			for (int i = 0; i < DataFacturas.factura.size(); i++) {

				todo = DataFacturas.factura.get(i).toString();
				txtfacturas.appendText(todo+"\n");

					
				}

			

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	

}
