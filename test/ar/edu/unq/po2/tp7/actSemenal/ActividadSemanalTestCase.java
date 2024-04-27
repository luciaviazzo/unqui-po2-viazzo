package ar.edu.unq.po2.tp7.actSemenal;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp7.actSemanal.ActividadSemanal;
import ar.edu.unq.po2.tp7.actSemanal.Deporte;
import ar.edu.unq.po2.tp7.actSemanal.DiaDeLaSemana;

class ActividadSemanalTestCase {
	
	private ActividadSemanal tenis;
	private ActividadSemanal futbol;

	
	@BeforeEach
	void setUp() throws Exception {
		
		tenis = new ActividadSemanal(DiaDeLaSemana.LUNES, LocalTime.of(9, 0), 2, Deporte.TENNIS);
		futbol = new ActividadSemanal(DiaDeLaSemana.JUEVES, LocalTime.of(9, 0), 3, Deporte.FUTBOL);
	}

	
	@Test
	void testPrecioLunAMier() {	
		assertEquals(500, tenis.precioPorHora());
	}
	
	
	@Test
	void testPrecioJuevADom() {		
		assertEquals(1000, futbol.precioPorHora());
	}
	
	
	@Test
	void testExtraComplejidad() {		
		assertEquals(600, tenis.extraPorComplejidad());
		assertEquals(400, futbol.extraPorComplejidad());
	}	
	
	
	@Test
	void testPrecioFinal() {
		assertEquals(1600, tenis.precioFinal());
		assertEquals(3400, futbol.precioFinal());
	}

}
