package ar.edu.unq.po2.parcial.planDeAhorro;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestPlan {

	private PlanDeAhorro plan;
	private Retribucion retribucion;
	private Cliente cliente;

	
	@BeforeEach
	void setUp() throws Exception {
		plan = new PlanDeAhorro(cliente, "marca", "modelo", 24, "123", retribucion);
	}

	
	@Test
	void testPagarPrimeraCuotaRestaUnaCuotaCambiaDeEstado() {
		
		plan.pagarCuota();
		assertEquals(plan.getCuotas(), 23);
        assertTrue(plan.getEstado() instanceof Vigente);
	}	
	
	
}
