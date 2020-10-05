package controller;

import Proyecto_2_Codigo.Cliente;
import Proyecto_2_Codigo.Cliente_Individual;
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

public class ControladorVerCliente {

	public TextArea verDato;
	
	public TableView tblCliente;
	public TableColumn tfCodigo;
	public TableColumn tfNombre;
	public TableColumn tfapellido;
	public TableColumn tfdireccion;
	public TableColumn tfdpi;
	
	
	public void initialize() {

		tfCodigo.setCellValueFactory(new PropertyValueFactory<Cliente_Individual, Integer>("idCliente"));
		tfNombre.setCellValueFactory(new PropertyValueFactory<Cliente_Individual, String>("nombreCliente"));
		tfapellido.setCellValueFactory(new PropertyValueFactory<Cliente_Individual, String>("apellidoCliente"));
		tfdireccion.setCellValueFactory(new PropertyValueFactory<Cliente_Individual, String>("direccion"));
		tfdpi.setCellValueFactory(new PropertyValueFactory<Cliente_Individual, String>("dpi"));
		
	}
	
	

	public void cargarTabla(ActionEvent actionEvent) {

		try {
			
			ObservableList<Cliente_Individual> data = FXCollections.observableArrayList();
			String todo = "";
			for (int i = 0; i < DataSistema.clientes.size(); i++) {
				
				String nombre = Utilerias.getNombreClase(DataSistema.clientes.get(i).getClass());

				if (nombre.equals("Cliente_Individual")) {
					data.add((Cliente_Individual) DataSistema.clientes.get(i));
					
					
				}

			}

			tblCliente.setItems(data);

		} catch (Exception e) {
			// TODO: handle exception
		}

		

	}

}
