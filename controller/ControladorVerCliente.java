package controller;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ControladorVerCliente {

	public void validarIngreso(ActionEvent actionEvent) {

		try {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("VerClientes.fxml"));
			Pane layout = (Pane) FXMLLoader.load(getClass().getResource("/view/VerClientes.fxml"));
			Stage stage = new Stage();

			Scene scene = new Scene(layout, 800, 600);
			stage.setTitle("Prueba");
			stage.setScene(scene);
			stage.show();

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	
	
}
