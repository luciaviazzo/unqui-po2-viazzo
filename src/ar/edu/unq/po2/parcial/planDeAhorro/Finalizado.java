package ar.edu.unq.po2.parcial.planDeAhorro;

public class Finalizado extends Fase{

	@Override
	public void ejecutarRetribucion(PlanDeAhorro plan, Retribucion retribucion) {
		retribucion.ejecutarRetribucion(plan);
	}
}
