package controller;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ControladorMenu {

	public void validarSalir(ActionEvent actionEvent) {
		Platform.exit();
		System.exit(0);

	}

	public void validarVerClienteI(ActionEvent actionEvent) {

		try {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("VerClientes.fxml"));
			Pane layout = (Pane) FXMLLoader.load(getClass().getResource("/view/VerClientes.fxml"));
			Stage stage = new Stage();

			ControladorVerCliente controlador = fxmlLoader.getController();

			Scene scene = new Scene(layout, 800, 600);
			stage.setTitle("Prueba");
			stage.setScene(scene);
			stage.show();

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public void validarModificarClienteE(ActionEvent actionEvent) {

		try {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ModificarClienteempresarial.fxml"));
			Pane layout = (Pane) FXMLLoader.load(getClass().getResource("/view/ModificarClienteempresarial.fxml"));
			Stage stage = new Stage();

			ControladorVerCliente controlador1 = fxmlLoader.getController();

			Scene scene = new Scene(layout, 800, 600);
			stage.setTitle("Prueba");
			stage.setScene(scene);
			stage.show();

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public void validarModificarClienteI(ActionEvent actionEvent) {

		try {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ModificarClienteindividual.fxml"));
			Pane layout = (Pane) FXMLLoader.load(getClass().getResource("/view/ModificarClienteindividual.fxml"));
			Stage stage = new Stage();

			ControladorVerCliente controlador1 = fxmlLoader.getController();

			Scene scene = new Scene(layout, 800, 600);
			stage.setTitle("Prueba");
			stage.setScene(scene);
			stage.show();

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public void validarVerClienteEmpre(ActionEvent actionEvent) {

		try {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("VerClientesempresa.fxml"));
			Pane layout = (Pane) FXMLLoader.load(getClass().getResource("/view/VerClientesempresa.fxml"));
			Stage stage = new Stage();

			ControladorVerCliente controlador1 = fxmlLoader.getController();

			Scene scene = new Scene(layout, 800, 600);
			stage.setTitle("Prueba");
			stage.setScene(scene);
			stage.show();

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public void validarEliminarClienteIndi(ActionEvent actionEvent) {

		try {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("EliminarClienteindividual.fxml"));
			Pane layout = (Pane) FXMLLoader.load(getClass().getResource("/view/EliminarClienteindividual.fxml"));
			Stage stage = new Stage();

			ControladorVerCliente controlador1 = fxmlLoader.getController();

			Scene scene = new Scene(layout, 800, 600);
			stage.setTitle("Prueba");
			stage.setScene(scene);
			stage.show();

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public void validarEliminarClienteEmpre(ActionEvent actionEvent) {

		try {

			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("EliminarClientedeempresa.fxml"));
			Pane layout = (Pane) FXMLLoader.load(getClass().getResource("/view/EliminarClientedeempresa.fxml"));
			Stage stage = new Stage();

			ControladorVerCliente controlador1 = fxmlLoader.getController();

			Scene scene = new Scene(layout, 800, 600);
			stage.setTitle("Prueba");
			stage.setScene(scene);
			stage.show();

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void buscarClienteIndi(ActionEvent actionEvent) {

		try {

			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("BuscarClientesindividuales.fxml"));
			Pane layout = (Pane) FXMLLoader.load(getClass().getResource("/view/BuscarClientesindividuales.fxml"));
			Stage stage = new Stage();

			ControladorVerCliente controlador1 = fxmlLoader.getController();

			Scene scene = new Scene(layout, 800, 600);
			stage.setTitle("Prueba");
			stage.setScene(scene);
			stage.show();

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public void buscarClienteEmpre(ActionEvent actionEvent) {

		try {

			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("BuscarClientesdeempresa.fxml"));
			Pane layout = (Pane) FXMLLoader.load(getClass().getResource("/view/BuscarClientesdeempresa.fxml"));
			Stage stage = new Stage();

			ControladorVerCliente controlador1 = fxmlLoader.getController();

			Scene scene = new Scene(layout, 800, 600);
			stage.setTitle("Prueba");
			stage.setScene(scene);
			stage.show();

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public void agregarClienteIndi(ActionEvent actionEvent) {

		try {

			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AgregarClienteindividual.fxml"));
			Pane layout = (Pane) FXMLLoader.load(getClass().getResource("/view/AgregarClienteindividual.fxml"));
			Stage stage = new Stage();

			ControladorVerCliente controlador1 = fxmlLoader.getController();

			Scene scene = new Scene(layout, 800, 600);
			stage.setTitle("Prueba");
			stage.setScene(scene);
			stage.show();

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public void agregarClienteEmpre(ActionEvent actionEvent) {

		try {

			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AgregarClientedeempresa.fxml"));
			Pane layout = (Pane) FXMLLoader.load(getClass().getResource("/view/AgregarClientedeempresa.fxml"));
			Stage stage = new Stage();

			ControladorVerCliente controlador1 = fxmlLoader.getController();

			Scene scene = new Scene(layout, 800, 600);
			stage.setTitle("Prueba");
			stage.setScene(scene);
			stage.show();

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public void agregarProducto(ActionEvent actionEvent) {

		try {

			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AgregarProducto.fxml"));
			Pane layout = (Pane) FXMLLoader.load(getClass().getResource("/view/AgregarProducto.fxml"));
			Stage stage = new Stage();

			ControladorVerCliente controlador1 = fxmlLoader.getController();

			Scene scene = new Scene(layout, 800, 600);
			stage.setTitle("Prueba");
			stage.setScene(scene);
			stage.show();

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public void buscarFactura(ActionEvent actionEvent) {

		try {

			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("BuscarFacturas.fxml"));
			Pane layout = (Pane) FXMLLoader.load(getClass().getResource("/view/BuscarFacturas.fxml"));
			Stage stage = new Stage();

			ControladorVerCliente controlador1 = fxmlLoader.getController();

			Scene scene = new Scene(layout, 800, 600);
			stage.setTitle("Prueba");
			stage.setScene(scene);
			stage.show();

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public void buscarProducto(ActionEvent actionEvent) {

		try {

			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("BuscarProducto.fxml"));
			Pane layout = (Pane) FXMLLoader.load(getClass().getResource("/view/BuscarProducto.fxml"));
			Stage stage = new Stage();

			ControladorVerCliente controlador1 = fxmlLoader.getController();

			Scene scene = new Scene(layout, 800, 600);
			stage.setTitle("Prueba");
			stage.setScene(scene);
			stage.show();

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public void crearFactura(ActionEvent actionEvent) {

		try {

			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("CrearFacturas.fxml"));
			Pane layout = (Pane) FXMLLoader.load(getClass().getResource("/view/CrearFacturas.fxml"));
			Stage stage = new Stage();

			ControladorVerCliente controlador1 = fxmlLoader.getController();

			Scene scene = new Scene(layout, 800, 600);
			stage.setTitle("Prueba");
			stage.setScene(scene);
			stage.show();

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public void eliminarProducto(ActionEvent actionEvent) {

		try {

			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("EliminarProducto.fxml"));
			Pane layout = (Pane) FXMLLoader.load(getClass().getResource("/view/EliminarProducto.fxml"));
			Stage stage = new Stage();

			ControladorVerCliente controlador1 = fxmlLoader.getController();

			Scene scene = new Scene(layout, 800, 600);
			stage.setTitle("Prueba");
			stage.setScene(scene);
			stage.show();

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public void historialCompra(ActionEvent actionEvent) {

		try {

			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Historialdecompra.fxml"));
			Pane layout = (Pane) FXMLLoader.load(getClass().getResource("/view/Historialdecompra.fxml"));
			Stage stage = new Stage();

			ControladorVerCliente controlador1 = fxmlLoader.getController();

			Scene scene = new Scene(layout, 800, 600);
			stage.setTitle("Prueba");
			stage.setScene(scene);
			stage.show();

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public void imprimirFactura(ActionEvent actionEvent) {

		try {

			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ImprimirFacturas.fxml"));
			Pane layout = (Pane) FXMLLoader.load(getClass().getResource("/view/ImprimirFacturas.fxml"));
			Stage stage = new Stage();

			ControladorVerCliente controlador1 = fxmlLoader.getController();

			Scene scene = new Scene(layout, 800, 600);
			stage.setTitle("Prueba");
			stage.setScene(scene);
			stage.show();

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public void ingresarFactura(ActionEvent actionEvent) {

		try {

			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("IngresarFactura.fxml"));
			Pane layout = (Pane) FXMLLoader.load(getClass().getResource("/view/IngresarFactura.fxml"));
			Stage stage = new Stage();

			ControladorVerCliente controlador1 = fxmlLoader.getController();

			Scene scene = new Scene(layout, 800, 600);
			stage.setTitle("Prueba");
			stage.setScene(scene);
			stage.show();

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public void realizarOC(ActionEvent actionEvent) {

		try {

			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("OrdendeCompra.fxml"));
			Pane layout = (Pane) FXMLLoader.load(getClass().getResource("/view/OrdendeCompra.fxml"));
			Stage stage = new Stage();

			ControladorVerCliente controlador1 = fxmlLoader.getController();

			Scene scene = new Scene(layout, 800, 600);
			stage.setTitle("Prueba");
			stage.setScene(scene);
			stage.show();

		} catch (Exception e) {
			// TODO: handle exception
		}

	}
	
	
	public void verfacturas(ActionEvent actionEvent) {

		try {

			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("VerFacturas.fxml"));
			Pane layout = (Pane) FXMLLoader.load(getClass().getResource("/view/VerFacturas.fxml"));
			Stage stage = new Stage();

			ControladorVerCliente controlador1 = fxmlLoader.getController();

			Scene scene = new Scene(layout, 800, 600);
			stage.setTitle("Prueba");
			stage.setScene(scene);
			stage.show();

		} catch (Exception e) {
			// TODO: handle exception
		}

	}
	
	
	public void verProducto(ActionEvent actionEvent) {

		try {

			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("VerProducto.fxml"));
			Pane layout = (Pane) FXMLLoader.load(getClass().getResource("/view/VerProducto.fxml"));
			Stage stage = new Stage();

			ControladorVerCliente controlador1 = fxmlLoader.getController();

			Scene scene = new Scene(layout, 800, 600);
			stage.setTitle("Prueba");
			stage.setScene(scene);
			stage.show();

		} catch (Exception e) {
			// TODO: handle exception
		}

	}
	
	

}
