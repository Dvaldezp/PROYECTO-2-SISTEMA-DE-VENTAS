package controller;

import Proyecto_2_Codigo.DataSistema;
import Proyecto_2_Codigo.Utilerias;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
/**
 * Esta clase permite buscar el cliente individual mediante el codigo
 * @author Edy Chay
 * @author Daniel Valdez
 *
 */
public class ControladorBuscarClienteIndi {
	
	public TextField txtcodigo;
	
	/**
	 * Constructor que controla la busqueda del ciente individual para que se pueda usar la informacion luego
	 * @param actionEvent
	 */
	
	public void buscar(ActionEvent actionEvent) {
		
		/**
		 * Este metodo realizara la busqueda del cliente para luego poder mostrarla
		 */
		
		try {

			for (int i = 0; i < DataSistema.clientes.size(); i++) {

				int num = Integer.parseInt(txtcodigo.getText());

				String nombre = Utilerias.getNombreClase(DataSistema.clientes.get(i).getClass());

				System.out.println(nombre);
				if (num == DataSistema.clientes.get(i).getIdCliente()) {

					nombre = Utilerias.getNombreClase(DataSistema.clientes.get(i).getClass());

					if (nombre.equals("Cliente_Individual")) {
						
					System.out.println(DataSistema.clientes.get(i).toString());
					}

				}

				

			}

		} catch (Exception e) {
			// TODO: handle exception
		}

		
		
		

	}
	

}
