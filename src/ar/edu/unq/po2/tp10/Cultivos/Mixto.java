package ar.edu.unq.po2.tp10.Cultivos;

import java.util.List;

public class Mixto implements Cultivo{

	private List<Cultivo> cultivos;
	
	
	@Override
	public int getGanancia() {
		return cultivos.stream()
					   .mapToInt(cultivo -> cultivo.getGanancia() / 4) 
					   .sum();
	}
	
	
	public void agregar4Cultivos(Cultivo cultivo1, Cultivo cultivo2, Cultivo cultivo3, Cultivo cultivo4) {
		cultivos.add(cultivo1);
		cultivos.add(cultivo2);
		cultivos.add(cultivo3);
		cultivos.add(cultivo4);
	}
	
	
	public List<Cultivo> getCultivos() {
		return cultivos;
	}
}
