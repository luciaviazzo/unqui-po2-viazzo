package ar.edu.unq.po2.tp6.banco;

public class CreditoPersonal extends SolicitudCredito{

	
	public CreditoPersonal(Cliente solicitante, double monto, int plazoEnMeses) {
		super(solicitante, monto, plazoEnMeses);
		// TODO Auto-generated constructor stub
	}

	
	//Indica si la solcitud cumple con las condiciones para ser aceptada 
	//Sueldo anual del solicitante mayor a 15000
	//Cuota mensual menor al 70% del sueldo del solicitante
	@Override
	public boolean esAceptable() {
		return this.solicitante.esIngresoAnualMayorA(15000) && this.esCuotaMenorAPorcentajeSueldo(70);
	}
}
