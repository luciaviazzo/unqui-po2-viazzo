package ar.edu.unq.po2.tp5.mercadoCentral;

public class Producto implements Pagable{
	
	protected double precio;
	protected int stock;
	
	
	public Producto(double precio, int stock) {
		this.precio = precio;
		this.stock = stock;
	}
	
	
	@Override
	public double getPrecio() {
		return precio;
	}
	
	
	public int getStock() {
		return stock;
	}
	
	
	@Override
	public void registrar() {
		this.reducirStock();
	}
	
	
	//Reduce en 1 el stock
	public void reducirStock() {
		stock --;
	}
}
