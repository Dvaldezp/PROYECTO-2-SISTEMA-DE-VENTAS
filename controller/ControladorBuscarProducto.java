package controller;

import Proyecto_2_Codigo.DataSistema;
import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ControladorBuscarProducto {
	
	public TextArea txtagregado;
	public TextField txtcodigo;
	
	

	public void buscarProducto(ActionEvent actionEvent) {
		
		try {txtagregado.setText("");

			for (int i = 0; i < DataSistema.productos.size(); i++) {

				int num = Integer.parseInt(txtcodigo.getText());

			

				
				if (num == DataSistema.productos.get(i).getIdProducto()) {
					txtagregado.setText("");

					txtagregado.appendText("ESTE ES EL PRODUCTO QUE INGRESO PARA VER"+"\n");
					txtagregado.appendText(DataSistema.productos.get(i).toString());

					System.out.println(DataSistema.productos.get(i).toString());
				}

				

			}

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
