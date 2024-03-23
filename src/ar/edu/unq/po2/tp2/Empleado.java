package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

public abstract class Empleado {
	protected String nombre;
	protected String direccion;
	protected String estadoCivil;
	protected LocalDate fechaNac;
	protected float sueldoBasico;

	public Empleado(String nombre, String direccion, String estadoCivil, LocalDate fechaNac, float sueldoBasico) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.estadoCivil = estadoCivil;
		this.fechaNac = fechaNac;
		this.sueldoBasico = sueldoBasico;
	}

	public int calcularEdad() {
		LocalDate currentDate = LocalDate.now();
		return currentDate.getYear() - fechaNac.getYear();
	}

	public abstract float calcularSueldoBruto();

	public abstract float calcularRetenciones();

	public float calcularSueldoNeto() {
		return (float) (calcularSueldoBruto() - calcularRetenciones());
	}
}
