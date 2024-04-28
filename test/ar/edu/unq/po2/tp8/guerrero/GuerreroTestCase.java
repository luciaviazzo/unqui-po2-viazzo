package ar.edu.unq.po2.tp8.guerrero;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GuerreroTestCase {

	
	private GuerreroDelAzar guerreroAtacante; //SUT
	private IGuerrero guerreroAdversario; //DOC
	private IMoneda moneda; //DOC;
	int puntosAtaque;
	int puntosVida;

	@BeforeEach
	void setUp() {
		
		puntosAtaque = 1000;
		puntosVida = 9000;
		moneda = mock(IMoneda.class);
		guerreroAdversario = mock(IGuerrero.class);
		
		guerreroAtacante = new GuerreroDelAzar(puntosAtaque, puntosVida, moneda);
	}
	

	@Test
	void testGuerreroAtacaAOtroYMonedaSaleCaraYDecuentaVidaAdversario() {
		
		when(moneda.esCara()).thenReturn(true);
		
		
		//EXCERCISE
		guerreroAtacante.atacar(guerreroAdversario);
		
		//VERIFY
		verify(guerreroAdversario).descontarVida(puntosAtaque);
		verify(guerreroAdversario, times(1)).descontarVida(puntosAtaque);
	}
	
	
	@Test
	void testGuerreroAtacaAOtroYMonedaSaleCruzYDecuentaVidaAtacante() {
		
		when(moneda.esCara()).thenReturn(false);
		when(moneda.esCruz()).thenReturn(true);
		
		
		//EXCERCISE
		guerreroAtacante.atacar(guerreroAdversario);
		
		//VERIFY
		verify(guerreroAdversario, never()).descontarVida(puntosAtaque);
		verify(guerreroAdversario, times(0)).descontarVida(puntosAtaque);
		
		assertEquals(guerreroAtacante.getPuntosVida(), 8000);
	}
}
