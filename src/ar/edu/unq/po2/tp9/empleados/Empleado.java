package ar.edu.unq.po2.tp9.empleados;

public abstract class Empleado {
	

	public final double sueldo() {
		return this.sueldoBruto() + this.bonoExtra() - this.descuentos();
	}
	
	
	public abstract double sueldoBruto();
	

	public double descuentos() {
		return (this.sueldoBruto() + this.bonoExtra()) * 13 / 100;
	}
	

	public double bonoExtra() {
		return 0;
	}
}
