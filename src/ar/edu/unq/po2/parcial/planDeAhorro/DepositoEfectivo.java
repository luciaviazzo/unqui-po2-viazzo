package ar.edu.unq.po2.parcial.planDeAhorro;

public class DepositoEfectivo implements Retribucion{
	
	private RedBancaria red;
	private FabricaAutomotriz fabrica;

	@Override
	public void ejecutarRetribucion(PlanDeAhorro plan) {
		red.depositar(this.consultarValor(plan.getMarca(), plan.getModelo()), plan.getCBU());
	}
	
	public float consultarValor(String marca, String modelo) {
		return fabrica.valorAutomotriz(marca, modelo);
	}

}
