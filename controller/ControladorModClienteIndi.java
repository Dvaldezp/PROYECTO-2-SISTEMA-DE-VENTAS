package controller;

import Proyecto_2_Codigo.DataSistema;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import Proyecto_2_Codigo.Utilerias;

/**
 * la clase modificar cliente individual
 * 
 * @author Edy Chay
 * @author Daniel Valdez
 *
 */
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

	/**
	 * contructor contralor modificar cliente individua, es el controlador de fxml,
	 * de modificar cliente individual ya que cuenta con botones de buscar cliente y
	 * modificar cliente
	 * 
	 * @param actionEvent
	 */

	public void buscarCliente(ActionEvent actionEvent) {
		/**
		 * buscar cliente, ingresamos datos a los testfield y esta al darle buscar
		 * cliente, busca dentro de los datos data sistema y al encontrarlos los settea
		 * e imprime lo que tiene el id ingresado
		 */
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
						apellido = DataSistema.clientes.get(i).getApellidoCliente();
						direccion = DataSistema.clientes.get(i).getDireccion();
						indi = DataSistema.clientes.get(i).getDpipadre();

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
		// cierre de metodo
	}

	public void modificaCliente(ActionEvent actionEvent) {

		/**
		 * meotodo modificar cliente al seleccinar modificar cliente, este imprime los
		 * datos en los textfiel y luego los settea y los imprime
		 */

		nombre1 = txtnombre.getText();
		apellido = txtapellido.getText();
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

						DataSistema.clientes.set(i, DataSistema.clientes.get(i));

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
		// cierre del metodo
	}

}
