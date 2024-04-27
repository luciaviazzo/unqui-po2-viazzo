package ar.edu.unq.po2.tp6.banco;

public class CreditoHipotecario extends SolicitudCredito{

	
	private Propiedad garantia; 
	
	
	public CreditoHipotecario(Cliente solicitante, double monto, int plazoEnMeses, Propiedad garantia) {
		super(solicitante, monto, plazoEnMeses);
		this.garantia = garantia;
	}

	
	//Indica si la solcitud cumple con las condiciones para ser aceptada 
	//Cuota mensual menor al 50% del sueldo del solicitante
	//Monto solicitado menor al 70% del valor fiscal de la garantia
	//Solicitante menor a 65 años
	@Override
	public boolean esAceptable() {
		return this.esCuotaMenorAPorcentajeSueldo(50) && this.esMontoMenorAPorcentajeGarantia(70) && solicitante.getEdad() < 65;
	}
	
	
	
	//Inidica si el monto solictado es menor al porcentaje del valor fiscal de la garantia
		public boolean esMontoMenorAPorcentajeGarantia(double porcentaje) {
			return this.monto < this.garantia.calcularPorcentajeValorFiscal(porcentaje);
		}
}
