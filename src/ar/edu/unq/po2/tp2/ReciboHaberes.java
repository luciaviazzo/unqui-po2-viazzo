package ar.edu.unq.po2.tp2;

import java.util.Date;


public class ReciboHaberes {
	
	public String nombreEmpleado;
	public String direccion;
	public Date fechaEmision;
	public float sueldoBruto;
	public float sueldoNeto;
	
	
	public void setEmpleadoDatos(String nombreEmpleado, String direccion, Date fechaEmision, float sueldoBruto, float sueldoNeto) {
		this.nombreEmpleado = nombreEmpleado;
		this.direccion = direccion;
		this.sueldoBruto = sueldoBruto;
		this.sueldoNeto = sueldoNeto;
		this.fechaEmision = fechaEmision;
	}

}
