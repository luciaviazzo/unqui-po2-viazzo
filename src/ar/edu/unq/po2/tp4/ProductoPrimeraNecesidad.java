package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto{

	private double descuento;
	
	public ProductoPrimeraNecesidad(String nombre, double precio, boolean esPrecioCuidado, double descuento) {
		super(nombre, precio, esPrecioCuidado);
		this.descuento = descuento;
	}
	
	
	public double getDescuento() {
		return descuento;
	}
	
	
	public double aplicarDescuento() {
		return this.getPrecioBase() * this.getDescuento() / 100;
	}
	
	@Override 
	public double getPrecio() {
		return this.getPrecioBase() - aplicarDescuento();
	}
}
