package ar.edu.unq.po2.tpTemplateMethod.ej2;

public class Planta extends Empleado{
	
	private double sueldoBasico;
	private int cantHijos;

	
	@Override
	public double sueldoBruto() {
		return sueldoBasico;
	}

	
	@Override
	public double bonoExtra() {
		return cantHijos * 150;
	}

}
