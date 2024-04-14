package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CajaTestCase {

	private Agencia estado;
	private Caja caja1;
	private Producto harina = new Producto(500, 10);
	private Cooperativo leche = new Cooperativo(500, 10, 0.10);
	private Servicio luz = new Servicio(estado, 2500, 2);
	private Impuesto ganancias = new Impuesto (estado, 25000);
	
	
	@BeforeEach
	void setUp() throws Exception {
		caja1 = new Caja();
		
		caja1.addPagable(harina);
		caja1.addPagable(leche);
		//caja1.addPagable(luz);
		//caja1.addPagable(ganancias);
	}

	
	@Test
	void testRegistrarPagables() {
		assertEquals(10, harina.getStock());
		assertEquals(10, leche.getStock());
		
		assertEquals(caja1.registrarPagables(), 950);
		
		assertEquals(9, harina.getStock());
		assertEquals(9, leche.getStock());
	}

}
