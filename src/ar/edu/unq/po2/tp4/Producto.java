package ar.edu.unq.po2.tp4;

public class Producto {
	
	private String nombre;
	private float precio;
	private boolean esPrecioCuidado;
	
	
	public Producto(String nombre, float precio, boolean precioCuidado) {
		this.nombre = nombre;
		this.precio = precio;
		this.esPrecioCuidado = esPrecioCuidado;
	}	
	
	//Constructor sobrecargado 
	public Producto(String nombre, float precio) {
        this(nombre, precio, false); 
    }
	
	
	public float getPrecio() {
		return precio;
	}
	
	
	public float calcularPrecio() {
			return this.getPrecio();
	}
	
	
}

