package ar.edu.unq.po2.tpObserver.ej1;

public abstract class Interes {

	protected String valor;
	
	public Interes(String valor) {
		this.valor = valor;
	}
	
	public void setValor(String valor) {
		this.valor = valor;
	}
	
	public abstract boolean esDeInteres(Articulo articulo);
}
 