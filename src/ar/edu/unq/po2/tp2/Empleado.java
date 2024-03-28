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
	
	
	public ArrayList<ReciboHaberes> getRecibos() {
		return recibos;
	}
	

	public int calcularEdad() {
		LocalDate currentDate = LocalDate.now();
		return currentDate.getYear() - fechaNac.getYear();
	} {
		
	}
	

	public float calcularSueldoBruto() {
		return this.getSueldoBasico() + this.adicionalesPor();
	}
	
	
	protected float adicionalesPor() {
		return 0;
	}


	public float calcularRetenciones() {
		return this.retencionesPorObraSocial() + this.aportesJubilatorios();
	}
	
	
	public float retencionesPorObraSocial() {
		return 0;
	}
	
	
	public float aportesJubilatorios() {
		return 0;
	}
	

	public float calcularSueldoNeto() {
		return (float) (calcularSueldoBruto() - calcularRetenciones());
	}
	
	
	public void agregarRecibo(LocalDate fecha) {
        ReciboHaberes nuevoRecibo = new ReciboHaberes(this.getNombre(), this.getDireccion(), fecha, this.getSueldoBasico(), this.calcularSueldoNeto());
        recibos.add(nuevoRecibo);
        nuevoRecibo.agregarConceptos(this.retencionesPorObraSocial(), this.aportesJubilatorios());
	}

}
