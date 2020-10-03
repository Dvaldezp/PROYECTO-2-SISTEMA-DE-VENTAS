
package controller;

import Proyecto_2_Codigo.DataFacturas;
import Proyecto_2_Codigo.DataSistema;
import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * @author Edy Chay
 * @author Daniel Valdez
 *
 */
public class ControladorFacturas {

	public TextField txtcodigo;
	

	/**
	 * Constructor que permitira la creacion de la factura
	 * 
	 * @param actionEvent
	 */

	

	public TextArea txtfacturas;

	public void verfacturas(ActionEvent actionEvent) {

		try {

			/**
			 * Metodo que realizara la creacion de la factura
			 */
			String todo = "";
			for (int i = 0; i < DataFacturas.factura.size(); i++) {

				todo = DataFacturas.factura.get(i).toString();
				txtfacturas.appendText(todo + "\n");

			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
