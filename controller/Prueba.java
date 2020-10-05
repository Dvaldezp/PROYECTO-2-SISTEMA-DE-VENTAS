package controller;

import Proyecto_2_Codigo.Cliente;
import Proyecto_2_Codigo.Cliente_Individual;
import Proyecto_2_Codigo.DataSistema;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javax.swing.*;

public class Prueba {
	public TableView tablaindi;
	public TableColumn idCodigo;
	public TableColumn nombreCliente;
	public TableColumn apellidoCliente;
	public TableColumn direccion;
	// public TableColumn cldpi;

	public Pane pane;

	public ObservableList<Cliente> getClientes() {
		ObservableList<Cliente> cliente = FXCollections.observableArrayList();
		cliente.add(new Cliente("ed", "ed", "lote"));

		return cliente;

	}

	@FXML
	public void initilize() {

		idCodigo.setCellValueFactory(new PropertyValueFactory<Cliente, Integer>("idCodigo"));
		nombreCliente.setCellValueFactory(new PropertyValueFactory<Cliente, String>("nombreCliente"));
		apellidoCliente.setCellValueFactory(new PropertyValueFactory<Cliente, String>("apellidoCliente"));
		direccion.setCellValueFactory(new PropertyValueFactory<Cliente, String>("direccion"));
		// cldpi.setCellValueFactory(new PropertyValueFactory<Cliente, String>("Dpi"));

	}

	public void cargarTabla(ActionEvent actionEvent) {
		try {

			ObservableList<Cliente> data = FXCollections.observableArrayList(DataSistema.clientes);
			

			System.out.println(data.toString());

			tablaindi.setItems(data);

			System.out.println(tablaindi.toString());

			pane.setVisible(true);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
