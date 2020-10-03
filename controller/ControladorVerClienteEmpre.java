package controller;

import Proyecto_2_Codigo.DataSistema;
import Proyecto_2_Codigo.Utilerias;
import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;

/**
 * ver cliente empresa
 * 
 * @author Edy Chay
 * @author Daniel Valdez
 *
 */
public class ControladorVerClienteEmpre {

	/**
	 * Controlador ver cliente empresa, nos permitira ver la imformacion de cliente
	 * empresa,cargara todos los clientes empresa
	 */

	public TextArea verDatos;

	public void cargarTabla(ActionEvent actionEvent) {

		try {
			String todo = "";
			for (int i = 0; i < DataSistema.clientes.size(); i++) {

				String nombre = Utilerias.getNombreClase(DataSistema.clientes.get(i).getClass());

				if (nombre.equals("Cliente_Empresa")) {

					todo = DataSistema.clientes.get(i).toString();
					verDatos.appendText(todo + "\n");

				}

			}

		} catch (Exception e) {
			// TODO: handle exception
		}

		// cierre del metodo

	}

}
