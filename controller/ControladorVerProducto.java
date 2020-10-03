package controller;

import com.sun.javafx.application.PlatformImpl;

import Proyecto_2_Codigo.DataSistema;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * Esta clase controlador nos permite ver el producto
 * 
 * @author Edy Chay
 * @author Daniel Valdez
 *
 */
public class ControladorVerProducto {

	public TextArea txtproducto;

	public void verTodoLosProductos(ActionEvent actionEvent) {

		try {

			String todo = "";

			for (int i = 0; i < DataSistema.productos.size(); i++) {

				todo = DataSistema.productos.get(i).toString();
				txtproducto.appendText(todo + "\n");

			}

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
