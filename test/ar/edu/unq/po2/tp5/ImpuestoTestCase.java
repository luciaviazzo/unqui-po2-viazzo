package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ImpuestoTestCase {
	
	private Agencia estado;
	private Impuesto ganancias;

	
	@BeforeEach
	void setUp() throws Exception {
		ganancias = new Impuesto (estado, 25000);
	}
	

	@Test
	void test() {
		assertEquals(ganancias.getPrecio(), 25000);
	}

}
