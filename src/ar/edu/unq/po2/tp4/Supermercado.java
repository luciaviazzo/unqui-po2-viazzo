package ar.edu.unq.po2.tp4;

import java.util.ArrayList;

public class Supermercado {
	
	private String nombre;
	private String direccion;
	private ArrayList<Producto> productos;
	
	
	public Supermercado(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.productos = new ArrayList<Producto>();
	}
	
	
	public ArrayList<Producto> getProductos() {
		return productos;
	}
	
	
	public int cantidadProductos() {
		return this.getProductos().size();
	}
	
	
	public float sumarPrecios() {
        float total = 0.0f;
        for (Producto producto : productos) {
            total += producto.calcularPrecio();
        }
        return total;
    }
	
	/*
	public float sumarPrecios() {
        return (float) productos.stream()
                .mapToDouble(Producto::calcularPrecio) //Crea una nueva lista con los precios de cada producto (tipo double)
                .sum();
    }*/
}
