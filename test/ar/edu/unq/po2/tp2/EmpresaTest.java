package ar.edu.unq.po2.tp2;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpresaTest {

	private Empresa nuevaEmpresa;
	private Temporario empleadoTemporario;
	private Contratado empleadoContratado;
	private Permanente empleadoPermanente;

	@BeforeEach
	public void setUp () {

		empleadoTemporario = new Temporario ("Julian", "Calle 789", "divorciado", LocalDate.of(1965, 8, 10),100000, LocalDate.of(2023, 5, 10) , 15);
		empleadoContratado =  new Contratado("Lucia", "Calle 123", "soltero" ,LocalDate.of(1990, 5, 15),100000, 123 , "transferencia bancaria");
		empleadoPermanente = new Permanente ("Martin", "Calle 456", "casado" ,LocalDate.of(1960, 7, 11),100000, 3 , 10);
		nuevaEmpresa =  new Empresa("Google", 123456789);

		nuevaEmpresa.agregarEmpleado(empleadoTemporario);
		nuevaEmpresa.agregarEmpleado(empleadoContratado);
		nuevaEmpresa.agregarEmpleado(empleadoPermanente);	
	}
	
	@Test
	public void cantEmpleados() {
	    assertEquals(3, nuevaEmpresa.getEmpleados().size());
	}
	
	@Test
	public void totalNeto() {
		assertEquals(256057.5, nuevaEmpresa.calcularTotalSueldosNetos());
	}
	
	@Test
	public void totalBruto() {
		assertEquals(301650, nuevaEmpresa.calcularTotalSueldosBrutos());

	}
	@Test
	public void totalRetenciones() {
		assertEquals(45592.5, nuevaEmpresa.calcularTotalRetenciones());
	}
	
	@Test
	public void liquidacionSuledos() {
		assertEquals(0, empleadoTemporario.getRecibos().size());
		assertEquals(0, empleadoContratado.getRecibos().size());
		assertEquals(0, empleadoPermanente.getRecibos().size());
		nuevaEmpresa.liquidarSueldos(null);
		assertEquals(1, empleadoTemporario.getRecibos().size());
		assertEquals(1, empleadoContratado.getRecibos().size());
		assertEquals(1, empleadoPermanente.getRecibos().size());
	}
}
