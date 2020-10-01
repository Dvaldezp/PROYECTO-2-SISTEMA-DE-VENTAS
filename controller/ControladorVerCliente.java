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


public class ControladorVerCliente {
	
	
	public TableColumn clnombre;
	public TableColumn clapellido;
	public TableColumn cldireccion;
	public TableColumn cldpi;
	public TableView<Cliente_Individual> tablaindi;

	@FXML
	public void initilize() {
		
		clnombre.setCellFactory(new PropertyValueFactory<Cliente_Individual, String>("nombreCLiente"));
		clapellido.setCellFactory(new PropertyValueFactory<Cliente_Individual, String>("apellidoCliente"));
		cldireccion.setCellFactory(new PropertyValueFactory<Cliente_Individual,String>("direccion"));
		cldpi.setCellFactory(new PropertyValueFactory<Cliente_Individual, String>("dpi"));
	}


	public void cargarTabla(ActionEvent actionEvent) {
		
		
		try {
				String nombreCLiente="siiiiiii";
				String Apellido="siiiiiii";
				String Direccion="siiiiiii";
				String Dpi="siiiiiii";
				
				ObservableList<Cliente_Individual> datos=FXCollections.observableArrayList(new Cliente_Individual(nombreCLiente, Apellido,Direccion, Dpi));
				datos.add(new Cliente_Individual("sss", "dd", "sss", "sss"));
				tablaindi.setItems(datos);
				System.out.println(tablaindi.toString());
				tablaindi.setId(datos.toString());
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}


	}
	
	

}
