package controller;

import Proyecto_2_Codigo.DataSistema;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class ControladorVerProducto {
	
	
	

	public void verTodoLosProductos(ActionEvent actionEvent) {

		try {

			for (int i = 0; i < DataSistema.productos.size(); i++) {

							

					System.out.println(DataSistema.productos.get(i).toString());
				}

			

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
