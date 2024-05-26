package ar.edu.unq.po2.parcial.empresaDeViajes;

import java.time.LocalDate;

public class Pasaje implements Producto{

	private double precioPorPersona;
	private String aeropuerto;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private IOperator operadorDeViaje;

	@Override
	public LocalDate getFechaInicio() {
		return fechaInicio;
	}
	
	@Override
	public LocalDate getFechaFin() {
		return fechaFin;
	}
	
	@Override
	public double getCosto() {
		return this.precioPorPersona + this.getImpuestos();
	}
	
	public float getImpuestos() {
		return this.operadorDeViaje.taxes(aeropuerto, fechaInicio);
	}
}
