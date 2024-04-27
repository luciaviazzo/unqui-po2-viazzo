package ar.edu.unq.po2.tp5.mercadoCentral;

public class Impuesto extends Factura{
	
	
	public double tasaServicio;
	

	public Impuesto(Agencia agencia, double tasaServicio) {
		super(agencia);
		this.tasaServicio = tasaServicio;
	}


	@Override
	public double getPrecio() {
		return tasaServicio;
	}

}
