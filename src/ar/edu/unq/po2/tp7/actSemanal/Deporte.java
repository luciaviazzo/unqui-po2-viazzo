package ar.edu.unq.po2.tp7.actSemanal;

public enum Deporte {
	
	RUNNING(1),
	FUTBOL(2),
	BASKET(2),
	TENNIS(3),
	JABALINA(4);
	
	
	private final int nivelComplejidad;
	
	
	Deporte(int nivelComplejidad) {
		this.nivelComplejidad = nivelComplejidad;
	}
	
	
	public int getNivelComplejidad() {
		return nivelComplejidad;
	}
}
