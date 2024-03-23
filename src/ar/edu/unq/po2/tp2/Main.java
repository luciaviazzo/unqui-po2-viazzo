package ar.edu.unq.po2.tp2;

import java.time.LocalDate;
import java.util.Date;

public class Main {
	
	public static void main(String[] args) {
	
		Empresa empresa = new Empresa("Empresa 1", 123456789);

		Permanente empleadoPermanente = new Permanente("Marta", "Callke 123", "soltera", LocalDate.of(1990, 5, 15), 3500.00f, 3, 2);

		Temporario empleadoTemporario = new Temporario("Juana", "Calle 456", "soltero", LocalDate.of(1853, 11, 10), 0000, new Date(24 / 11 / 31), 1);
		
		empresa.agregarEmpleado(empleadoPermanente); 
		empresa.agregarEmpleado(empleadoTemporario);

		empleadoPermanente.calcularSueldoBruto();
		empleadoTemporario.calcularSueldoBruto();

		empresa.calcularTotalSueldosBrutos();

		empresa.liquidarSueldos(null);

		System.out.println(empleadoPermanente.recibos.get(0).getNombreEmpleado());
		System.out.println(empleadoTemporario.recibos.get(0).getNombreEmpleado());
		
		
		
		//System.out.println(empleadoPermanente.recibos.get(0).getNombreEmpleado());
	}
}
