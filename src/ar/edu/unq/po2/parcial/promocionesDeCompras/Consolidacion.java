package ar.edu.unq.po2.parcial.promocionesDeCompras;

public class Consolidacion extends Periodo {
	
	public Consolidacion() {
		this.cupones = 3;
	}

	@Override
	public double calcularDescuentos(double monto) {
		double descuento = 0;
		if (monto > 50000 && this.cupones > 0) {
			descuento = monto * 40 / 100;
			this.aplicarCupon();
		} 
		return descuento;
	}

	@Override
	public void realizarCompra(Cliente cliente) {
		if(this.cupones == 0) {
			cliente.SetPeriodo(new Fidelizado());
		}
	}
}
