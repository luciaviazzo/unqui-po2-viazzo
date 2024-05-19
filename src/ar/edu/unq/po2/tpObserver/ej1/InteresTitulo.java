package ar.edu.unq.po2.tpObserver.ej1;

public class InteresTitulo extends Interes{

	public InteresTitulo(String valor) {
		super(valor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean esDeInteres(Articulo articulo) {
		return articulo.getTitulo().contains(this.valor);
	}
}
