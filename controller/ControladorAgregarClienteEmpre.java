package controller;

import Proyecto_2_Codigo.Cliente_Empresa;
import Proyecto_2_Codigo.DataSistema;
import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ControladorAgregarClienteEmpre {
	
	
	public TextField txtnombre;
	public TextField txtdireccion;
	public TextField txtcontacto;
	public TextField txtdescuento;
	public TextArea txtmostrar1;

	
	
	/**
	 * De igual manera le solicita al usuario que ingrese la informacion que se
	 * requiere para luego poder mostrarla
	 * 
	 * @param actionEvent
	 */

	public void agregarEmpre(ActionEvent actionEvent) {

		DataSistema.clientes.add(new Cliente_Empresa(txtnombre.getText(), "SA", txtdireccion.getText(),
				txtcontacto.getText(), Integer.parseInt(txtdescuento.getText())));

		System.out.println(DataSistema.clientes.get(DataSistema.clientes.size()-1));
		txtnombre.setText("");
		txtcontacto.setText("");
		txtdireccion.setText("");
		txtdescuento.setText("");
		txtmostrar1.appendText("AGREGADO" + "\n");
		txtmostrar1.appendText(DataSistema.clientes.get(DataSistema.clientes.size() - 1).toString());

	}


}
