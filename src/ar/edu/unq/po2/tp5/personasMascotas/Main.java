package ar.edu.unq.po2.tp5.personasMascotas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
	
	private static Persona persona1;
	private static Persona persona2;
	private static Mascota mascota1;
	private static Mascota mascota2;

	public static void main (String [] args) {
		
		persona1 = new Persona("Trini", LocalDate.of(2000, 11, 28));
		persona2 = new Persona("Carla", LocalDate.of(2002, 05, 07));
		mascota1 = new Mascota("Tom", "pantera");
		mascota2 = new Mascota("Zaira", "faraonica");
		
		
		List<Object> collection = new ArrayList<>();
		
		

		collection.add(persona1);
		collection.add(persona2);
		collection.add(mascota1);
		collection.add(mascota2);
		
		
		
		//Mas alla de que sean objetos que responden al mismo mensaje, es necesario distinguir entre ellos,
		//de lo contrario, deberia hacer una superclase
		for (Object elemento : collection) {
            if (elemento instanceof Persona) {
                Persona persona = (Persona) elemento;
                System.out.println("Nombre de Persona: " + persona.getNombre());
            } else if (elemento instanceof Mascota) {
                Mascota mascota = (Mascota) elemento;
                System.out.println("Nombre de Mascota: " + mascota.getNombre());
            }
        }
	}
}
