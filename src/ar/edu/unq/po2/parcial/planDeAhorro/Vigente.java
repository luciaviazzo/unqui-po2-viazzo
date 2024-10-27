package ar.edu.unq.po2.parcial.planDeAhorro;

public class Vigente extends Estado {

	@Override
	public void pagarCuota(PlanDeAhorro plan) {
		plan.descontarCuota();
		if(plan.getCuotas() == 0) {
			plan.setEstado(new Finalizado());
		}
	}

}
