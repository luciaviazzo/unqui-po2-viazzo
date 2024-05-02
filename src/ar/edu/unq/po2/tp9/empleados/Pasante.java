package ar.edu.unq.po2.tp9.empleados;

public class Pasante extends Empleado{
	
	private int cantHoras;

	@Override
	public double sueldoBruto() {
		return this.montoPorHorasTrabajadas();
	}
	
	public double montoPorHorasTrabajadas() {
		return cantHoras * 40;
	}

}
