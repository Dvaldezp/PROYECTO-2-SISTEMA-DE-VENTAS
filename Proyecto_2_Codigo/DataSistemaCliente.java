package Proyecto_2_Codigo;

import java.util.ArrayList;

public class DataSistemaCliente {

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

}
