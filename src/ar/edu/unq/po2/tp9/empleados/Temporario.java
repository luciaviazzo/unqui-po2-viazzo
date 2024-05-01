package ar.edu.unq.po2.tp9.empleados;

public class Temporario extends Empleado{
	
	public double sueldoBasico;
	public int cantHoras;
	private boolean esPadre;
	private boolean esCasado;

	
	@Override
	public double sueldoBruto() {
		return sueldoBasico + this.montoPorHorasExtra();
	}
	
	
	public double montoPorHorasExtra() {
		return cantHoras * 5;
	}

	@Override
	public double bonoExtra() {
		return (esPadre && esCasado) ? 100 : 0;
	}
	
}
