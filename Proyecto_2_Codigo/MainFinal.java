package Proyecto_2_Codigo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class MainFinal extends Application{
	
	@Override
	public void start(Stage stage) throws Exception {
		
		System.out.println(getClass().getResource("/view/Ventana1.fxml"));
		Pane layout = (Pane) FXMLLoader.load(getClass().getResource("/view/Ventana1.fxml"));
		Scene scene = new Scene(layout, 600, 600);

		stage.setTitle("Mi UMG");
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
