package ar.edu.unq.po2.parcial.institutoDeMicrobiologia;

import java.util.List;

public class Poblacion implements Consumidor{
	
	private List<Consumidor> componentes;
	private double factorDeOxigenacion;

	@Override
	public double getConsumoDeOxigeno() {
		return (this.sumConsumoComponentes() * this.cantComponentes() / this.factorDeOxigenacion);
	}
	
	public double sumConsumoComponentes() {
		return componentes.stream()
						  .mapToDouble(componente -> componente.getConsumoDeOxigeno())
						  .sum();
	}
	
	public int cantComponentes() {
		return componentes.size();
	}
}
