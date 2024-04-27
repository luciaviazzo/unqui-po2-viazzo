package ar.edu.unq.po2.tp7.actSemanal;

import java.time.LocalTime;

public class ActividadSemanal {

	private DiaDeLaSemana dia;
	private LocalTime hora;
	private int duracion;
	private Deporte deporte;
	
	
	public ActividadSemanal(DiaDeLaSemana dia, LocalTime hora, int duracion, Deporte deporte) {
		this.dia = dia;
		this.hora = hora;
		this.duracion = duracion;
		this.deporte = deporte;
	}
	
	
	public DiaDeLaSemana getDia() {
		return dia;
	}
	
	
	public LocalTime getHora() {
		return hora;
	}
	
	
	public int getDuracion() {
		return duracion;
	}
	
	
	public Deporte getDeporte() {
		return deporte;
	}
	
	
	//De lunes a miercoles el precio por hora de la actividad es de $500
	//De jueves a domingos el precio por hora de la ectividad es de $1000
	public double precioPorHora() {
        double precioHora;
        if (dia.ordinal() >= DiaDeLaSemana.LUNES.ordinal() && dia.ordinal() <= DiaDeLaSemana.MIERCOLES.ordinal()) {
        	precioHora = 500;
        } else {
        	precioHora = 1000;
        }
        return precioHora;
	}
	
	
	//Se agregan $200 por cada punto de coplejidad que tine el deporte
	public double extraPorComplejidad() {
		return deporte.getNivelComplejidad() * 200;
	}
	
	
	//El precio final de la actividad es: el precio por hora * cantidad de horas + el extra por complejidad
	public double precioFinal() {
		return this.precioPorHora() * duracion + this.extraPorComplejidad();
	}

}
