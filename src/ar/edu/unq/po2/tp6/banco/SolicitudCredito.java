package ar.edu.unq.po2.tp6.banco;

public abstract class SolicitudCredito {

	
	protected Cliente solicitante;
	protected double monto;
	protected int plazoEnMeses;
	
	
	public SolicitudCredito(Cliente solicitante, double monto, int plazoEnMeses) {
		this.solicitante = solicitante;
		this.monto = monto;
		this.plazoEnMeses = plazoEnMeses;
	}
	
	
	public double getMonto() {
		return monto;
	}
	
	
	public double calcularCuotaMensual() {
		return monto / plazoEnMeses;
	}
	
	
	//Inidica si la cuota del prestamo es menor al porcentaje del sueldo del solicitante
	public boolean esCuotaMenorAPorcentajeSueldo(double porcentaje) {
		return this.calcularCuotaMensual() < solicitante.getSueldoNeto() * porcentaje /100;
	}
	
	
	public abstract boolean esAceptable();

}
