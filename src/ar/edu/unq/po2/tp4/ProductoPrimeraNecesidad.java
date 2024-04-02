package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto{

	public ProductoPrimeraNecesidad(String nombre, float precio) {
		super(nombre, precio);
	}
	
	
	public float aplicarDescuento(float descuento) {
		return (float) (this.getPrecio() * descuento / 100);
	}
	
	@Override 
	public float calcularPrecio() {
		return this.aplicarDescuento(10);
	}
}
