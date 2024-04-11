package ar.edu.unq.po2.tp5;

public class ProductoCooperativa extends Producto{
	
	private double descuento; 

	public ProductoCooperativa(double precio, int stock, double descuento) {
		super(precio, stock);
		this.descuento = descuento;
	}
	
	
	//Devuelve el precio con su decuento
	@Override
	public double getPrecio() {
		return precio - precio * descuento;
	}
}
