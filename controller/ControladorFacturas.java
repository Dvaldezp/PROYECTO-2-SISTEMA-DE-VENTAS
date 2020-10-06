
package controller;

import Proyecto_2_Codigo.Cliente;
import Proyecto_2_Codigo.DataFacturas;
import Proyecto_2_Codigo.DataSistema;
import Proyecto_2_Codigo.Facturacion;
import Proyecto_2_Codigo.Orden_de_Compra;
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

	public TableView tblCliente;
	public TableColumn tfCodigo;
	public TableColumn tfNombre;
	public TableColumn tfapellido;
	// public TableColumn tfdireccion;

	@FXML
	public void initialize() {

		tfNombre.setCellValueFactory(new PropertyValueFactory<Facturacion, String>("nombreCliente"));
		tfCodigo.setCellValueFactory(new PropertyValueFactory<Facturacion, Integer>("numeroDeFactura"));
		tfapellido.setCellValueFactory(new PropertyValueFactory<Facturacion, Double>("totalDeFacturacion"));
		// tfdireccion.setCellValueFactory(new PropertyValueFactory<Cliente,
		// String>("direccion"));
	}

	public void verfacturas(ActionEvent actionEvent) {

		try {

			/**
			 * Metodo que realizara la creacion de la factura
			 */

			ObservableList<Facturacion> data = FXCollections.observableArrayList(DataFacturas.factura);
			tblCliente.setItems(data);

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
