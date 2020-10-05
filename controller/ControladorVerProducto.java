package controller;

import com.sun.javafx.application.PlatformImpl;

import Proyecto_2_Codigo.Cliente;
import Proyecto_2_Codigo.DataSistema;
import Proyecto_2_Codigo.Producto;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class ControladorVerProducto {
	
	public TextArea txtproducto;
	
	
	public TableView tblCliente;
	public TableColumn tfCodigo;
	public TableColumn tfNombre;
	public TableColumn tfCantidad;
	public TableColumn tfPrecio;
	
	@FXML
	public void initialize() {
		tfCodigo.setCellValueFactory(new PropertyValueFactory<Producto, Integer>("idProducto"));
		tfNombre.setCellValueFactory(new PropertyValueFactory<Producto, String>("nombreProducto"));
		tfCantidad.setCellValueFactory(new PropertyValueFactory<Producto, Integer>("cantidadInventario"));
		tfPrecio.setCellValueFactory(new PropertyValueFactory<Producto, Double>("precio"));
	}
	
	
	

	public void verTodoLosProductos(ActionEvent actionEvent) {

		try {
			
			

			
			ObservableList<Producto> data = FXCollections.observableArrayList(DataSistema.productos);
			tblCliente.setItems(data);
			

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	


}
