package ar.edu.unq.po2.tp2;

import java.util.ArrayList;
import java.util.Date;
import java.util.function.Function;


public class Empresa {
	private String nombre;
	private int CUIT;
	private ArrayList<Empleado> empleados;

	public Empresa(String nombre, int CUIT) {
		this.nombre = nombre;
		this.CUIT = CUIT;
		this.empleados = new ArrayList<Empleado>();
	}


	public void agregarEmpleado(Empleado empleado) {
		empleados.add(empleado);
	}

	private float calcularTotal(Function<Empleado, Float> calcular) {
		float total = 0;
		for (Empleado empleado : empleados) {
			total += calcular.apply(empleado);
		}
		return total;
	}

	public float calcularTotalRetenciones() {
		return calcularTotal(Empleado::calcularRetenciones);
	}

	public float calcularTotalSueldosNetos() {
		return calcularTotal(Empleado::calcularSueldoNeto);
	}

	public float calcularTotalSueldosBrutos() {
		return calcularTotal(Empleado::calcularSueldoBruto);
	}
	
	public void liquidarSueldos(Date fecha) {
		for (Empleado empleado : empleados) {
			empleado.generarRecibo(fecha);
		}
	}
}
