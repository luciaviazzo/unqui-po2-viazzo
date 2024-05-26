package ar.edu.unq.po2.parcial.planDeAhorro;

public class Vigente extends Fase{

	//Registra el pago de una cuota
	//Si es la ultima cuota, cambia a fase Finalizado
	@Override
	public void pagarCuota(PlanDeAhorro plan) {
		plan.registrarCuota();
		if(plan.esUltimaCuota()) {
			plan.setFase(new Finalizado());;
		}
	}
}
