package Proyecto_2_Codigo;

import java.util.ArrayList;

public class DataSistema {

	public static ArrayList<Cliente> clientes = new ArrayList<Cliente>(8) {
		{
			add(new Cliente_Individual("Edy", "Chay", "Lote 43", "208558775"));
			add(new Cliente_Individual("Daniel", "Valdez", "Lote 41", "20875815"));
			add(new Cliente_Individual("Juan", "Ramirez", "Secto 1", "205775"));
			add(new Cliente_Individual("Andrea Marielos", "Sandoval Colindres", "Col. los cipreces", "208558633"));
			add(new Cliente_Empresa("Producto del Aire", "S.A.", " Av. Petapa", "Alejandro Mango", 30));
			add(new Cliente_Empresa("Campello", "S.A.", " Av. Roosevelt", "Sandra Trup", 25));
			add(new Cliente_Empresa("Respuesto Chay", "S.A.", " Av. Centroamerica", "Edinso Chaykoskiv", 35));
			add(new Cliente_Empresa("CarroWahsi", "S.A.", " Av. Villa Linda", "Tito Felix", 30));

		}
	};
	
	
	public static ArrayList<Producto> productos = new ArrayList<Producto>(8) {
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
	
	
	public static ArrayList<ItemOrden> item = new ArrayList<ItemOrden>(8) {
		{
			add(new ItemOrden(1, 5, DataSistema.productos.get(0)));
			add(new ItemOrden(1, 7, DataSistema.productos.get(1)));
			add(new ItemOrden(1, 9, DataSistema.productos.get(2)));
			add(new ItemOrden(1, 3, DataSistema.productos.get(3)));
			add(new ItemOrden(1, 2, DataSistema.productos.get(4)));
			add(new ItemOrden(1, 15, DataSistema.productos.get(5)));
			add(new ItemOrden(1, 300, DataSistema.productos.get(6)));
			add(new ItemOrden(1, 1, DataSistema.productos.get(0)));

		

		}
	};
	
	
	
	
	
	
	

}
