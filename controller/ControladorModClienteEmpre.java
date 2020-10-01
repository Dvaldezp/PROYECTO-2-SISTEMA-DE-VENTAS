package controller;

import Proyecto_2_Codigo.DataSistema;
import Proyecto_2_Codigo.Utilerias;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class ControladorModClienteEmpre {

	public TextField txtcodigo;
	public TextField txtnombre;
	public TextField txtdireccion;
	public TextField txtcontacto;// APELLIDO
	public TextField txtdesc;// dpi

	String nombre1;
	String contacto;
	String direccion;
	int descu;

	public void buscarCliente(ActionEvent actionEvent) {

		boolean prueba = false;
		try {

			for (int i = 0; i < DataSistema.clientes.size(); i++) {

				int num = Integer.parseInt(txtcodigo.getText());

				String nombre = Utilerias.getNombreClase(DataSistema.clientes.get(i).getClass());

				System.out.println(nombre);
				if (num == DataSistema.clientes.get(i).getIdCliente()) {

					nombre = Utilerias.getNombreClase(DataSistema.clientes.get(i).getClass());

					if (nombre.equals("Cliente_Empresa")) {
						nombre1 = DataSistema.clientes.get(i).getNombreCliente();
						contacto = DataSistema.clientes.get(i).getContactopadre();
						direccion = DataSistema.clientes.get(i).getDireccion();
						descu = DataSistema.clientes.get(i).getDescuentoEmpresaPadre();

						txtnombre.setText(nombre1);
						txtcontacto.setText(contacto);
						txtdireccion.setText(direccion);
						txtdesc.setText(Integer.toString(descu));

						prueba = true;

					}

				}

				if (prueba == false) {
					txtnombre.setText("");
					txtcontacto.setText("");
					txtdireccion.setText("");
					txtdesc.setText("");
				}

			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public void modificaCliente(ActionEvent actionEvent) {

		nombre1 = txtnombre.getText();
		contacto = txtcontacto.getText();
		direccion = txtdireccion.getText();
		descu = Integer.parseInt(txtdesc.getText());

		boolean prueba = false;
		try {
			System.out.println(descu);
			for (int i = 0; i < DataSistema.clientes.size(); i++) {
				int num = Integer.parseInt(txtcodigo.getText());

				String nombre = Utilerias.getNombreClase(DataSistema.clientes.get(i).getClass());

				if (num == DataSistema.clientes.get(i).getIdCliente()) {

					nombre = Utilerias.getNombreClase(DataSistema.clientes.get(i).getClass());
					if (nombre.equals("Cliente_Empresa")) {

						DataSistema.clientes.get(i).setNombreCliente(nombre1);
						DataSistema.clientes.get(i).setDContactopadre(contacto);
						DataSistema.clientes.get(i).setDireccion(direccion);
						DataSistema.clientes.get(i).setDescuentopadre(descu);

						DataSistema.clientes.set(i, DataSistema.clientes.get(i));

						System.out.println(DataSistema.clientes.get(i).toString());

						prueba = true;

					}

				}

				if (prueba == false) {
					txtnombre.setText("");
					txtcontacto.setText("");
					txtdireccion.setText("");
					txtdesc.setText("");
				}

			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
