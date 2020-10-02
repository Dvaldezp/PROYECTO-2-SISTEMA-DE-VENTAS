package controller;

import Proyecto_2_Codigo.DataSistema;
import Proyecto_2_Codigo.Utilerias;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class ControladorEliminarProducto {

	public TextField txtcodigo;

	public void eliminar(ActionEvent actionEvent) {

		try {

			for (int i = 0; i < DataSistema.productos.size(); i++) {

				int num = Integer.parseInt(txtcodigo.getText());

				if (num == DataSistema.productos.get(i).getIdProducto()) {

					DataSistema.productos.remove(i);

					txtcodigo.setText("PRODDUCTO ELIMINADO");
				}

			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
