package ar.edu.unq.po2.tp10.JuegoDeEstrategia;

import java.util.List;

public class Ejercito extends Personaje {

	
	private List<Personaje> personajes;
	
	
	@Override
	public void caminar() {
		personajes.stream()
				  .forEach(personaje -> personaje.caminar());
	}
}
