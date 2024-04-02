package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TrabajadorTestCase {
	
	private Trabajador trabajador;
	private Ingreso ingresoEnero;
	private Ingreso ingresoFebrero;
	private Ingreso ingresoMarzo;
	private IngresoPorHorasExtras extrasEnero;
	private IngresoPorHorasExtras extrasFebrero;
	private IngresoPorHorasExtras extrasMarzo;
	

	@BeforeEach
	void setUp() throws Exception {
		
		trabajador = new Trabajador();
		
		ingresoEnero = new Ingreso(1, "trabajo", 200000);
		ingresoFebrero = new Ingreso(1, "trabajo", 250000);
		ingresoMarzo = new Ingreso(1, "trabajo", 300000);
		extrasEnero = new IngresoPorHorasExtras(1, "trabajo", 50000, 5);
		extrasFebrero = new IngresoPorHorasExtras(1, "trabajo", 20000, 2);
		extrasMarzo = new IngresoPorHorasExtras(1, "trabajo", 30000, 3);
		
		trabajador.agregarIngreso(ingresoEnero);
		trabajador.agregarIngreso(ingresoFebrero);
		trabajador.agregarIngreso(ingresoMarzo);
		trabajador.agregarIngreso(extrasEnero);
		trabajador.agregarIngreso(extrasFebrero);
		trabajador.agregarIngreso(extrasMarzo);
	}

	
	@Test
	void testTotalPercibido() {
		assertEquals(trabajador.getTotalPercibido(), 850000);
	}
	
	
	@Test
	void testTotalImponible() {
		assertEquals(trabajador.getTotalImponible(), 750000);
	}
	
	
	@Test
	void testImpuestoAPagar() {
		assertEquals(trabajador.getImpuestoAPagar(), 15000);
	}

}
