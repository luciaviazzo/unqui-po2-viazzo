package ar.edu.unq.po2.parcial.secretariaDeInfraestructura;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp8.guerrero.IMoneda;

class TestSec {

	private Programa masAguaPotable, masExtraccion;
	private Proyecto construccionPozoExtraccion, conexionARed, ampliacionRed;
	private Empleado empleado, lider;
	

	@BeforeEach
	void setUp() throws Exception {
		
		empleado = mock(Empleado.class);
		lider = mock(Empleado.class);
		
		ampliacionRed = new Proyecto("ampliacionRed", LocalDate.of(2024, 6, 2), lider, 10);
		construccionPozoExtraccion = new Proyecto("construccionPozoExtraccion", LocalDate.of(2020, 4, 2), lider, 5);
		conexionARed = new Proyecto("conexionARed", LocalDate.of(2021, 6, 3), lider, 1);
		masAguaPotable = new Programa("masAguaPotable", lider, 10000);
		masExtraccion = new Programa("masExtraccion", lider, 10000);
		
		ampliacionRed.agregarEmpleado(empleado);
		construccionPozoExtraccion.agregarEmpleado(empleado);
		ampliacionRed.agregarEmpleado(empleado);
		
		masExtraccion.agregarActividad(construccionPozoExtraccion);
		masExtraccion.agregarActividad(conexionARed);
		
		masAguaPotable.agregarActividad(ampliacionRed);
		masAguaPotable.agregarActividad(masExtraccion);
		
		
	}

	@Test
	void testFechaDeInicio() {
		
		assertEquals(masAguaPotable.getFechaInicio(), LocalDate.of(2020, 4, 2));
	}
	
	
	@Test
	void testInvesionTotal() {
		
		when(lider.sueldoDiario()).thenReturn((float) 10000);
		when(empleado.sueldoDiario()).thenReturn((float) 10000);
		
		assertEquals(masAguaPotable.inversionTotal(), 478000);
	}
	
	

}
