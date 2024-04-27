package ar.edu.unq.po2.tp5.mercadoCentral;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp5.mercadoCentral.Producto;

class ProductoTestCase {
	
	private Producto harina;

	
	@BeforeEach
	void setUp() throws Exception {
		
		harina = new Producto(500, 10);
	}

	
	@Test
	void testPrecio() {
		assertEquals(500, harina.getPrecio());
	}
	
	
	@Test
	void testReducirStock() {
		assertEquals(10, harina.getStock());
		
		harina.reducirStock();
		assertEquals(9, harina.getStock());
	}
}
