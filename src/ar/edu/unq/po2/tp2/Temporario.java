package ar.edu.unq.po2.tp2;

import java.time.LocalDate;
import java.util.Date;

public class Temporario extends Empleado{
	private LocalDate fechaFin;
	private int cantHorasExtras;

	public Temporario(String nombre, String direccion, String estadoCivil, LocalDate fechaNac, float suledoBasico,
			LocalDate fechaFin, int cantHorasExtras) {
		super(nombre, direccion, estadoCivil, fechaNac, suledoBasico);
		this.fechaFin = fechaFin;
		this.cantHorasExtras = cantHorasExtras;
	}

	
	@Override
	public float adicionalesPor() {
		return this.adicionalPorHorasExtras();
	}


	public float adicionalPorHorasExtras() {
		return cantHorasExtras * 40;
	}

	@Override
	public float retencionesPorObraSocial() {
		return (float) (0.10 * calcularSueldoBruto() + (calcularEdad() > 50 ? 25 : 0)); // Optional chaining
	}
	
	@Override
	public float aportesJubilatorios() {
		return (float) ((0.10 * calcularSueldoBruto()) + (cantHorasExtras * 5));
	}
}
