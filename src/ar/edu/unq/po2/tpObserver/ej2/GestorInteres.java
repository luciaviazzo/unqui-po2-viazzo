package ar.edu.unq.po2.tpObserver.ej2;
import java.util.Set;

public abstract class GestorInteres {
	
	private Set<Suscriptor> suscriptores;
	private String valor;
	
	public void suscribir(Suscriptor suscriptor) {
		suscriptores.add(suscriptor);
	}
	
	public void desuscribir(Suscriptor suscriptor) {
		suscriptores.remove(suscriptor);
	}

	public void notify(Partido partido) {
		if(this.esDeInteres(partido)) {
			suscriptores.stream()
					.forEach(s -> s.recibirInfoPartido(partido));;
		}
	}
	
	public abstract boolean esDeInteres(Partido partido);
}
