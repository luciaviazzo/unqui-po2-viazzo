package ar.edu.unq.po2.tpObserver.ej1;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class InvestigadorTest {
	
	private Investigador investigador; //SUT
	private SRPB sistema; //DOC
	private InteresTitulo interesTitulo; //DOC
	private InteresPalabraClave interesPlabras; //DOC
	private Articulo ultimoArticulo; //DOC

	
	@BeforeEach
	void setUp() {
		
		sistema = mock(SRPB.class);
		interesPlabras = mock(InteresPalabraClave.class);
		interesTitulo = mock(InteresTitulo.class);
		
		investigador = new Investigador(sistema);
		sistema.suscribirObserver(investigador);
		investigador.addInteres(interesPlabras, "clases");
	}

	
	@Test
	void testAddIntereses() {
	
		// exercise
		investigador.addInteres(interesTitulo, "wollok");
		// verify
		assertEquals(2, this.investigador.getIntereses().size());
	}

	
	@Test
	void testUpdateEsDeInteres() {
		
		when(interesPlabras.esDeInteres(ultimoArticulo)).thenReturn(true);
		
		// exercise
		investigador.update(ultimoArticulo);
		
		// verify
		assertEquals(1, this.investigador.getArticulosDeInteres().size());
	}
	
	
	@Test
	void testUpdateNoEsDeInteres() {
		
		when(interesPlabras.esDeInteres(ultimoArticulo)).thenReturn(false);
		
		// exercise
		investigador.update(ultimoArticulo);
		
		// verify
		assertEquals(0, this.investigador.getArticulosDeInteres().size());
	}
}
