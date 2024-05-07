package ar.edu.unq.po2.templateMethod;

public class CuentaCorriente extends Cuenta{
	
	private float porcentajeComision;
	private float montoNegativo;

	@Override
	public double calcularComision(double monto) {
		return monto * porcentajeComision / 100;
	}

	
}
