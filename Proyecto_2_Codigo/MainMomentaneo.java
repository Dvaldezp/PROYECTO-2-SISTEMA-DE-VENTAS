package Proyecto_2_Codigo;

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

		Producto product = new Producto("Bujia", 50.50);

		System.out.println("Cliente");

		System.out.println(eCliente.toString() + "\n" + eCliente1.toString());

		System.out.println(DataSistemaCliente.clientes.get(5));

		System.out.println(Utilerias.getNombreClase(eCliente.getClass()));

		System.out.println("Producto");

		System.out.println(product.toString());

		System.out.println(DataSistemaProducto.producto.get(5));

	}

}
