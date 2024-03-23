package ar.edu.unq.po2.tp2;

import java.util.Date;


public class ReciboHaberes {
	
	public String nombre;
	public String direccion;
	public Date fechaEmision;
	public float sueldoBruto;
	public float sueldoNeto;
	
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
	public void setFechaEmision(Date fechaEmision) {
		this.fechaEmision = fechaEmision;
	}
	
	
	public void setSueldoBruto(float sueldoBruto) {
		this.sueldoBruto = sueldoBruto;
	}
	

	public void setSueldoNeto(float sueldoNeto) {
		this.sueldoNeto = sueldoNeto;
	}
	
	
	public void setAll(Empleado empleado, Date fechaEmision) {
		setNombre(empleado.getNombre());
		setDireccion(empleado.getDireccion());
		setSueldoBruto(empleado.calcularSueldoBruto());
		setSueldoNeto(empleado.calcularSueldoNeto());
		setFechaEmision(fechaEmision);
	}


	public void generarRecibo(Empleado empleado, Date fechaEmision) {
		setAll(empleado, fechaEmision);
	}
}
