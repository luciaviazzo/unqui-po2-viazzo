package ar.edu.unq.po2.parcial.planDeAhorro;

public class Finalizado extends Estado {

	public void ejecutarRetribucion(PlanDeAhorro plan, Retribucion retribucion) {
		retribucion.ejecutar(plan);
		plan.setEstado(new Cerrado());
	}
}
