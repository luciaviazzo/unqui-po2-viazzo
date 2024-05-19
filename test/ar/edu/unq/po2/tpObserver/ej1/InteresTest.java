package ar.edu.unq.po2.tpObserver.ej1;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

class InteresTest {
	
	private InteresTitulo interesTitulo;
	private InteresPalabraClave interesPalabras;
	private Articulo articulo;


	@BeforeEach
	void setUp()  {
		interesTitulo = new InteresTitulo("wollok"); 
		interesPalabras = new InteresPalabraClave("wollok"); 
		
		articulo = mock(Articulo.class);
	}

	@Test
	void testEsDeInteresSimple() {
		// set up
		when(this.articulo.getTitulo()).thenReturn("Aprende a programar con wollok");
		
		// excercise
		Boolean resultado = this.interesTitulo.esDeInteres(this.articulo);
		
		// verify
		assertTrue(resultado);
	}
	
	@Test
	void testNoEsDeInteresSimple() {
		// set up
		when(this.articulo.getTitulo()).thenReturn("Aprende a programar con java");
		
		// excercise
		Boolean resultado = this.interesTitulo.esDeInteres(this.articulo);
		
		// verify
		assertFalse(resultado);
	}
	
	@Test
	void testEsDeInteresCompuesto() {
		// set up
		List<String> palabrasClaves = Arrays.asList("Leer", "Programar", "wollok");
		when(this.articulo.getPalabrasClaves()).thenReturn(palabrasClaves);
		// excercise
		Boolean resultado = this.interesPalabras.esDeInteres(this.articulo);
		
		// verify
		assertTrue(resultado);
	}
	
	@Test
	void testNoEsDeInteresCompuesto() {
		
		// set up
		List<String> palabrasClaves = Arrays.asList("Leer", "Programar", "java");
		when(this.articulo.getPalabrasClaves()).thenReturn(palabrasClaves);
		
		// excercise
		Boolean resultado = this.interesPalabras.esDeInteres(this.articulo);
		
		// verify
		assertFalse(resultado);
	}
}
