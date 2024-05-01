package ar.edu.unq.po2.tp9.empleados;

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
