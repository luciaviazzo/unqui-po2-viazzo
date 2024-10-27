package ar.edu.unq.po2.parcial.secretariaDeInfraestructura;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Programa extends Actividad{

	private float costoFijoPorGestion;
	private Empleado lider;
	private List<Actividad> actividades;
	
	public Programa(String nombre, Empleado lider , float costoFijoPorGestion) {
		super(nombre , lider);
		this.actividades = new ArrayList<Actividad>();
		this.costoFijoPorGestion = costoFijoPorGestion;
	}

	@Override
	public float inversionTotal() {
		return (float) actividades.stream()
							.mapToDouble(o-> o.inversionTotal())
							.sum() + this.getCostoFijoPorGestion();
	}

	@Override
	public LocalDate getFechaInicio() {
		return actividades.stream()
						  .map(a -> a.getFechaInicio())
						  .min((fecha1, fecha2) -> fecha1.compareTo(fecha2))
						  .orElse(null);
	}

	
	public void agregarActividad(Actividad actividad) {
		this.actividades.add(actividad);
	}
	public void sacarObra(Actividad actividad) {
		this.actividades.remove(actividad);
	}

	public float getCostoFijoPorGestion() {
		return costoFijoPorGestion;
	}

}
