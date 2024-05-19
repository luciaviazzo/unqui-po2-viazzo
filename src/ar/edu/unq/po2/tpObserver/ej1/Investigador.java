package ar.edu.unq.po2.tpObserver.ej1;

import java.util.ArrayList;
import java.util.List;


public class Investigador implements Suscriptor{
	
	private SRPB srpb;
	private List<Interes> intereses;
	private List<Articulo> articulosDeInteres;
	
	public Investigador(SRPB srpb) {
		this.srpb = srpb;
		this.srpb.suscribirObserver(this); 
		this.articulosDeInteres = new ArrayList<>();
		this.intereses = new ArrayList<>();
	}

	@Override
	public void update(Articulo articulo) {
		this.verificarArticulo(articulo);
	}

	public void verificarArticulo(Articulo articulo) {
		if(this.esDeInteres(articulo)) {
			this.recibirArticulo(articulo);
		}
	}
	
	public boolean esDeInteres(Articulo articulo) {
		return intereses.stream()
						.anyMatch(interes -> interes.esDeInteres(articulo));
	}
	
	public void recibirArticulo(Articulo articulo) {
		articulosDeInteres.add(articulo);
	}
	
	public void publicarArticulo(Articulo articulo) {
		srpb.addArticulo(articulo);
	}
	
	public void addInteres(Interes interes, String valor) {
		interes.setValor(valor);
        intereses.add(interes);
    }

	public List<Interes> getIntereses() {
		return intereses;
	}
	
	public List<Articulo> getArticulosDeInteres() {
		return articulosDeInteres;
	}
}

