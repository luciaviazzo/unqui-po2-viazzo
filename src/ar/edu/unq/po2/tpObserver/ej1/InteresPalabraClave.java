package ar.edu.unq.po2.tpObserver.ej1;

public class InteresPalabraClave extends Interes{

	public InteresPalabraClave(String valor) {
		super(valor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean esDeInteres(Articulo articulo) {
		return articulo.getPalabrasClaves().contains(this.valor);
	}

}
