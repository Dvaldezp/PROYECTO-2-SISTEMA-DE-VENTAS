package Proyecto_2_Codigo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * esta clase menu, es el principal que se encarga de mostrar el menu 
 * @author Edy Chay 
 * @author Daniel Valdez
 *
 */
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
	/**
	 * Constructor para mostar el menu principal 
	 * @param args
	 */
	
	public static void main(String[] args) {
		launch(args);
	}

}
