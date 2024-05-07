package ar.edu.unq.po2.tp6.banco;

public class Cliente {
	
	private String nombre;
	private String apellido;
	private String direccion;
	private int edad;
	private double sueldoNeto;
	
	
	public Cliente(String nombre, String apellido, String direccion, int edad, double sueldoNeto) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.edad = edad;
		this.sueldoNeto = sueldoNeto;
	}
	
	
	public int getEdad() {
		return edad;
	}
	
	
	public double getSueldoNeto(){
		return sueldoNeto;
	}
	
	public double calcularIngresoAnual() {
		return this.getSueldoNeto() * 12;
	}
	
	public void solicitarCredito(Banco banco, SolicitudCredito solicitud) {
		banco.addSolicitud(solicitud);
	}
}
