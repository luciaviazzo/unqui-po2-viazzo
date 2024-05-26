package ar.edu.unq.po2.parcial.empresaDeViajes;

import java.time.LocalDate;

public class Excursion implements Producto{
	
	private double precioPorPersona;
	private double impuestos;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;

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
		return this.precioPorPersona + this.impuestos;
	}
}
