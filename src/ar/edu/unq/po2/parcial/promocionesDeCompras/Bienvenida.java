package ar.edu.unq.po2.parcial.promocionesDeCompras;


public class Bienvenida extends Periodo {
	
	public Bienvenida() {
		this.cupones = 10;
	}

	@Override
	public double calcularDescuentos(double monto) {
		this.aplicarCupon();
		return monto * 15 / 100;
	}

	@Override
	public void realizarCompra(Cliente cliente) {
		if(this.cupones == 0) {
			cliente.SetPeriodo(new Consolidacion());
		}
	}
}
