package ar.edu.unq.po2.tp6.banco;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CreditoHipotecarioTestCase {
	
	private CreditoHipotecario solicitud; //SUT
	private Cliente cliente; //DOC
	private Propiedad propiedad; //DOC

	@BeforeEach
	void setUp() {
		
		cliente = mock(Cliente.class);
		propiedad = mock(Propiedad.class);
		
		solicitud = new CreditoHipotecario(cliente, 100000, 12, propiedad);
	}

	
	@Test
	void testSueldoClienteMayorA50PorcientoDeLaCuota() {
		
		when(cliente.getSueldoNeto()).thenReturn((double) 100000);
		
		assertTrue(solicitud.esCuotaMenorAPorcentajeSueldo(50));
	}
	
	
	@Test
	void testSueldoClienteMenorA50PorcientoDeLaCuota() {
		
		when(cliente.getSueldoNeto()).thenReturn((double) 10000);
		
		assertFalse(solicitud.esCuotaMenorAPorcentajeSueldo(50));
	}
	
	
	@Test
	void testGarantiaClienteMayorA70PorcientoCredito() {
		
		when(propiedad.getValorFiscal()).thenReturn((double) 1000000);
		
		assertTrue(solicitud.esMontoMenorAPorcentajeGarantia(70));
	}
	
	
	@Test
	void testGarantiaClienteMenorA70PorcientoCredito() {
		
		when(propiedad.getValorFiscal()).thenReturn((double) 100);
		
		assertFalse(solicitud.esMontoMenorAPorcentajeGarantia(70));
	}
	
	
	@Test
	void testClienteEsMenorDe65() {
		
		when(cliente.getEdad()).thenReturn(45);
		
		assertFalse(solicitud.esMayorA(65));
	}
	
	
	@Test
	void testClienteEsMayorDe65() {
		
		when(cliente.getEdad()).thenReturn(66);
		
		assertTrue(solicitud.esMayorA(65));
	}
	
	
	@Test
	void testClienteCumpleLasCondicioes() {
		
		when(cliente.getSueldoNeto()).thenReturn((double) 100000);
		when(propiedad.getValorFiscal()).thenReturn((double) 1000000);
		when(cliente.getEdad()).thenReturn(45);

		assertTrue(solicitud.esAceptable());
	}
	
	
	@Test
	void testClienteNoCumpleLasCondicioes() {
		
		when(cliente.getSueldoNeto()).thenReturn((double) 10000);
		when(propiedad.getValorFiscal()).thenReturn((double) 100);
		when(cliente.getEdad()).thenReturn(66);

		assertFalse(solicitud.esAceptable());
	}
}
