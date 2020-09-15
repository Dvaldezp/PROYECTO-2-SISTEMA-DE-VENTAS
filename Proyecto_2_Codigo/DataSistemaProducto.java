package Proyecto_2_Codigo;

import java.util.ArrayList;

public class DataSistemaProducto {

	public static ArrayList<Producto> producto = new ArrayList<Producto>(8) {
		{

			add(new Producto("Bujia Iridium", 23.50));
			add(new Producto("Bomba de Gasolina", 85.50));
			add(new Producto("Punta de cremallera", 500.00));
			add(new Producto("Bocina para moto", 101.50));
			add(new Producto("Disco de Freno", 400.00));
			add(new Producto("Rotula", 175.75));
			add(new Producto("Buje", 12.50));
			add(new Producto("Fullset ", 300.58));

		}
	};

}
