package controller;

import Proyecto_2_Codigo.DataSistema;
import Proyecto_2_Codigo.Utilerias;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class ControladorEliminarClienteIndi {
	
	
	public TextField txtcodigo;

	public void buscar(ActionEvent actionEvent) {
		
		try {

			for (int i = 0; i < DataSistema.clientes.size(); i++) {

				int num = Integer.parseInt(txtcodigo.getText());

				String nombre = Utilerias.getNombreClase(DataSistema.clientes.get(i).getClass());

				System.out.println(nombre);
				if (num == DataSistema.clientes.get(i).getIdCliente()) {

					nombre = Utilerias.getNombreClase(DataSistema.clientes.get(i).getClass());

					if (nombre.equals("Cliente_Individual")) {
						
					System.out.println("llllllllll");
					}

				}

				

			}

		} catch (Exception e) {
			// TODO: handle exception
		}

		
		
		

	}

	public void eliminar(ActionEvent actionEvent) {
		
		
		try {

			for (int i = 0; i < DataSistema.clientes.size(); i++) {

				int num = Integer.parseInt(txtcodigo.getText());

				String nombre = Utilerias.getNombreClase(DataSistema.clientes.get(i).getClass());

				System.out.println(nombre);
				if (num == DataSistema.clientes.get(i).getIdCliente()) {

					nombre = Utilerias.getNombreClase(DataSistema.clientes.get(i).getClass());

					if (nombre.equals("Cliente_Individual")) {
						
						DataSistema.clientes.remove(i);
					}

				}

				

			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
