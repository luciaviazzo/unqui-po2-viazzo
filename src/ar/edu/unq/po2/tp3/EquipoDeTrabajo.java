package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class EquipoDeTrabajo {

	private String nombre;
	private ArrayList<Persona> integrantes;
	
	public EquipoDeTrabajo(String nombre) {
		this.nombre = nombre;
		this.integrantes = new ArrayList<>();
	}
	
	
	public String getNombre() {
		return nombre;
	}
	
	
	public void agregarIntegrante(Persona integrante) {
		integrantes.add(integrante);
	}
	
	//Solucion utilizando metodos predefinidos
	/*
	public float promedioEdadIntegrantes() {
		return  (float) integrantes.stream()
                .mapToInt(Persona::calcularEdad) //Cada opbejto Persona se transforma en su edad
                .average()
                .orElse(0); //Si el arreglo está vacio, devuelve 0 y no error
	}*/
	
	
	//Solucion recorriendo el arreglo
	public float promedioEdadIntegrantes() {
		float acum = 0;
		float cont = 0;
		for (Persona persona : integrantes) {
			cont++;
			acum = acum + persona.calcularEdad();
		}	
		return (acum / cont);
	}
}
