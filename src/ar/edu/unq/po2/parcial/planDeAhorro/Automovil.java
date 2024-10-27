package ar.edu.unq.po2.parcial.planDeAhorro;

public class Automovil extends Retribucion{
	
	private FabricaAutomovil fabrica;

	@Override
	public void ejecutar(PlanDeAhorro plan) {
		fabrica.comprar(plan.getMarca(), plan.getModelo());
	}
}
