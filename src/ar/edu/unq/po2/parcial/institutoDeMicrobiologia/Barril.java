package ar.edu.unq.po2.parcial.institutoDeMicrobiologia;

import java.util.List;

public class Barril {
	
	private int codigo;
	private int anioFabricacion;
	private List<Consumidor> consumidores;
	
	public double getConsumoDeOxigenoTotal() {
		return consumidores.stream()
						   .mapToDouble(consumidor -> consumidor.getConsumoDeOxigeno())
						   .sum();
	}
}
