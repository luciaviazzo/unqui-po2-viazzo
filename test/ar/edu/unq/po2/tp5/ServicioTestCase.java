package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ServicioTestCase {
	
	private Agencia edesur;
	private Servicio luz;
	

	@BeforeEach
	void setUp() throws Exception {
		luz = new Servicio(edesur, 2500, 2);
	}
	

	@Test
	void test() {
		assertEquals(luz.getPrecio(), 5000);
	}

}
