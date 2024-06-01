package ar.edu.unq.po2.tpObserver.ej1;

import java.util.HashSet;
import java.util.Set;

public abstract class Interes {

	protected String valor;
	protected Set<Investigador> investigadores;
	
	public Interes(String valor) {
		this.valor = valor;
		this.investigadores = new HashSet<Investigador>(); 
	}
	
	public void suscribirInvestigador(Investigador investigador) {
		investigadores.add(investigador);
	}
	
	public void desuscribirInvestigador(Investigador investigador) {
		investigadores.remove(investigador);
	}
	
	//Si es de interes, le envia el articulo a todos los investigadores de la lista 
	public void notify(Articulo articulo) {
		if(this.esDeInteres(articulo)) {
			investigadores.stream()
						  .forEach(investigador -> investigador.recibirArticulo(articulo));
		}
	}
	
	//Indica si el articulo contiene el valor de interes ver implementacion en subclases)
	public abstract boolean esDeInteres(Articulo articulo);
}
 