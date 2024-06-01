package ar.edu.unq.po2.tpObserver.ej1;

import java.util.HashSet;
import java.util.Set;

public class SistemaDePublicaciones {
	
	private Set<Articulo> articulos; 
	private Set<Interes> intereses;
	
	public SistemaDePublicaciones() {
		this.articulos = new HashSet<Articulo>();
		this.intereses = new HashSet<Interes>();
	}
	
	
	//Agrega un interes a la lista de intereses
	//Le manda un mensaje a interes para que agregue un investigador a su lista de investigadores
	//Como estoy trabajando con conjuntos, si ya se encuentra en la lista, no pasa nada
	public void suscribir(Interes interes, Investigador investigador) {
		intereses.add(interes);
		interes.suscribirInvestigador(investigador);
	}
	
	public void desuscribir(Interes interes, Investigador investigador) {
		intereses.remove(interes);
		interes.desuscribirInvestigador(investigador);
	}
	
	//Cuando llega un nuevo articulo, lo agrega a la lista y notifica a todos los intereses
	public void addArticulo(Articulo articulo) {
		articulos.add(articulo);
		this.notificar(articulo);
	}
	
	public void notificar(Articulo articulo) {
		intereses.stream()
				 .forEach(interes -> interes.notify(articulo));
	}
}
