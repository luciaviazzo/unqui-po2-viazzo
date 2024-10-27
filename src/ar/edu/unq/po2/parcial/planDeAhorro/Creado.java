package ar.edu.unq.po2.parcial.planDeAhorro;

public class Creado extends Estado{

	public void settearRetribucion(PlanDeAhorro plan, Retribucion retribucion) {
		plan.setRetribucion(retribucion);
	}

	@Override
	public void pagarCuota(PlanDeAhorro plan) {
		plan.descontarCuota();
		plan.setEstado(new Vigente());
	}
}
