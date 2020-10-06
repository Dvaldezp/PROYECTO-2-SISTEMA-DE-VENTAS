package controller;

import Proyecto_2_Codigo.Cliente_Empresa;
import Proyecto_2_Codigo.Cliente_Individual;
import Proyecto_2_Codigo.DataSistema;

import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * Esta clase controlara la parte grafica para poder inprimir toda la
 * informacion que se agregara del cliente
 * 
 * @author Edy Chay
 * @author Daniel Valdez
 *
 */
public class ControladorAgregarCliente {

	public TextField txtnombre;
	public TextField txtapellido;
	public TextField txtdireccion;
	public TextField txtdpi;
	public TextField txtcontacto;
	public TextField txtdescuento;
	public TextArea txtmostrar;

	/**
	 * Se estara agregando la informacion necesaria para luego poder imprimirla
	 * 
	 * @param actionEvent
	 */

	public void agregar(ActionEvent actionEvent) {

		DataSistema.clientes.add(new Cliente_Individual(txtnombre.getText(), txtapellido.getText(),
				txtdireccion.getText(), txtdpi.getText()));

		txtnombre.setText("");
		txtapellido.setText("");
		txtdireccion.setText("");
		txtdpi.setText("");

		txtmostrar.appendText("AGREGADO" + "\n");
		txtmostrar.appendText(DataSistema.clientes.get(DataSistema.clientes.size() - 1).toString());

	}

	
}
