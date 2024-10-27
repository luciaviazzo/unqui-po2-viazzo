package ar.edu.unq.po2.parcial.secretariaDeInfraestructura;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestMock {
	
	private Programa masAguaPotable, masExtraccion;
	private Proyecto construccionPozoExtraccion, conexionARed, ampliacionRed;
	private Empleado empleado, lider;

	@BeforeEach
	void setUp() throws Exception {
		
		
		empleado = mock(Empleado.class);
		lider = mock(Empleado.class);
		
		ampliacionRed = mock(Proyecto.class);
		construccionPozoExtraccion = mock(Proyecto.class);
		conexionARed = mock(Proyecto.class);
		
		
		masAguaPotable = new Programa(null, lider, 0);
		masExtraccion = new Programa(null, lider, 0);
		
		ampliacionRed.agregarEmpleado(empleado);
		construccionPozoExtraccion.agregarEmpleado(empleado);
		conexionARed.agregarEmpleado(empleado);
		
		masExtraccion.agregarActividad(construccionPozoExtraccion);
		masExtraccion.agregarActividad(conexionARed);
		
		masAguaPotable.agregarActividad(ampliacionRed);
		masAguaPotable.agregarActividad(masExtraccion);
	}
	
	@Test
	void testFechaDeInicio() {
		
		when(ampliacionRed.getFechaInicio()).thenReturn(LocalDate.of(2024, 6, 2));
		when(construccionPozoExtraccion.getFechaInicio()).thenReturn(LocalDate.of(2019, 5, 2));
		when(conexionARed.getFechaInicio()).thenReturn(LocalDate.of(2020, 4, 2));
		
		assertEquals(masAguaPotable.getFechaInicio(), LocalDate.of(2019, 4, 2));
	}

	
	@Test
	void testInversionTotal() {
		
		when(empleado.sueldoDiario()).thenReturn((float) 10000);
		when(lider.sueldoDiario()).thenReturn((float) 10000);
		
		when(construccionPozoExtraccion.getLider()).thenReturn(lider);
		when(conexionARed.getLider()).thenReturn(lider);
		when(ampliacionRed.getLider()).thenReturn(lider);
		
		when(construccionPozoExtraccion.getDuracion()).thenReturn(2);
		when(conexionARed.getDuracion()).thenReturn(2);
		when(ampliacionRed.getDuracion()).thenReturn(2);
		
		assertEquals(masAguaPotable.inversionTotal(), 728000);
	}
}
