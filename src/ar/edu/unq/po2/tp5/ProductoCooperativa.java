package ar.edu.unq.po2.tp5;

public class ProductoCooperativa extends Producto{
	
	private float descuento; 

	public ProductoCooperativa(float precio, int stock, float descuento) {
		super(precio, stock);
		this.descuento = descuento;
	}
	
	
	//Devuelve el precio con su decuento
	@Override
	public float getPrecio() {
		return precio * descuento;
	}
}
