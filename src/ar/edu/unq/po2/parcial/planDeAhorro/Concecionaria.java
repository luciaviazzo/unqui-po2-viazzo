package ar.edu.unq.po2.parcial.planDeAhorro;

import java.util.List;

public class Concecionaria {

	private List<Cliente> clientes;
	
	public int cuotasPendientes() {
		return clientes.stream()
					   .mapToInt(c -> c.getPlan().getCuotas())
					   .sum();
	}
	
}
