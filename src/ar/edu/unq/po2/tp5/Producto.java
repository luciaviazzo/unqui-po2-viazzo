package ar.edu.unq.po2.tp5;

public class Producto {
	
	protected double precio;
	protected int stock;
	
	
	public Producto(double precio, int stock) {
		this.precio = precio;
		this.stock = stock;
	}
	
	
	public double getPrecio() {
		return precio;
	}
	
	
	public int getStock() {
		return stock;
	}
	
	
	//Reduce en 1 el stock
	public void reducirStock() {
		stock --;
	}
}
