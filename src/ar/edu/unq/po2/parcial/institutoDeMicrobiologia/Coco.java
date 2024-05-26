package ar.edu.unq.po2.parcial.institutoDeMicrobiologia;

public class Coco implements Consumidor{
	
	private double radio;

	@Override
	public double getConsumoDeOxigeno() {
		return radio * 2;
	}

}
