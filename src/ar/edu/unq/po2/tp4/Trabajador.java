package ar.edu.unq.po2.tp4;

import java.util.ArrayList;

public class Trabajador {
	
	private ArrayList<Ingreso> ingresosPercibidos; 
	
	
	public Trabajador() {
		this.ingresosPercibidos = new ArrayList<Ingreso>();
	}
	
	
	public void agregarIngreso(Ingreso ingreso) {
		ingresosPercibidos.add(ingreso);
	}
	
	
	public double getTotalPercibido() {
        return ingresosPercibidos.stream()
                       .mapToDouble(Ingreso::getMontoPercibido)
                       .sum();
    }
	
	
	public double getTotalImponible() {
        return ingresosPercibidos.stream()
                       .mapToDouble(Ingreso::getMontoImponible)
                       .sum();
    }
	
	
	public double getImpuestoAPagar() {
		return (this.getTotalImponible() * 0.02);
	}
}
