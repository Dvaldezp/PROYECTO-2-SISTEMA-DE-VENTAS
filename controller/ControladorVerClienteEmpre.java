package controller;

import Proyecto_2_Codigo.DataFacturas;
import Proyecto_2_Codigo.DataSistema;
import Proyecto_2_Codigo.Cliente_Empresa;
import Proyecto_2_Codigo.Utilerias;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;

public class ControladorVerClienteEmpre {

	
	public TableView tblCliente;
	public TableColumn tfCodigo;
	public TableColumn tfNombre;
	public TableColumn tfapellido;
	public TableColumn tfdireccion;
	public TableColumn tfcontacto;
	public TableColumn tfdescuento;
	// public TableColumn tfdireccion;

	public void initialize() {

		tfCodigo.setCellValueFactory(new PropertyValueFactory<Cliente_Empresa, Integer>("idCliente"));
		tfNombre.setCellValueFactory(new PropertyValueFactory<Cliente_Empresa, String>("nombreCliente"));
		tfapellido.setCellValueFactory(new PropertyValueFactory<Cliente_Empresa, String>("apellidoCliente"));
		tfdireccion.setCellValueFactory(new PropertyValueFactory<Cliente_Empresa, String>("direccion"));
		tfcontacto.setCellValueFactory(new PropertyValueFactory<Cliente_Empresa, String>("contacto"));
		tfdescuento.setCellValueFactory(new PropertyValueFactory<Cliente_Empresa, Integer>("descuentoEmpresa"));

		// tfdireccion.setCellValueFactory(new PropertyValueFactory<Cliente,
		// String>("direccion"));
	}

	public void cargarTabla(ActionEvent actionEvent) {

		try {

			ObservableList<Cliente_Empresa> data = FXCollections.observableArrayList();

			for (int i = 0; i < DataSistema.clientes.size(); i++) {

				String nombre = Utilerias.getNombreClase(DataSistema.clientes.get(i).getClass());

				if (nombre.equals("Cliente_Empresa")) {
					data.add((Cliente_Empresa) DataSistema.clientes.get(i));

				}

			}
			tblCliente.setItems(data);

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
