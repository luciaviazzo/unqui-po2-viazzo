package ar.edu.unq.po2.parcial.planDeAhorro;

public abstract class Estado {

	public void settearRetribucion(PlanDeAhorro plan, Retribucion retribucion) {}

	public void pagarCuota(PlanDeAhorro plan) {}

	public void ejecutarRetribucion(PlanDeAhorro plan, Retribucion retribucion) {}
}
