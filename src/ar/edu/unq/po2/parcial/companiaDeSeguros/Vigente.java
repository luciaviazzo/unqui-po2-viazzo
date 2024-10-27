package ar.edu.unq.po2.parcial.companiaDeSeguros;

public class Vigente extends Fase{

	public Vigente() {
		super();
	}

	@Override
	public void agregarItem(Item item, Poliza poliza) {
		//una Poliza vigente no puede agregar Items
		cancelar(poliza);

	}

	@Override
	public void aplicarDescuento(Poliza poliza) {
		poliza.eliminarGA();

	}
	
	public void cancelar(Poliza poliza) {
		//poliza.eliminarGA();
		poliza.setEstadoPoLiza(new Abierta());
	}
}
