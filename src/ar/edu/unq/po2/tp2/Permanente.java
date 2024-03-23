package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

public class Permanente extends Empleado{
	private int cantHijos;
	private int antiguedad;

	public Permanente(String nombre, String direccion, String estadoCivil, LocalDate fechaNac, float suledoBasico,
			int cantHijos, int antiguedad) {
		super(nombre, direccion, estadoCivil, fechaNac, suledoBasico);
		this.cantHijos = cantHijos;
		this.antiguedad = antiguedad;
	}

	@Override
	public float calcularSueldoBruto() {
		return sueldoBasico + salarioFamiliar() + asignacionPorAntiguedad();

	}

	public float salarioFamiliar() {
		return (cantHijos * 150) + (estadoCivil.equals("casado") ? 100 : 0); // Optional chaining
	}

	public float asignacionPorAntiguedad() {
		return antiguedad * 50;
	}

	@Override
	public float calcularRetenciones() {
		return retencionesPorObraSocial() + aportesJubilatorios();
	}

	public float retencionesPorObraSocial() {
		return (float) ((0.10 * calcularSueldoBruto()) + (20 * cantHijos));
	}

	public float aportesJubilatorios() {
		return (float) (0.15 * calcularSueldoBruto());
	}
}
