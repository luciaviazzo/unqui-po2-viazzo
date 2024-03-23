package ar.edu.unq.po2.tp2;

import java.time.LocalDate;
import java.util.Date;

public class Temporario {
	private Date fechaFin;
	private int cantHorasExtras;

	public Temporario(String nombre, String direccion, String estadoCivil, LocalDate fechaNac, float suledoBasico,
			Date fechaFin, int cantHotasExtras) {
		super(nombre, direccion, estadoCivil, fechaNac, suledoBasico);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float calcularSueldoBruto() {
		return sueldoBasico + adicionalPorHorasExtras();
	}

	public float adicionalPorHorasExtras() {
		return cantHorasExtras * 40;
	}

	@Override
	public float calcularRetenciones() {
		return retencionesPorObraSocial() + aportesJubilatorios();
	}

	public float retencionesPorObraSocial() {
		return (float) (0.10 * calcularSueldoBruto() + (calcularEdad() > 50 ? 25 : 0)); // Optional chaining
	}

	public float aportesJubilatorios() {
		return (float) ((0.10 * calcularSueldoBruto()) + (cantHorasExtras * 5));
	}
}
