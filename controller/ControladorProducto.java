package controller;

import Proyecto_2_Codigo.DataSistema;
import Proyecto_2_Codigo.Producto;
import Proyecto_2_Codigo.TipoProducto;
import Proyecto_2_Codigo.Utilerias;
import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ControladorProducto {
	public TextField txtcodigo;
	public TextField txtnombre;
	public TextField txtdescripcion;
	public TextField txttp;
	public TextField txtstock;
	public TextField txtprecio;
	public TextArea txtagregado;
	

	public void agregarProducto(ActionEvent actionEvent) {
		
		System.out.println(DataSistema.productos.size());

		DataSistema.productos.add(new Producto(txtnombre.getText(),TipoProducto.PRODUCTOVARIOS, Integer.parseInt(txtstock.getText()), Double.parseDouble(txtprecio.getText())));
		System.out.println(DataSistema.productos.size());

		txtnombre.setText("");
		txtdescripcion.setText("");
		txttp.setText("");
		txtprecio.setText("");
		txttp.setText("");
		
		txtagregado.appendText("AGREGADO"+"\n");
		txtagregado.appendText(DataSistema.productos.get(DataSistema.productos.size()-1).toString());
		
		

	}
	
	
	public void buscarProducto(ActionEvent actionEvent) {
		
		try {

			for (int i = 0; i < DataSistema.productos.size(); i++) {

				int num = Integer.parseInt(txtcodigo.getText());

			

				
				if (num == DataSistema.productos.get(i).getIdProducto()) {
					

					

					System.out.println(DataSistema.productos.get(i).toString());
				}

				

			}

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
		

}
