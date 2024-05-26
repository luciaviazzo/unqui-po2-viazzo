package ar.edu.unq.po2.tpObserver.ej2;

import java.util.List;

public class Sistema {

	private List<Partido> partidos;
	private Partido ultimoPartido;
	private List<Filter> suscriptores;
	
	//susribir
	public void addSuscriptor(Filter suscriptor) {
		suscriptores.add(suscriptor);
	}
	
	//desuscribir
	public void removeSuscriptor(Filter suscriptor) {
		suscriptores.remove(suscriptor);
	}
	
	//notify
	public void notifyPartido(Partido partido) {
		suscriptores.stream()
					.forEach(s -> s.notify(partido));
	}
	
	//establecer estado 
	public void setUltimoPartido(Partido partido) {
		this.ultimoPartido = partido;
		this.notifyPartido(partido);	
	}
	
	//obtener estado
	public Partido getUltimoPartido() {
		return ultimoPartido;
	}
	
	public void addUltimoPartido(Partido partido) {
		partidos.add(partido);
		this.setUltimoPartido(partido);
	}
	
}
