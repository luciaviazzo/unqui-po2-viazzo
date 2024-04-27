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
	
	
	//Devuelve el ingreso anual 
	public double calcularIngresoAnual() {
		return sueldoNeto * 12;
	}
	
	
	//Inica si el ingreso anual es mayor al impoorte dado 
	public boolean esIngresoAnualMayorA(double importe) {
		return this.calcularIngresoAnual() > importe;
	}
	
	
	//Calcula el sueldo de acuerdo al porcentaje indicado
	public double calcularPorcentajeIngresoMensul(double porcentaje) {
		return sueldoNeto * porcentaje / 100;
	}
}
