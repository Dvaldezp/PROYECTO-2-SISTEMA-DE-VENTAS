package MainFX;

import Proyecto_2_Codigo.Cliente_Individual;
import controller.ControladorMenu;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class MainFX extends Application {

	public void start(Stage stage) throws Exception {
		System.out.println(getClass().getResource("/view/Usuario.fxml"));
		Pane layout = (Pane) FXMLLoader.load(getClass().getResource("/view/Usuario.fxml"));

		Scene scene = new Scene(layout, 800, 600);

		stage.setTitle("MENU");
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
	
	
	
	}
	
	
	
	

