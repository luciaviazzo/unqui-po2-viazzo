package ar.edu.unq.po2.templateMethod;

public class CajaAhorro extends Cuenta{
	
	private double comisionExtraccion;

	@Override
	public double calcularComision(double monto) {
		return comisionExtraccion;
	}
}
