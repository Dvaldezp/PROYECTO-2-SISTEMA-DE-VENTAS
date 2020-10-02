package Proyecto_2_Codigo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Esta clase guardara datos para la Factura, tanto como para individual Y empresa 
 * @author Edy Chay
 * @author Daniel Valdez
 *
 */
public class DataFacturas {

	/**
	 * Constructor para guardar todo tipo de facturas
	 * 
	 */
	
	public static Calendar c1 = GregorianCalendar.getInstance();
	/**
	 * Tomara la factura para luego imprimirla e indicar la hora que se realizo 
	 */

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
