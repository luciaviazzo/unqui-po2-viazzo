package ar.edu.unq.po2.tp2;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Date;
import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TemporarioTest {

	public Temporario empleadoTemporario;

	@BeforeEach
	void setUp()  {
		empleadoTemporario = new Temporario ("Julian", "Calle 789", "divorciado", LocalDate.of(1965, 8, 10),100000, LocalDate.of(2023, 5, 10) , 15);
	}
	
	@Test
	void horasExtras() {
		assertEquals(600, empleadoTemporario.adicionalPorHorasExtras());
	}
		
	@Test
	void obraSocial() {
		assertEquals(10085, empleadoTemporario.retencionesPorObraSocial());
	}
	
	void jubilacion() {
		assertEquals(10135, empleadoTemporario.aportesJubilatorios());
	}
	
	
	@Test
	void sueldoBruto() {
		assertEquals(100600, empleadoTemporario.calcularSueldoBruto());
	}
	
	@Test
	void retenciones() {
		assertEquals(20220, empleadoTemporario.calcularRetenciones());
	}
	
	@Test
	void sueldoNeto() {
		assertEquals(80380, empleadoTemporario.calcularSueldoNeto());
	}
}
