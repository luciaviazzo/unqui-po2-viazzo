package ar.edu.unq.po2.parcial.planDeAhorro;

public class Cliente {
	
	private PlanDeAhorro plan;
	private String cbu;

	public void suscribirPlan(String marca, String modelo, int cuotas,  Retribucion retribucion) {
		this.plan = new PlanDeAhorro(this, marca, modelo, cuotas, this.cbu, retribucion);
	}
	
	public PlanDeAhorro getPlan() {
		return plan;
	}
	
	public void pagarCuota() {
		plan.descontarCuota();
	}
	
}
