package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CuadradoTestCase {

	private Cuadrado cuadrado;
	private Punto puntoInferiorIzquierdo;

	@BeforeEach
	public void setUp() throws Exception {
		puntoInferiorIzquierdo = new Punto(0, 0);
		cuadrado = new Cuadrado(4, puntoInferiorIzquierdo);
		
		cuadrado.crear();
	}

	
	@Test
	public void testPuntoInferiorIzquierdo() {
		assertEquals(cuadrado.getPuntoInferiorIzquierdo().getX(), 0);
		assertEquals(cuadrado.getPuntoInferiorIzquierdo().getY(), 0);
	}
	
	@Test
	public void testPuntoInferiorDerecho() {
		assertEquals(cuadrado.puntoInferiorDerecho().getX(), 4);
		assertEquals(cuadrado.puntoInferiorDerecho().getY(), 0);
	}
	
	@Test
	public void testPuntoSuperiorIzquierdo() {
		assertEquals(cuadrado.puntoSuperiorIzquierdo().getX(), 0);
		assertEquals(cuadrado.puntoSuperiorIzquierdo().getY(), 4);
	}
	
	@Test
	public void testPuntoSuperiorDerecho() {
		assertEquals(cuadrado.puntoSuperiorDerecho().getX(), 4);
		assertEquals(cuadrado.puntoSuperiorDerecho().getY(), 4);
	}
	
	@Test
	public void testArea() {
		assertEquals(cuadrado.area(), 16);
	}
	
	@Test
	public void testPerimetro() {
		assertEquals(cuadrado.perimetro(), 16);
	}
}
