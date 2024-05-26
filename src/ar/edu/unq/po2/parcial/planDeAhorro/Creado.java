package ar.edu.unq.po2.parcial.planDeAhorro;

public class Creado extends Fase{

	//Paga la primera cuota y cambia a fase Vigente
	@Override
	public void pagarCuota(PlanDeAhorro plan) {
		plan.registrarCuota();
		plan.setFase(new Vigente());
	}
	
	//Se settea con la retibucion eleida por el cliente
	@Override
	public void setRetribucion(PlanDeAhorro plan, Retribucion retribucion) {
		plan.setRetribucion(retribucion);
	}
}
