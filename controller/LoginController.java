package controller;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import javax.swing.*;

public class LoginController extends Application {
  
	@Override
	public void start(Stage primaryStage) throws Exception {
		System.out.println(getClass().getResource("/view/Usuario.fxml"));
        Pane layout = (Pane) FXMLLoader.load(getClass().getResource("/view/Usuario.fxml"));
        
        Scene scene = new Scene(layout, 800, 600);
        primaryStage.setTitle("MENU");
        primaryStage.setScene(scene);
        primaryStage.show();

       
    }
		
	

	public TextField txtUsuario;
    public PasswordField txtContrasenia;

    public void validarIngreso(ActionEvent actionEvent) {
    	
    	

        if( txtUsuario.getText().equals("MOTO") && txtContrasenia.getText().equals("1234") ){
            //tiene acceso
            JOptionPane.showMessageDialog(null, "Ingreso Correcto");
             
            try{ 
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Login.fxml")); 
                Pane layout = (Pane) FXMLLoader.load(getClass().getResource("/view/Login.fxml"));
                Stage stage = new Stage(); 
                
                Scene scene = new Scene(layout, 800, 600);
                stage.setTitle("Prueba"); 
                stage.setScene(scene); 
                stage.show(); 
                }catch (Exception e) {
					// TODO: handle exception
				}
           
          
        }else{
            
            JOptionPane.showMessageDialog(null, "Acceso denegado", "Error",JOptionPane.ERROR_MESSAGE);
        }
    }

	

}
