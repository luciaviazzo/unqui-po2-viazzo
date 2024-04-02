package ar.edu.unq.po2.tp4;

public class Producto {
	
	private String nombre;
	private double precioBase;
	private boolean esPrecioCuidado;
	
	
	public Producto(String nombre, double precioBase, boolean esPrecioCuidado) {
		this.nombre = nombre;
		this.precioBase = precioBase;
		this.esPrecioCuidado = esPrecioCuidado;
	}	
	
	
	//Constructor sobrecargado 
	public Producto(String nombre, double precioBase) {
		this.nombre = nombre;
		this.precioBase = precioBase;
		this.esPrecioCuidado = false;
    }
	
	public String getNombre() {
		return nombre;
	}
	
	public double getPrecioBase() {
		return precioBase;
	}
	
	public double getPrecio() {
		return this.getPrecioBase();
	}
	
	public boolean esPrecioCuidado() {
		return esPrecioCuidado;
	}
	
	
	/*
	public void aumentarPrecio(double porcentaje) {
		
	}*/
}

