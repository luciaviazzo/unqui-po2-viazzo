package ar.edu.unq.po2.parcial.secretariaDeInfraestructura;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Proyecto extends Actividad{

	private int duracion;
	private LocalDate fechaInicio;
	private List<Empleado> empleados;
 	
	public Proyecto(String nombre, LocalDate fechaInicio, Empleado lider,  int duracion) {
		super(nombre, lider);
		this.fechaInicio = fechaInicio;
		this.duracion = duracion;
		this.empleados = new ArrayList<Empleado>();
	}

	@Override
	public float inversionTotal() {
		
		return (float) empleados.stream().mapToDouble((e -> e.sueldoDiario() * this.getDuracion())).sum() + sueldoDeLiderConPlus();
	}
	
	public float sueldoDeLiderConPlus() {
		return sueldoDeLider() +  sueldoDeLider() * 30 /100;
	}

	public float sueldoDeLider() {
		return this.getLider().sueldoDiario() * this.getDuracion();
	}

	@Override
	public LocalDate getFechaInicio() {
		return fechaInicio;
	}
	public void agregarEmpleado(Empleado empleado) {
		this.empleados.add(empleado);
	}
	
	public int getDuracion() {
		return duracion;
	}

}
