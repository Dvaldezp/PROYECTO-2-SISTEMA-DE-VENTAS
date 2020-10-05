package controller;

import Proyecto_2_Codigo.DataSistema;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import Proyecto_2_Codigo.Utilerias;


public class ControladorModClienteIndi {

	public TextField txtcodigo;
	public TextField txtnombre;
	public TextField txtapellido;
	public TextField txtdireccion;
	public TextField txtdpi;
	
	String nombre1;
	String apellido;
	String direccion;
	String indi;

	public void buscarCliente(ActionEvent actionEvent) {

		boolean prueba = false;
		try {

			for (int i = 0; i < DataSistema.clientes.size(); i++) {
				
				int num = Integer.parseInt(txtcodigo.getText());
				
				String nombre = Utilerias.getNombreClase(DataSistema.clientes.get(i).getClass());
				
				System.out.println(nombre);
				if (num == DataSistema.clientes.get(i).getIdCliente()) {
					
					nombre = Utilerias.getNombreClase(DataSistema.clientes.get(i).getClass());
					
					if (nombre.equals("Cliente_Individual")) {
						nombre1 = DataSistema.clientes.get(i).getNombreCliente();
						apellido= DataSistema.clientes.get(i).getApellidoCliente();
						direccion = DataSistema.clientes.get(i).getDireccion();
						indi=DataSistema.clientes.get(i).getDpipadre();

						txtnombre.setText(nombre1);
						txtapellido.setText(apellido);
						txtdireccion.setText(direccion);
						txtdpi.setText(indi);

						prueba = true;

					}

				}
				
				if (prueba == false) {
					txtnombre.setText("");
					txtapellido.setText("");
					txtdireccion.setText("");
					txtdpi.setText("");
				}
				
				
			}
				

			

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public void modificaCliente(ActionEvent actionEvent) {
		
		nombre1 = txtnombre.getText();
		apellido= txtapellido.getText();
		direccion = txtdireccion.getText();
		indi = txtdpi.getText();
		
		
		
		boolean prueba = false;
		try {
			
			for (int i = 0; i < DataSistema.clientes.size(); i++) {
				int num = Integer.parseInt(txtcodigo.getText());
				
				if (num == DataSistema.clientes.get(i).getIdCliente()) {
					
					String nombre = Utilerias.getNombreClase(DataSistema.clientes.get(i).getClass());
					if (nombre.equals("Cliente_Individual")) {
						
						
						DataSistema.clientes.get(i).setNombreCliente(nombre1);
						DataSistema.clientes.get(i).setApellidoCliente(apellido);
						DataSistema.clientes.get(i).setDireccion(direccion);
						DataSistema.clientes.get(i).setDpipadre(indi);
						
						
						DataSistema.clientes.set(i,DataSistema.clientes.get(i));
						
						System.out.println(DataSistema.clientes.get(i).toString());

						prueba = true;

					}

				}
				
				if (prueba == false) {

					txtnombre.setText("");
					txtapellido.setText("");
					txtdireccion.setText("");
					txtdpi.setText("");
				}
				
				
				
			}

				

			

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
