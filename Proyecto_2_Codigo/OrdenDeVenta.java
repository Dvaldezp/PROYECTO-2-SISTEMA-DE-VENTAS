package Proyecto_2_Codigo;

import java.util.Date;

public class OrdenDeVenta {

	private int idOrdenV;
	private Cliente cliente;
	private ItemOrden item1;
	private ItemOrden item2;
	private Date fechaorden;
	private double precioEnvio;
	private double total;
	private String tipoEnvio;
	private String estado;
	private int diasEnvio;
	private static int sigIdOrden = 3000;

	public static int siguienteId() {
		return sigIdOrden++;
	}

	public OrdenDeVenta() {
		idOrdenV = OrdenDeVenta.siguienteId();
		total = 0;
		fechaorden = new Date();
	}

	public OrdenDeVenta(Date fechaorden) {
		this();
		
	}

}
