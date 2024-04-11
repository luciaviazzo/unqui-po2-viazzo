package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoCooperativaTestCase {
	
	private ProductoCooperativa harina;

	
	@BeforeEach
	void setUp() throws Exception {
		harina = new ProductoCooperativa(500, 10, 0.10);
	}

	
	@Test
	void testPrecio() {
		assertEquals(450, harina.getPrecio());
	}
	
	
	@Test
	void testReducirStock() {
		assertEquals(10, harina.getStock());
		
		harina.reducirStock();
		assertEquals(9, harina.getStock());
	}

}
