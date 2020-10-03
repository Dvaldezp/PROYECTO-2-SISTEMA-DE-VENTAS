package controller;

import Proyecto_2_Codigo.DataSistema;
import Proyecto_2_Codigo.Utilerias;
import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * Esta clase permitira eliminar a un cliente de empresa
 * 
 * @author Edy Chay
 * @author Daniel Valdez
 *
 */

public class ControladorEliminarClienteEmpre {

	public TextField txtcodigo;
	public TextArea txtmostrar;

	/**
	 * Constructor que eliminara al cliente seleccionado
	 * 
	 * @param actionEvent
	 */
	public void buscar(ActionEvent actionEvent) {

		/**
		 * Metodo que buscara al cliente empresa para poder eliminarlo
		 */

		try {

			for (int i = 0; i < DataSistema.clientes.size(); i++) {

				int num = Integer.parseInt(txtcodigo.getText());

				String nombre = Utilerias.getNombreClase(DataSistema.clientes.get(i).getClass());

				System.out.println(nombre);
				if (num == DataSistema.clientes.get(i).getIdCliente()) {

					nombre = Utilerias.getNombreClase(DataSistema.clientes.get(i).getClass());

					if (nombre.equals("Cliente_Empresa")) {
						txtmostrar.appendText(DataSistema.clientes.get(i).toString());

					}

				}

			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public void eliminar(ActionEvent actionEvent) {
		/**
		 * eliminara al cliente mediante un codigo para saber cual eliminar
		 */

		try {

			for (int i = 0; i < DataSistema.clientes.size(); i++) {

				int num = Integer.parseInt(txtcodigo.getText());

				String nombre = Utilerias.getNombreClase(DataSistema.clientes.get(i).getClass());

				System.out.println(nombre);
				if (num == DataSistema.clientes.get(i).getIdCliente()) {

					nombre = Utilerias.getNombreClase(DataSistema.clientes.get(i).getClass());

					if (nombre.equals("Cliente_Empresa")) {

						DataSistema.clientes.remove(i);
						txtmostrar.setText("ELIMINADO");
					}

				}

			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
