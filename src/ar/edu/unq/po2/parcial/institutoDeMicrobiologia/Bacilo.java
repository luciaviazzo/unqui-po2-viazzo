package ar.edu.unq.po2.parcial.institutoDeMicrobiologia;

public class Bacilo implements Consumidor{
	
	private double longitud;

	@Override
	public double getConsumoDeOxigeno() {
		return longitud * 3;
	}

}
