package controller;

import Proyecto_2_Codigo.DataSistema;
import Proyecto_2_Codigo.Utilerias;
import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * Esta clase permite buscar el cliente empresa mediante el codigo
 * @author Edy Chay
 * @author Daniel Valdez
 *
 */
public class ControladorBuscarClienteEmpre {
	
	public TextField txtcodigo;
	public TextArea txtmostrar;
	
	/**
	 * Constructor que controla la busqueda del ciente empresa para que se pueda usar la informacion luego
	 * @param actionEvent
	 */
	
	public void buscar(ActionEvent actionEvent) {
		/**
		 * Este metodo realizara la busqueda del cliente para luego poder mostrarla
		 */
		try {
			boolean prueba = false;
			for (int i = 0; i < DataSistema.clientes.size(); i++) {

				int num = Integer.parseInt(txtcodigo.getText());

				String nombre = Utilerias.getNombreClase(DataSistema.clientes.get(i).getClass());

				System.out.println(nombre);
				if (num == DataSistema.clientes.get(i).getIdCliente()) {

					nombre = Utilerias.getNombreClase(DataSistema.clientes.get(i).getClass());

					if (nombre.equals("Cliente_Empresa")) {
						
						System.out.println(DataSistema.clientes.get(i).toString());
						txtmostrar.appendText(DataSistema.clientes.get(i).toString());
						
						prueba = true;
					}
					
					if (prueba == false) {
						txtmostrar.setText("");
					}

				}

			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
