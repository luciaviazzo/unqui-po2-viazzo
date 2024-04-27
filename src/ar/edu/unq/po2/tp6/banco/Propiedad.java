package ar.edu.unq.po2.tp6.banco;

public class Propiedad {

	
	private String direccionInmobiliaria;
	private double valorFiscal;
	
	
	public Propiedad(String direccionInmobiliaria, double valorFiscal) {
		this.direccionInmobiliaria = direccionInmobiliaria;
		this.valorFiscal = valorFiscal;
	}
	
	
	//Calcula el valor fiscal de acuerdo al porcentaje indicado
	public double calcularPorcentajeValorFiscal(double porcentaje) {
		return valorFiscal * porcentaje / 100;
	}
	
	
}
