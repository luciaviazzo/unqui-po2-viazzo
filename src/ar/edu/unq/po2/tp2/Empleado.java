package ar.edu.unq.po2.tp2;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Empleado {
	protected String nombre;
	protected String direccion;
	protected String estadoCivil;
	protected LocalDate fechaNac;
	protected float sueldoBasico;
	protected ArrayList<ReciboHaberes> recibos;

	public Empleado(String nombre, String direccion, String estadoCivil, LocalDate fechaNac, float sueldoBasico) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.estadoCivil = estadoCivil;
		this.fechaNac = fechaNac;
		this.sueldoBasico = sueldoBasico;
		this.recibos = new ArrayList<ReciboHaberes>();
	}
	
	
	public String getNombre() {
		return nombre;
	}
	
	
	public String getDireccion() {
		return direccion;
	}
	
	
	public float getSueldoBasico() {
		return sueldoBasico;
	}
	
	
	public void agregarRecibo(ReciboHaberes recibo) {
		recibos.add(recibo);
	}
	

	public int calcularEdad() {
		LocalDate currentDate = LocalDate.now();
		return currentDate.getYear() - fechaNac.getYear();
	}

	public abstract float calcularSueldoBruto();

	public abstract float calcularRetenciones();

	public float calcularSueldoNeto() {
		return (float) (calcularSueldoBruto() - calcularRetenciones());
	}
	
	public void generarRecibo(java.util.Date fecha) {
		ReciboHaberes recibo = new ReciboHaberes();
		this.compartirDatos(recibo, fecha);
		this.agregarRecibo(recibo);
	}
	
	public void compartirDatos(ReciboHaberes recibo, java.util.Date fecha) {
		recibo.setEmpleadoDatos(this.getNombre(), this.getDireccion(), fecha, this.getSueldoBasico(), this.calcularSueldoNeto());
	}
}
