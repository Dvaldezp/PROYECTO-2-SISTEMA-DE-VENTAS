package controller;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.PasswordField;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import javax.swing.*;

public class LoginController extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

	}

	public TextField txtUsuario;
	public PasswordField txtContrasenia;

	public void validarIngreso(ActionEvent actionEvent) {

		if (txtUsuario.getText().equals("1") && txtContrasenia.getText().equals("1")) {
			// tiene acceso
			JOptionPane.showMessageDialog(null, "Ingreso Correcto");

			try {
				FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Menu.fxml"));
				Parent layout = (Pane) FXMLLoader.load(getClass().getResource("/view/Menu.fxml"));

				ControladorMenu controlador = fxmlLoader.getController();

				Scene scene = new Scene(layout, 900, 700);

				Stage stage = new Stage();
				stage.setScene(scene);
				stage.show();

			} catch (Exception e) {
				// TODO: handle exception
			}

		} else {

			JOptionPane.showMessageDialog(null, "Acceso denegado", "Error", JOptionPane.ERROR_MESSAGE);
		}

	}

}
