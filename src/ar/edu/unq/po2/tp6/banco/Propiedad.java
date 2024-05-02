package ar.edu.unq.po2.tp6.banco;

public class Propiedad {

	
	private String direccionInmobiliaria;
	private double valorFiscal;
	
	
	public Propiedad(String direccionInmobiliaria, double valorFiscal) {
		this.direccionInmobiliaria = direccionInmobiliaria;
		this.valorFiscal = valorFiscal;
	}
	
	
	public double getValorFiscal() {
		return valorFiscal;
	}
}
