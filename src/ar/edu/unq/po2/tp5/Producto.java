package ar.edu.unq.po2.tp5;

public class Producto {
	
	private float precio;
	private int stock;
	
	
	public Producto(float precio, int stock) {
		this.precio = precio;
		this.stock = stock;
	}
	
	
	public float getPrecio() {
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
