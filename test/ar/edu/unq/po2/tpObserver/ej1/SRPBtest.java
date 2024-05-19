package ar.edu.unq.po2.tpObserver.ej1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class SRPBtest {
	
	private SRPB sistema; //SUT
	private @Mock Investigador investigador; //DOC
	private @Mock Articulo ultimoArticulo; //DOC
	private @Mock Articulo articulo; //DOC
	

	@BeforeEach
	void setUp() {
		this.sistema = new SRPB(ultimoArticulo);
	}
	
	
	@Test
	void testSuscribir() {
		// exercise
		this.sistema.suscribirObserver(investigador);
		// verify
		assertEquals(1, this.sistema.getSuscriptores().size());
	}

	
	@Test
	void testDesuscribir() {
		// set up
		this.sistema.suscribirObserver(investigador);
		// exercise
		this.sistema.desuscribirObserver(investigador);
		// verify
		assertEquals(0, this.sistema.getSuscriptores().size());
	}
	
	
	@Test
	void testAgregarArticulo() {
		// exercise
		sistema.addArticulo(articulo);
		
		// verify
		assertEquals(sistema.getUltimoArticulo(), articulo);
		assertEquals(1, this.sistema.getArticulos().size());
	}
}
