package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

public class Contratado extends Empleado{
	private int numeroContrato;
	private String medioDePago;

	public Contratado(String nombre, String direccion, String estadoCivil, LocalDate fechaNac, float suledoBasico,
			int numeroContrato, String medioDePago) {
		super(nombre, direccion, estadoCivil, fechaNac, suledoBasico);
		this.numeroContrato = numeroContrato;
		this.medioDePago = medioDePago;
	}

	@Override
	public float calcularSueldoBruto() {
		return this.getSueldoBasico();
	}

	@Override
	public float calcularRetenciones() {
		return 50;
	}
}
