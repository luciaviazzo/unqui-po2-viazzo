package ar.edu.unq.po2.tp7.actSemanal;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Main {
	
	private List<ActividadSemanal> actividades;

		
	public Main() {
		this.actividades = new ArrayList<ActividadSemanal>();
	}
	
	
	public List<ActividadSemanal> getActividades()  {
		return actividades;
	}
	
	
	public void addActividad(ActividadSemanal actividad) {
		actividades.add(actividad);
	}
	
	
	//A partir de la lista de actividades, filtro y devuelvo una lista con actividades de deporte futbol
	public List<ActividadSemanal> actividadesDeFutbol() {
		return actividades.stream()
						  .filter(actividad -> actividad.getDeporte() == Deporte.FUTBOL)
						  .toList();
	}
	
	
	//A partir de la lista de actividades, filtro y devuelvo una lista con actividades de una complejidad determianda
	public List<ActividadSemanal> actividadesDeComplejidad(int complejidad) {
		return actividades.stream()
						  .filter(actividad -> actividad.getDeporte().getNivelComplejidad() == complejidad)
						  .toList();
	}
	
	
	//A partir de la lista de actividades, devuelvo la cantidad de horas totales de las actividades
	public int cantHorasTotales() {
		return (int) actividades.stream()
								.mapToDouble(actividad -> actividad.getDuracion())
								.sum();
	}
	
	
	//A partir de la lista de actividades, busca aquella con mejor precioFinal
	public ActividadSemanal actividadDeMenorCosto() {
		return actividades.stream()
						  .min(Comparator.comparing(actividad -> actividad.precioFinal()))
						  .orElse(null);
	}
	
	
	//Imprime la actividad pasada por parametros, utilizando el metodo toString()
    public static String toString(ActividadSemanal actividad) {
        return "Deporte: " + actividad.getDeporte() + ". Dia: " + actividad.getDia() + " A LAS: " + actividad.getHora() + ". Duración: " + actividad.getDuracion() + " hora(s).";
    }

}
