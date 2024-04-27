package ar.edu.unq.po2.tp5.personasMascotas;

import java.sql.Date;
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
	
	
	public int getEdad() {
		LocalDate currentDate = LocalDate.now();
		return currentDate.getYear() - fechaNac.getYear(); 
	}
	
	
	public boolean esMenorQue(Persona persona) {
		return this.getEdad() < persona.getEdad();
	}
}
