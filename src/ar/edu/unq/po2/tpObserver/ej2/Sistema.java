package ar.edu.unq.po2.tpObserver.ej2;
import java.util.Set;

public class Sistema {

	private Set<Partido> partidos;
	private Set<GestorInteres> gestorDeIntereses;
	
	public void suscribir(GestorInteres gestor, Suscriptor suscriptor) {
		gestorDeIntereses.add(gestor);
		gestor.suscribir(suscriptor);
	}
	
	public void desuscribir(GestorInteres gestor, Suscriptor suscriptor) {
		gestorDeIntereses.remove(gestor);
		gestor.desuscribir(suscriptor);
	}
	
	public void notifyPartido(Partido partido) {
		gestorDeIntereses.stream()
					.forEach(gestor -> gestor.notify(partido));
	}

	
	public void addPartido(Partido partido) {
		partidos.add(partido);
		this.notifyPartido(partido);
	}
	
}
