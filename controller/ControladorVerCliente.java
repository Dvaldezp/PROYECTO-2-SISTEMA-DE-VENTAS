package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import java.net.URL;
import java.util.ResourceBundle;
import Proyecto_2_Codigo.Cliente;
import Proyecto_2_Codigo.Cliente_Individual;
import Proyecto_2_Codigo.DataSistema;

public class ControladorVerCliente {

	/*private TableView<Cliente_Individual> tablaindi;
	private TableColumn clcodigo;
	private TableColumn clnombre;
	private TableColumn clapellido;
	private TableColumn cldireccion;
	private TableColumn cldpi;
	private ObservableList<Cliente_Individual> cliente = FXCollections.observableArrayList();

	@Override
	public void initialize(URL location, ResourceBundle rb) {
		// TODO Auto-generated method stub
		cliente = FXCollections.observableArrayList();
		this.clcodigo.setCellFactory(new PropertyValueFactory("Codigo"));
		this.clnombre.setCellFactory(new PropertyValueFactory("Nombre"));
		this.clapellido.setCellFactory(new PropertyValueFactory("Apellido"));
		this.cldireccion.setCellFactory(new PropertyValueFactory("Direccion"));
		this.cldpi.setCellFactory(new PropertyValueFactory("Dpi"));

	}*/

	public void validarIndividual(ActionEvent actionEvent) {

		try {
			

			/*Cliente_Individual cl=new Cliente_Individual("hola", "hola", "hola", "hola");
			this.cliente.add(cl);
			this.tablaindi.setItems(cliente);
			System.out.println("holaaa");*/

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public void validarEmpresa(ActionEvent actionEvent) {

	}

	public void validarRegreso(ActionEvent actionEvent) {

		try {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Menu.fxml"));
			Parent layout = (Pane) FXMLLoader.load(getClass().getResource("/view/Menu.fxml"));

			ControladorMenu controlador = fxmlLoader.getController();

			Scene scene = new Scene(layout, 800, 600);

			Stage stage = new Stage();
			stage.setScene(scene);
			stage.show();

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
