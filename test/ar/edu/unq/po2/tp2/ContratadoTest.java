package ar.edu.unq.po2.tp2;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ContratadoTest {	
	
	public Contratado empleadoContratado;
    
	@BeforeEach
	void setUp()  {
		empleadoContratado =  new Contratado("Lucia", "Calle 123", "soltero" ,LocalDate.of(1990, 5, 15),100000, 123 , "transferencia bancaria") ;
	}

	
	@Test
	void sueldoBruto() {
		assertEquals(100000, empleadoContratado.calcularSueldoBruto());
	}
	
	@Test
	void retenciones() {
		assertEquals(50, empleadoContratado.calcularRetenciones());
	}
	
	@Test
	void sueldoNeto() {
		assertEquals(99950, empleadoContratado.calcularSueldoNeto());
	}
}
