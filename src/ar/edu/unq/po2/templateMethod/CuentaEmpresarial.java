package ar.edu.unq.po2.templateMethod;

public class CuentaEmpresarial extends Cuenta{
	
	private int cantMovimientosGratis;
	private int cantMovimientos;
	private float comisionExtraccion;

	@Override
	public double calcularComision(double monto) {
		return ((cantMovimientos <= cantMovimientosGratis)) ? 0 : comisionExtraccion;
	}

}
