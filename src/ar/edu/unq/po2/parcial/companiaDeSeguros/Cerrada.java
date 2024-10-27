package ar.edu.unq.po2.parcial.companiaDeSeguros;

public class Cerrada extends Fase {

	public Cerrada() {
		super();
	}


	@Override
	public void agregarItem(Item item, Poliza poliza) {
	poliza.agregarItem(item);
	poliza.agregarGastoAdm(new GastoAdministrativo("Recargo Por Extension" , tresPorCientoDelValorDelItem(item)));
	}

	
	@Override
	public void aplicarDescuento(Poliza poliza) {
		poliza.eliminarGastoAdministrativo(poliza.gastoAdministrativoMasAlto());

	}

	public void pagar(Poliza poliza) {
		poliza.setEstadoPoLiza(new Vigente());
	}

	private double tresPorCientoDelValorDelItem(Item item) {
		return item.getValor()*0.03;
	}

}
