package ar.edu.unq.po2.tp5.mercadoCentral;

public abstract class Factura implements Pagable{
	
	
	private Agencia agencia;
	
	
	public Factura(Agencia agencia) {
		this.agencia = agencia;
	}

	
	public abstract double getPrecio();
	
	
	@Override
	public void registrar() {
		agencia.registrarPago(this);
	}
}
