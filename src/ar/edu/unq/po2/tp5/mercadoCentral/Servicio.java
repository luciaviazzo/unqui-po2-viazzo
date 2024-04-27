package ar.edu.unq.po2.tp5.mercadoCentral;

public class Servicio extends Factura {
	
	
	private double costoUnidad;
	private int cantUnidades;
	

	public Servicio(Agencia agencia, double costoUnidad, int cantUnidades) {
		super(agencia);
		this.costoUnidad = costoUnidad;
		this.cantUnidades = cantUnidades;
	}
	

	@Override
	public double getPrecio() {
		return costoUnidad * cantUnidades;
	}

}
