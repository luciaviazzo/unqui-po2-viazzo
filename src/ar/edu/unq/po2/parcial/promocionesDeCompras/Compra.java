package ar.edu.unq.po2.parcial.promocionesDeCompras;

import java.time.LocalDate;

public class Compra {

	private LocalDate fecha;
	private double montoOriginal;
	private double montoFinal;
	private double descuento;
	private MedioDePago medioDePago;
	
	public Compra(double monto, double descuento, MedioDePago medioDePago) {
		this.fecha = LocalDate.now();
		this.montoOriginal = monto;
		this.descuento = descuento;
		this.medioDePago = medioDePago;
		this.montoFinal = this.calcularMontoFinal();
	}
	
	public LocalDate getFecha() {
		return fecha;
	}
	
	public double calcularMontoFinal() {
		return this.montoOriginal - this.descuento;
	}
}
