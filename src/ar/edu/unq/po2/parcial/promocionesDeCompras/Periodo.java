package ar.edu.unq.po2.parcial.promocionesDeCompras;

public abstract class Periodo {

	protected int cupones;

	public abstract double calcularDescuentos(double monto);

	public abstract void realizarCompra(Cliente cliente);
	
	public void aplicarCupon() {
		cupones = cupones - 1;
	}
}
