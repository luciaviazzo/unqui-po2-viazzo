package ar.edu.unq.po2.tp3;

import java.time.LocalDate;

public class Persona {
	
	private String nombre;
	private LocalDate fechaNac;
	
	
	public Persona(String nombre, LocalDate fechaNac) {
		this.nombre = nombre;
		this.fechaNac = fechaNac;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	
	public LocalDate getFechaNac() {
		return fechaNac;
	}
	
	
	public int calcularEdad() {
		LocalDate currentDate = LocalDate.now();
		return currentDate.getYear() - fechaNac.getYear();
	}
	
	
	public boolean esMenorQue(Persona persona) {
		return this.calcularEdad() < persona.calcularEdad();
	}
	
	
	public Persona crearPersona(String nombre, LocalDate fechaNac) {
		return new Persona(nombre, fechaNac);
	}
}
