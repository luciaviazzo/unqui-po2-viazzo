package ar.edu.unq.po2.tpObserver.ej1;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class SRPB {
	
	private List<Articulo> articulos; 
	private Articulo ultimoArticulo;
	private List<Suscriptor> suscriptores;
	
	public SRPB(Articulo ultimoArticulo) {
		this.articulos = new ArrayList<>();
		this.ultimoArticulo = ultimoArticulo;
		this.suscriptores = new ArrayList<>();
	}
	
	public void suscribirObserver(Suscriptor suscriptor) {
		suscriptores.add(suscriptor);
	}
	
	public void desuscribirObserver(Suscriptor suscriptor) {
		suscriptores.remove(suscriptor);
	}
	
	public Articulo getUltimoArticulo() {
		return ultimoArticulo;
	}
	
	public void setUltimoArticulo(Articulo ultimoArticulo) {
		 this.ultimoArticulo = ultimoArticulo;
		 this.notificarObservers(ultimoArticulo);
	}
	
	public void notificarObservers(Articulo ultimoArticulo) {
		suscriptores.stream()
		   			.forEach(suscriptor -> suscriptor.update(ultimoArticulo));
	}
	
	public void addArticulo(Articulo articulo) {
		articulos.add(articulo);
		this.setUltimoArticulo(articulo);
	}
	
	public List<Suscriptor> getSuscriptores() {
		return suscriptores;
	}
	
	public List<Articulo> getArticulos() {
		return articulos;
	}
}
