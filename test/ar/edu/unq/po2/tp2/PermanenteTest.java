package ar.edu.unq.po2.tp2;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PermanenteTest {
	
	public Permanente empleadoPermanente;

	@BeforeEach
	void setUp()  {
		empleadoPermanente = new Permanente ("Martin", "Calle 456", "casado", LocalDate.of(1960, 7, 11),100000, 3 , 10);
	}
	
	@Test
	void salarioFamiliar() {
		assertEquals(550, empleadoPermanente.salarioFamiliar());
	}
	
	@Test
	void antiguedad() {
		assertEquals(500, empleadoPermanente.asignacionPorAntiguedad());
	}
	
	
	@Test
	void obraSocial() {
		assertEquals(10165, empleadoPermanente.retencionesPorObraSocial());
	}
	
	void jubilacion() {
		assertEquals(15157.5, empleadoPermanente.aportesJubilatorios());
	}
	
	
	@Test
	void sueldoBruto() {
		assertEquals(101050, empleadoPermanente.calcularSueldoBruto());
	}
	
	@Test
	void retenciones() {
		assertEquals(25322.5, empleadoPermanente.calcularRetenciones());
	}
	
	@Test
	void sueldoNeto() {
		assertEquals(75727.5, empleadoPermanente.calcularSueldoNeto());
	}

}
