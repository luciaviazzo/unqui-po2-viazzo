package ar.edu.unq.po2.tp6.banco;

public class CreditoHipotecario extends SolicitudCredito{

	
	private Propiedad garantia; 
	
	
	public CreditoHipotecario(Cliente solicitante, double monto, int plazoEnMeses, Propiedad garantia) {
		super(solicitante, monto, plazoEnMeses);
		this.garantia = garantia;
	}


	@Override
	public boolean esAceptable() {
		return this.esCuotaMenorAPorcentajeSueldo(50) && this.esMontoMenorAPorcentajeGarantia(70) && !this.esMayorA(65);
	}
	
	
	
	//Inidica si el monto solictado es menor al porcentaje del valor fiscal de la garantia
	public boolean esMontoMenorAPorcentajeGarantia(double porcentaje) {
			return this.monto < garantia.getValorFiscal() * porcentaje / 100;
		}
	
	
	public boolean esMayorA(int anios) {
		return this.solicitante.getEdad() > anios;
	}
}
