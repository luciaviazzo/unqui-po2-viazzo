package ar.edu.unq.po2.tp2;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReciboHaberesTest {
	
	public Temporario empleadoTemporario;
    public  ReciboHaberes recibo;
    
	@BeforeEach
	void setUp() {
		empleadoTemporario = new Temporario ("Julian", "Calle 789", "divorciado", LocalDate.of(1965, 8, 10),100000, LocalDate.of(2023, 5, 10) , 15);
    	empleadoTemporario.agregarRecibo(LocalDate.of(2023, 3, 1));
    	recibo = empleadoTemporario.getRecibos().get(0); // Aquí se obtiene el primer recibo del empleado
    	
	}

	@Test
	void nombreEmpleado() {
		assertEquals("Julian", recibo.getNombreEmpleado()); 
	}
	
	@Test
	void direccion() {
		assertEquals("Calle 789", recibo.getDireccion()); 
	}
	
	@Test
	void fechaEmision() {
		assertEquals(LocalDate.of(2023, 3, 1), recibo.getFechaEmision()); 
	}
	
	@Test
	void sueldoBruto() {
		assertEquals(100000, recibo.getSueldoBruto()); 
	}
	
	@Test
	void sueldoNeto() {
		assertEquals(80380, recibo.getSueldoNeto()); 
	}
	
	@Test
	void listaDeConceptos() {
		assertEquals(2, recibo.getConceptos().size()); 
		assertEquals("Obra Social", recibo.getConceptos().get(0).getConcepto());
		assertEquals(10085, recibo.getConceptos().get(0).getMonto()); 
		assertEquals("Jubilacion", recibo.getConceptos().get(1).getConcepto());
		assertEquals(10135, recibo.getConceptos().get(1).getMonto());
	}
}
