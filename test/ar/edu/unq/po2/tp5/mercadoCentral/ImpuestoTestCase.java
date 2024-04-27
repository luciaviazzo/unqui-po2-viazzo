package ar.edu.unq.po2.tp5.mercadoCentral;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp5.mercadoCentral.Agencia;
import ar.edu.unq.po2.tp5.mercadoCentral.Impuesto;

class ImpuestoTestCase {
	
	private Agencia estado;
	private Impuesto ganancias;

	
	@BeforeEach
	void setUp() throws Exception {
		ganancias = new Impuesto (estado, 25000);
	}
	

	@Test
	void testPrecio() {
		assertEquals(ganancias.getPrecio(), 25000);
	}

}
