package ar.edu.unq.po2.parcial.planDeAhorro;

import java.util.List;

public class Concecionaria {
	
	private List<Cliente> clientes;
	private List<PlanDeAhorro> planesDeAhorro;
	
	public int totalCuotasPendientes() {
		return planesDeAhorro.stream()
					    	 .filter(p -> !p.getFase().estaEnFaseCreado())
					    	 .mapToInt(p -> p.getcuotasPendientes())
					    	 .sum();
	}

}
