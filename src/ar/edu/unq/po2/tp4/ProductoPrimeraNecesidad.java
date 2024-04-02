package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto{

	public ProductoPrimeraNecesidad(String nombre, double precio, boolean esPrecioCuidado) {
		super(nombre, precio, esPrecioCuidado);
		// TODO Auto-generated constructor stub
	}
	
	
	public double getDescuento(double porcentaje) {
		return this.getPrecioBase() * porcentaje;
	}
	
	@Override 
	public double getPrecio() {
		return this.getPrecioBase() - getDescuento(0.1);
	}
}
