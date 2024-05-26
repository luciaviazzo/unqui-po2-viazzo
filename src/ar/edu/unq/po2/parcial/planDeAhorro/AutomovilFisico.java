package ar.edu.unq.po2.parcial.planDeAhorro;

public class AutomovilFisico implements Retribucion{
	
	private FabricaAutomotriz fabrica;

	@Override
	public void ejecutarRetribucion(PlanDeAhorro plan) {
		
		fabrica.comprarAutomovil(plan.getMarca(), plan.getModelo());
	}
}
