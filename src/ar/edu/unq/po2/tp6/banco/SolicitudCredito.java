package ar.edu.unq.po2.tp6.banco;

public abstract class SolicitudCredito {

	
	private Cliente solicitante;
	private double monto;
	private int plazoEnMeses;
	
	
	public SolicitudCredito(Cliente solicitante, double monto, int plazoEnMeses) {
		this.solicitante = solicitante;
		this.monto = monto;
		this.plazoEnMeses = plazoEnMeses;
	}
	
	
	public double calcularCuotaMensual() {
		return monto / plazoEnMeses;
	}
	
	
	public abstract boolean esAceptable();
}
