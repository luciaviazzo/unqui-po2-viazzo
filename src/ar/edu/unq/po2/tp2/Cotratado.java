package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

public class Cotratado {
	private int numeroContrato;
	private String medioDePago;

	public Contratado(String nombre, String direccion, String estadoCivil, LocalDate fechaNac, float suledoBasico,
			int numeroContrato, String medioDePago) {
		super(nombre, direccion, estadoCivil, fechaNac, suledoBasico);
	}

	@Override
	public float calcularSueldoBruto() {
		return sueldoBasico;
	}

	@Override
	public float calcularRetenciones() {
		return 50;
	}
}
