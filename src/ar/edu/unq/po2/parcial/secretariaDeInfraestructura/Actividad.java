package ar.edu.unq.po2.parcial.secretariaDeInfraestructura;

import java.time.LocalDate;

public abstract class Actividad {

	private String nombre ;
	private LocalDate fechaInicio;
	private Empleado lider;
	
	public Actividad(String nombre, Empleado lider) {
		this.nombre = nombre;
		this.lider = lider;
	}
	
	
	
	public abstract float inversionTotal();

	public abstract LocalDate getFechaInicio();

	
	public Empleado getLider() {
		return this.lider;
	}

}
