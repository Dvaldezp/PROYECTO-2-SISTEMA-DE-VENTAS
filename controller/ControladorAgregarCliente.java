package controller;

import Proyecto_2_Codigo.Cliente_Empresa;
import Proyecto_2_Codigo.Cliente_Individual;
import Proyecto_2_Codigo.DataSistema;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class ControladorAgregarCliente {

	public TextField txtnombre;
	public TextField txtapellido;
	public TextField txtdireccion;
	public TextField txtdpi;
	public TextField txtcontacto;
	public TextField txtdescuento;

	public void agregar(ActionEvent actionEvent) {

		DataSistema.clientes.add(new Cliente_Individual(txtnombre.getText(), txtapellido.getText(),
				txtdireccion.getText(), txtdpi.getText()));

		txtnombre.setText("");
		txtapellido.setText("");
		txtdireccion.setText("");
		txtdpi.setText("");

	}
	
	
	public void agregar1(ActionEvent actionEvent) {

		DataSistema.clientes.add(new Cliente_Empresa(txtnombre.getText(),"SA", txtdireccion.getText(),txtcontacto.getText(),Integer.parseInt(txtdescuento.getText())));

		txtnombre.setText("");
		txtcontacto.setText("");
		txtdireccion.setText("");
		txtdescuento.setText("");

	}

}
