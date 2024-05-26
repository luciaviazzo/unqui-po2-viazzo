package ar.edu.unq.po2.tp10.Cultivos;

public class Trigo implements Cultivo{
	
	private int ganacia = 300;
	
	
	@Override
	public int getGanancia() {
		return ganacia;
	}
}
