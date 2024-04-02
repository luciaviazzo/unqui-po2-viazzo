package ar.edu.unq.po2.tp4;

public class IngresoPorHorasExtras extends Ingreso{

	private int cantidadHoras;
	
	
	public IngresoPorHorasExtras(int mes, String concepto, double montoPercibido, int cantidadHoras) {
		super(mes, concepto, montoPercibido);
		this.cantidadHoras = cantidadHoras;
	}

	
	public int getCantidadHoras() {
		return cantidadHoras;
	}
	
	
	@Override
	public double getMontoImponible() {
		return 0;
	}
}
