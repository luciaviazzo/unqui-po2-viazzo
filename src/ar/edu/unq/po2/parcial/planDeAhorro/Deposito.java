package ar.edu.unq.po2.parcial.planDeAhorro;

public class Deposito extends Retribucion{

	private FabricaAutomovil fabrica;
	private RedBancaria red;
	
	@Override
	public void ejecutar(PlanDeAhorro plan) {
		red.depositar(fabrica.valorAutomovil(plan.getMarca(), plan.getModelo()), plan.getCBU());
		
	}
	
	
}
