package ar.edu.unq.po2.tp6.banco;

public class CreditoPersonal extends SolicitudCredito{

	
	public CreditoPersonal(Cliente solicitante, double monto, int plazoEnMeses) {
		super(solicitante, monto, plazoEnMeses);
		// TODO Auto-generated constructor stub
	}


	@Override
	public boolean esAceptable() {
		return this.tieneIngresosAnualesMayoresA(15000) && this.esCuotaMenorAPorcentajeSueldo(70);
	}
	
	
	public boolean tieneIngresosAnualesMayoresA(double monto) {
		return solicitante.calcularIngresoAnual() > monto;
	}
}
