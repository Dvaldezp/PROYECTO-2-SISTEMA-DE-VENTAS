package controller;

import Proyecto_2_Codigo.DataSistema;
import Proyecto_2_Codigo.Utilerias;
import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * Clase que eliminara al cliente individual
 * 
 * @author Edy Chay
 * @author Daniel Valdez
 *
 */
public class ControladorEliminarClienteIndi {

	public TextField txtcodigo;
	public TextArea txtmostrar;

	/**
	 * Constructor que buscara al cliente individual para poder eliminarlo
	 * 
	 * @param actionEvent
	 */

	public void buscar(ActionEvent actionEvent) {
		/**
		 * metodo que buscara al cliente individual para poder eliminarlo
		 */
		try {
			boolean prueba = false;
			for (int i = 0; i < DataSistema.clientes.size(); i++) {

				int num = Integer.parseInt(txtcodigo.getText());

				String nombre = Utilerias.getNombreClase(DataSistema.clientes.get(i).getClass());

				System.out.println(nombre);
				if (num == DataSistema.clientes.get(i).getIdCliente()) {

					nombre = Utilerias.getNombreClase(DataSistema.clientes.get(i).getClass());

					if (nombre.equals("Cliente_Individual")) {

						txtmostrar.appendText(DataSistema.clientes.get(i).toString());

						System.out.println("llllllllll");

						prueba = true;
					}
					// cierre del metodo
					
					
					if (prueba == false) {
						txtmostrar.setText("");
					}
				}

			}

			

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public void eliminar(ActionEvent actionEvent) {

		/**
		 * Metodo que eliminara al cleinte individual
		 */
		try {

			for (int i = 0; i < DataSistema.clientes.size(); i++) {

				int num = Integer.parseInt(txtcodigo.getText());

				String nombre = Utilerias.getNombreClase(DataSistema.clientes.get(i).getClass());

				System.out.println(nombre);

				if (num == DataSistema.clientes.get(i).getIdCliente()) {

					nombre = Utilerias.getNombreClase(DataSistema.clientes.get(i).getClass());

					if (nombre.equals("Cliente_Individual")) {

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
