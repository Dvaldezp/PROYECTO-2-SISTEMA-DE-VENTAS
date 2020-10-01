package Proyecto_2_Codigo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DataFacturas {

	public static Calendar c1 = GregorianCalendar.getInstance();

	public static ArrayList<Facturacion> factura = new ArrayList<Facturacion>(8) {

		{
			add(new Facturacion(c1.getTime(), DataSistema.clientes.get(0)));
			add(new Facturacion(c1.getTime(), DataSistema.clientes.get(1)));
			add(new Facturacion(c1.getTime(), DataSistema.clientes.get(2)));
			add(new Facturacion(c1.getTime(), DataSistema.clientes.get(3)));
			add(new Facturacion(c1.getTime(), DataSistema.clientes.get(4)));
			add(new Facturacion(c1.getTime(), DataSistema.clientes.get(5)));
			add(new Facturacion(c1.getTime(), DataSistema.clientes.get(6)));
			add(new Facturacion(c1.getTime(), DataSistema.clientes.get(7)));

		}
	};

}
