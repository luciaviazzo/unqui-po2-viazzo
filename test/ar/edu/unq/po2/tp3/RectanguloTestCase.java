package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RectanguloTestCase {
	
	private Rectangulo rectangulo;
	private Punto puntoInferiorIzquierdo;

	@BeforeEach
	public void setUp() throws Exception {
		puntoInferiorIzquierdo = new Punto(0, 0);
		rectangulo = new Rectangulo(3, puntoInferiorIzquierdo, 5);
		
		rectangulo.crear();
	}

	
	@Test
	public void testPuntoInferiorIzquierdo() {
		assertEquals(rectangulo.getPuntoInferiorIzquierdo().getX(), 0);
		assertEquals(rectangulo.getPuntoInferiorIzquierdo().getY(), 0);
	}
	
	@Test
	public void testPuntoInferiorDerecho() {
		assertEquals(rectangulo.puntoInferiorDerecho().getX(), 5);
		assertEquals(rectangulo.puntoInferiorDerecho().getY(), 0);
	}
	
	@Test
	public void testPuntoSuperiorIzquierdo() {
		assertEquals(rectangulo.puntoSuperiorIzquierdo().getX(), 0);
		assertEquals(rectangulo.puntoSuperiorIzquierdo().getY(), 3);
	}
	
	@Test
	public void testPuntoSuperiorDerecho() {
		assertEquals(rectangulo.puntoSuperiorDerecho().getX(), 5);
		assertEquals(rectangulo.puntoSuperiorDerecho().getY(), 3);
	}
	
	@Test
	public void testArea() {
		assertEquals(rectangulo.area(), 15);
	}
	
	@Test
	public void testPerimetro() {
		assertEquals(rectangulo.perimetro(), 16);
	}
}
