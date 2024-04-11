package ar.edu.unq.po2.tp5;

import java.util.ArrayList;

public class Caja {
	
	private ArrayList<Producto> productos;
	
	
	public Caja(ArrayList<Producto> productos) {
		this.productos = productos; 
	}
	
	
	public void agregarProducto(Producto producto) {
		productos.add(producto);
	}
	
	
	public void registrarProductos() {
		for (Producto producto : productos) {
			
		}
	}
	
	

}
