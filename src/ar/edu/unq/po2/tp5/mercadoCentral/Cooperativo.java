package ar.edu.unq.po2.tp5.mercadoCentral;

public class Cooperativo extends Producto{
	
	private double descuento;
	

	public Cooperativo(double precio, int stock, double descuento) {
		super(precio, stock);
		this.descuento = descuento;
	}
	
	
	@Override
	public double getPrecio() {
		return precio - precio * descuento;
	}
}
