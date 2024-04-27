package ar.edu.unq.po2.tp7.actSemenal;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp7.actSemanal.ActividadSemanal;
import ar.edu.unq.po2.tp7.actSemanal.Deporte;
import ar.edu.unq.po2.tp7.actSemanal.DiaDeLaSemana;
import ar.edu.unq.po2.tp7.actSemanal.Main;

class MainTestCase {
	
	private Main collection;
	private ActividadSemanal tenis;
	private ActividadSemanal futbol;
	private ActividadSemanal futbolSub20;
	private ActividadSemanal futbolJuvenil;
	private ActividadSemanal basket;
	

	@BeforeEach
	void setUp() throws Exception {
		tenis = new ActividadSemanal(DiaDeLaSemana.LUNES, LocalTime.of(9, 0), 2, Deporte.TENNIS);
		futbol = new ActividadSemanal(DiaDeLaSemana.JUEVES, LocalTime.of(9, 0), 3, Deporte.FUTBOL);
		basket = new ActividadSemanal(DiaDeLaSemana.LUNES, LocalTime.of(9, 0), 2, Deporte.BASKET);
		futbolSub20 = new ActividadSemanal(DiaDeLaSemana.JUEVES, LocalTime.of(9, 0), 3, Deporte.FUTBOL);
		futbolJuvenil = new ActividadSemanal(DiaDeLaSemana.JUEVES, LocalTime.of(9, 0), 3, Deporte.FUTBOL);
		
		collection = new Main();
		
		collection.addActividad(tenis);
		collection.addActividad(futbol);
		collection.addActividad(basket);
		collection.addActividad(futbolSub20);
		collection.addActividad(futbolJuvenil);		
	}
	

	@Test
	void testActividadesDeFutbol() {
		assertEquals(5, collection.getActividades().size());
		
		assertEquals(3, collection.actividadesDeFutbol().size());
	}
	
	
	@Test
	void testActividadesNivelEspecificoDeCompljidad() {
		assertEquals(5, collection.getActividades().size());
		
		assertEquals(4, collection.actividadesDeComplejidad(2).size());
		assertEquals(1, collection.actividadesDeComplejidad(3).size());
		assertEquals(0, collection.actividadesDeComplejidad(1).size());
	}
	
	
	@Test
	void testActividadDeMenorCosto() {
		assertEquals(basket, collection.actividadDeMenorCosto());
	}
	
	
	@Test
    public void testToString() {
        assertEquals("Deporte: FUTBOL. Dia: JUEVES A LAS: 09:00. Duración: 3 hora(s).", collection.toString(futbol));
    }

}
