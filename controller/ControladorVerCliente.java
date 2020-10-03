package controller;

import Proyecto_2_Codigo.Cliente;
import Proyecto_2_Codigo.Cliente_Individual;
import Proyecto_2_Codigo.DataSistema;
import Proyecto_2_Codigo.Utilerias;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
/**
 * Esta clase controlador ver cliente 
 * @author Edy Chay
 * @author Daniel Valdez
 *
 */
public class ControladorVerCliente {

	public TextArea verDato;
	
	/**
	 * controlador ver cliente, al dar click al boton mostrara los datos del cliente 
	 * @param actionEvent
	 */

	public void cargarTabla(ActionEvent actionEvent) {

		try {
			String todo = "";
			for (int i = 0; i < DataSistema.clientes.size(); i++) {
				System.out.println("SSSSS");
				String nombre = Utilerias.getNombreClase(DataSistema.clientes.get(i).getClass());

				if (nombre.equals("Cliente_Individual")) {

					todo = DataSistema.clientes.get(i).toString();
					verDato.appendText(todo+"\n");
					
					
				}

			}

			

		} catch (Exception e) {
			// TODO: handle exception
		}

		

	}

}
