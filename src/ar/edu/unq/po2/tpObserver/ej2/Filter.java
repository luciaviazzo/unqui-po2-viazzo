package ar.edu.unq.po2.tpObserver.ej2;

import java.util.List;

public class Filter {
	
	private List<Servidor> servidores;
	private List<Aplicacion> aplicaciones;
	private String valor;
	
	public void notify(Partido partido) {
		this.notifyDeporte(partido);
		this.notifyContrincantes(partido);
	}
	
	//Notifica a los servidores y aplicaciones que estan suscriptos ese deporte
	public void notifyDeporte(Partido p) {
		if(this.valor.equals(p.getDeporte())) {
			this.servidores.forEach(s -> s.recibirInfoPartido(p));
			this.aplicaciones.forEach(s -> s.recibirInfoPartido(p));
		}
	}
	
	//Notifica a las aplicaciones que estan suscriptas a ese contrincante
	public void notifyContrincantes(Partido p) {
		if(p.getContrincantes().contains(valor)) {
			this.aplicaciones.forEach(s -> s.recibirInfoPartido(p));
		}
	}
	
	public void addServidorr(Servidor servidor) {
		servidores.add(servidor);
	}
	
	public void removeSuscriptor(Servidor servidor) {
		servidores.remove(servidor);
	}
	
	public void addAplicacion(Aplicacion aplicacion) {
		aplicaciones.add(aplicacion);
	}
	
	public void removeAplicacion(Aplicacion aplicacion) {
		aplicaciones.remove(aplicacion);
	}
}
