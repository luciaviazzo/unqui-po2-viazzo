package ar.edu.unq.po2.tp8.poker;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PokerStatusTestCase {
	
	private PokerStatus juego; //SUT
	private Carta carta1; //DOC
	private Carta carta2; //DOC
	private Carta carta3; //DOC
	private Carta carta4; //DOC
	private Carta carta5; //DOC

	@BeforeEach
	void setUp() {
		juego = new PokerStatus(carta1, carta2, carta3, carta4, carta5);
		carta1 = mock(Carta.class);
		carta2 = mock(Carta.class);
		carta3 = mock(Carta.class);
		carta4 = mock(Carta.class);
		carta5 = mock(Carta.class);
	}
	
	
	@Test
	void testHayTresCartasDelMismoColorYDelMismoValorHayPoker() {
		
		when(carta1.getPalo()).thenReturn("D");
		when(carta2.getPalo()).thenReturn("T");
		when(carta3.getPalo()).thenReturn("T");
		when(carta4.getPalo()).thenReturn("D");
		when(carta5.getPalo()).thenReturn("D");
		
		when(carta1.getNumero()).thenReturn(4);
		when(carta2.getNumero()).thenReturn(4);
		when(carta3.getNumero()).thenReturn(4);
		when(carta4.getNumero()).thenReturn(5);
		when(carta5.getNumero()).thenReturn(4);
		
		String resultado = juego.verificar(carta1, carta2, carta3, carta4, carta5);
		
		assertEquals(resultado, "POKER");
	}
	
	
	@Test
	void testTodasLasCartasSonDeColorRojoHayColor() {
		
		when(carta1.getPalo()).thenReturn("D");
		when(carta2.getPalo()).thenReturn("D");
		when(carta3.getPalo()).thenReturn("D");
		when(carta4.getPalo()).thenReturn("D");
		when(carta5.getPalo()).thenReturn("D");
		
		when(carta1.getNumero()).thenReturn(4);
		when(carta2.getNumero()).thenReturn(3);
		when(carta3.getNumero()).thenReturn(1);
		when(carta4.getNumero()).thenReturn(5);
		when(carta5.getNumero()).thenReturn(5);
		
		String resultado = juego.verificar(carta1, carta2, carta3, carta4, carta5);
		
		assertEquals(resultado, "COLOR");
	}
	
	
	@Test
	void testHayTresCartasDelMismoValorHayTrio() {
		
		when(carta1.getPalo()).thenReturn("T");
		when(carta2.getPalo()).thenReturn("C");
		when(carta3.getPalo()).thenReturn("D");
		when(carta4.getPalo()).thenReturn("T");
		when(carta5.getPalo()).thenReturn("T");
		
		when(carta1.getNumero()).thenReturn(5);
		when(carta2.getNumero()).thenReturn(3);
		when(carta3.getNumero()).thenReturn(1);
		when(carta4.getNumero()).thenReturn(5);
		when(carta5.getNumero()).thenReturn(5);
		

		String resultado = juego.verificar(carta1, carta2, carta3, carta4, carta5);
		
		assertEquals(resultado, "TRIO");
	}
	
	
	@Test
	void testNoHayNada() {
		
		when(carta1.getPalo()).thenReturn("T");
		when(carta2.getPalo()).thenReturn("C");
		when(carta3.getPalo()).thenReturn("D");
		when(carta4.getPalo()).thenReturn("T");
		when(carta5.getPalo()).thenReturn("T");
		
		when(carta1.getNumero()).thenReturn(4);
		when(carta2.getNumero()).thenReturn(3);
		when(carta3.getNumero()).thenReturn(3);
		when(carta4.getNumero()).thenReturn(5);
		when(carta5.getNumero()).thenReturn(5);
		
		String resultado = juego.verificar(carta1, carta2, carta3, carta4, carta5);
		
		assertEquals(resultado, "NADA");
	}
}
