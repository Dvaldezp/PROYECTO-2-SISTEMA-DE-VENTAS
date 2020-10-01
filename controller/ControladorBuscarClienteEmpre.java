package controller;

import Proyecto_2_Codigo.DataSistema;
import Proyecto_2_Codigo.Utilerias;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class ControladorBuscarClienteEmpre {
	
	public TextField txtcodigo;
	
	public void buscar(ActionEvent actionEvent) {

		try {

			for (int i = 0; i < DataSistema.clientes.size(); i++) {

				int num = Integer.parseInt(txtcodigo.getText());

				String nombre = Utilerias.getNombreClase(DataSistema.clientes.get(i).getClass());

				System.out.println(nombre);
				if (num == DataSistema.clientes.get(i).getIdCliente()) {

					nombre = Utilerias.getNombreClase(DataSistema.clientes.get(i).getClass());

					if (nombre.equals("Cliente_Empresa")) {
						
						System.out.println(DataSistema.clientes.get(i).toString());

					}

				}

			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
