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
	
	
	public void agregarProducto(Producto producto) {
		productos.add(producto);
	}
	
	
	public int getCantidadDeProductos() {
		return this.getProductos().size();
	}
	
	/*
	public double getPrecioTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio();
        }
        return total;
    }*/
	
	
	public double getPrecioTotal() {
        return  productos.stream()
                .mapToDouble(Producto::getPrecio) //Crea una nueva lista con los precios de cada producto (tipo double)
                .sum();
    }
}
