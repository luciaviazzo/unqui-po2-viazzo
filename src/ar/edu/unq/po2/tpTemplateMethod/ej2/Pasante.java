package ar.edu.unq.po2.tpTemplateMethod.ej2;

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
