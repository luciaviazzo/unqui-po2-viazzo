package ar.edu.unq.po2.tp6.banco;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CreditoPersonalTestCase {

	private CreditoPersonal solicitud; //SUT
	private Cliente cliente; //DOC

	@BeforeEach
	void setUp() {
		
		cliente = mock(Cliente.class);
		
		solicitud = new CreditoPersonal(cliente, 100000, 12);
	}

	
	@Test
	void testSueldoClienteMayorA70PorcientoDeLaCuota() {
		
		when(cliente.getSueldoNeto()).thenReturn((double) 100000);
		
		assertTrue(solicitud.esCuotaMenorAPorcentajeSueldo(50));
	}
	
	
	@Test
	void testSueldoClienteMenorA70PorcientoDeLaCuota() {
		
		when(cliente.getSueldoNeto()).thenReturn((double) 10000);
		
		assertFalse(solicitud.esCuotaMenorAPorcentajeSueldo(50));
	}
	
	
	@Test
	void testSueldoAnualClienteMayorA15000() {
		
		when(cliente.calcularIngresoAnual()).thenReturn((double) 100000);
		
		assertTrue(solicitud.tieneIngresosAnualesMayoresA(15000));
	}
	
	
	@Test
	void testSueldoAnualClienteMenorA15000() {
		
		when(cliente.calcularIngresoAnual()).thenReturn((double) 100);
		
		assertFalse(solicitud.tieneIngresosAnualesMayoresA(15000));
	}
	
	
	@Test
	void testClienteCumpleLasCondicioes() {
		
		when(cliente.getSueldoNeto()).thenReturn((double) 100000);
		when(cliente.calcularIngresoAnual()).thenReturn((double) 100000);

		assertTrue(solicitud.esAceptable());
	}
	
	
	@Test
	void testClienteNoCumpleLasCondicioes() {
		
		when(cliente.getSueldoNeto()).thenReturn((double) 10000);
		when(cliente.calcularIngresoAnual()).thenReturn((double) 100);

		assertFalse(solicitud.esAceptable());
	}
}
