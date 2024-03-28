package ar.edu.unq.po2.tp2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;


public class ReciboHaberes {
	
	private String nombreEmpleado;
	private String direccion;
	private LocalDate fechaEmision;
	private float sueldoBruto;
	private float sueldoNeto;
	private  ArrayList<DesgloceConceptos> conceptos;
	
	public ReciboHaberes(String nombreEmpleado, String direccion, LocalDate fechaEmision, float sueldoBruto, float sueldoNeto) {
		this.nombreEmpleado = nombreEmpleado;
		this.direccion = direccion;
		this.fechaEmision = fechaEmision;
		this.sueldoBruto = sueldoBruto;
		this.sueldoNeto = sueldoNeto;
		this.conceptos = new ArrayList<DesgloceConceptos>();
	}
	
	
	public String getNombreEmpleado() {
		return nombreEmpleado;
	}
	
	
	public String getDireccion() {
		return direccion;
	}
	
	
	public LocalDate getFechaEmision() {
		return fechaEmision;
	}
	
	
	public float getSueldoBruto() {
		return sueldoBruto;
	}
	
	
	public float getSueldoNeto() {
		return sueldoNeto;
	}
	
	
	public ArrayList<DesgloceConceptos> getConceptos() {
		return conceptos;
	}
	
	public void agregarConceptos(float montoObrSocial, float montoAportes) {
		conceptos.add(new DesgloceConceptos("Obra Social", montoObrSocial));
		conceptos.add(new DesgloceConceptos("Obra Social", montoAportes));
	}
}
