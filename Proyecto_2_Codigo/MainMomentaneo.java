package Proyecto_2_Codigo;

import java.util.ArrayList;
import java.util.Date;

import javafx.scene.chart.PieChart.Data;

public class MainMomentaneo {

	public static void main(String[] args) {

		/*
		 * Cliente eCliente =new Cliente("Edy","Chay","Lote 40");
		 * 
		 * Cliente eCliente1 =new Cliente("Edy","Chay","Lote 40");
		 * 
		 * System.out.println(eCliente.toString()+ eCliente1.toString());
		 */

		Cliente_Individual eCliente = new Cliente_Individual("Edy", "Chay", "Lote 40", "556563566");

		Cliente_Empresa eCliente1 = new Cliente_Empresa("Edy", "Chay", "Lote 40", "Juan", 1);

		Producto product = new Producto("Bujia", TipoProducto.BUJIAS, 75, 50.50);

		////////////////////////////////////////////

		System.out.println("Cliente");

		System.out.println(eCliente.toString() + "\n" + eCliente1.toString());

		System.out.println(DataSistema.clientes.get(5));

		System.out.println(Utilerias.getNombreClase(eCliente.getClass()));

		System.out.println("");

		/////////////////////////////////////////////
		System.out.println("Producto");

		System.out.println(product.toString());

		System.out.println(DataSistema.productos.get(5));

		System.out.println("");

		///////////////////////////////////////////////
		System.out.println("Orden");

		OrdenDeVenta ov = new OrdenDeVenta();

		Date fechaorden = new Date(2020, 9, 12);

		OrdenDeVenta ovf = new OrdenDeVenta(fechaorden, eCliente);
		System.out.println(ovf.getTotalOrden());

		System.out.println("-----");

		///////////////////////////////////////////////
		System.out.println("Orden");

		ItemOrden io = new ItemOrden(1, 5, DataSistema.productos.get(5));
		ItemOrden io2 = new ItemOrden(1, 13, DataSistema.productos.get(6));
		System.out.println(io.toString());
		System.out.println(io.getTotalItem());
		System.out.println(DataSistema.item.get(6));
		System.out.println(DataSistema.item.get(6).getTotalItem());
		////////////////////////////////////////////////////
		////////////////////////////////////////////////////

		ArrayList<Cliente> clientes_general = new ArrayList<Cliente>();
		ArrayList<OrdenDeVenta> ordedeventa = new ArrayList<OrdenDeVenta>();

		// agregar
		clientes_general.add(new Cliente_Empresa("Respuesto Daniel", "s.a", "Av. Cerca", "Sonia Valdez", 30));
		clientes_general.add(new Cliente_Individual("Juan", "Lopez", "Cerca de casa", "20000"));

		// eliminar

		clientes_general.remove(0);

		// modificar

		clientes_general.get(0).setApellidoCliente("edy");

		for (Cliente cliente : clientes_general) {// enlistar

			System.out.println(cliente.toString());

		}

		for (OrdenDeVenta ordenDeVenta : ordedeventa) {
			System.out.println("------------------->" + ordenDeVenta.toString());
		}

		DataSistema.productos.add(new Producto("Timon", TipoProducto.TIMONES, 75, 30.50));

		System.out.println(DataSistema.productos.get(8).toString());

		System.out.println(DataSistema.productos.size());

		DataSistema.productos.remove(0);

		DataSistema.productos.remove(0);

		System.out.println(DataSistema.productos.size());

		//////////
		/////////
		//////// Probando Facturacion

		ArrayList<Facturacion> factura = new ArrayList<Facturacion>();

		factura.add(new Facturacion(fechaorden, clientes_general.get(0)));

		factura.get(0).agregarItem(io);
		factura.get(0).agregarItem(io);
		factura.get(0).agregarItem(io);

		System.out.println(factura.get(0).getTotalOrden());

		factura.add(new Facturacion(fechaorden, DataSistema.clientes.get(0)));

		factura.get(1).agregarItem(io);
		factura.get(1).agregarItem(io);
		factura.get(1).agregarItem(io2);

		System.out.println(factura.get(1).getTotalOrden());

		for (Facturacion facturacion : factura) {
			System.out.println(facturacion.toString());
		}

		factura.get(1).agregarItem(io2);

		System.out.println(factura.get(1).getTotalOrden());

		for (Facturacion facturacion : factura) {
			System.out.println(facturacion.toString());
		}

		//////////
		/////////
		//////// Probando COMPRAS
		
		ArrayList<Orden_de_Compra>compra=new ArrayList<Orden_de_Compra>();
		
		compra.add(new Orden_de_Compra());
		
		System.out.println(io.toString());
		io.setCantidad(9000);
		compra.get(0).agregarItem(io);
		System.out.println(io.toString());

		
		
		
		
	}

}
