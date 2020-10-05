package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import javax.swing.*;

import Proyecto_2_Codigo.Cliente;
import Proyecto_2_Codigo.DataSistema;

public class ControladorVerTodosClientes {
	public MenuBar menu;

	public TableView tblCliente;
	public TableColumn tfCodigo;
	public TableColumn tfNombre;
	public TableColumn tfapellido;
	public TableColumn tfdireccion;
	public Pane paneCarrera;

	@FXML
	public void initialize() {
		tfCodigo.setCellValueFactory(new PropertyValueFactory<Cliente, Integer>("idCliente"));
		tfNombre.setCellValueFactory(new PropertyValueFactory<Cliente, String>("nombreCliente"));
		tfapellido.setCellValueFactory(new PropertyValueFactory<Cliente, String>("apellidoCliente"));
		tfdireccion.setCellValueFactory(new PropertyValueFactory<Cliente, String>("direccion"));
	}

	public void close(ActionEvent actionEvent) {
		// get a handle to the stage
		Stage stage = (Stage) menu.getScene().getWindow();
		// do what you have to do
		stage.close();
	}

	public void cargarDatos(ActionEvent actionEvent) {
		try {
			// VariablesGlobales.u1.addCarrera(new Carrera(txtNombreCarrera.getText()));

			ObservableList<Cliente> data = FXCollections.observableArrayList(DataSistema.clientes);
			tblCliente.setItems(data);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void showCarrera(ActionEvent actionEvent) {
		paneCarrera.setVisible(true);
	}
}
