package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EquipoDeTrabajoTestCase {
	public EquipoDeTrabajo equipo = new EquipoDeTrabajo("Equipo 1");
	public 	Persona persona1 = new Persona("Juan", LocalDate.of(2004, 1, 1));
    public 	Persona persona2 = new Persona("Maria", LocalDate.of(2004, 1, 1));
    public Persona persona3 = new Persona("Pedro", LocalDate.of(2014, 1, 1));
    public Persona persona4 = new Persona("Ana", LocalDate.of(2014, 1, 1));
    public Persona persona5 = new Persona("Luis", LocalDate.of(2014, 1, 1));
	
	@BeforeEach
	void setUp() throws Exception {

        equipo.agregarIntegrante(persona1);
        equipo.agregarIntegrante(persona2);
        equipo.agregarIntegrante(persona3);
        equipo.agregarIntegrante(persona4);
        equipo.agregarIntegrante(persona5);
	}

	

	@Test
	public void test() {
		assertEquals(equipo.promedioEdadIntegrantes(), 14.0);
	}
}
