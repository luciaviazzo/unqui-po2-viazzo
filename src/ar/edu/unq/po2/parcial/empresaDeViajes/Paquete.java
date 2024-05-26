package ar.edu.unq.po2.parcial.empresaDeViajes;

import java.time.LocalDate;
import java.util.List;

public class Paquete implements Producto {
	
	private List<Producto> productos;
	private double porcentajeCostoGestion;

	@Override
	public LocalDate getFechaInicio() {
		//Precondicion: Existe una fecha menor
		return productos.stream()
						.map(producto -> producto.getFechaInicio())
						.min((fecha1, fecha2) -> fecha1.compareTo(fecha2))
						.orElse(null);
	}

	@Override
	public LocalDate getFechaFin() {
		//Precondicion: Existe una fecha mayor
				return productos.stream()
								.map(producto -> producto.getFechaInicio())
								.max((fecha1, fecha2) -> fecha1.compareTo(fecha2))
								.orElse(null);
	}

	@Override
	public double getCosto() {
		return this.getCostoFijo() + this.getCostoGestion();
	}
	
	//Suma de todos los costos de los productos de la lista
	public double getCostoFijo() {
		return productos.stream()
				.mapToDouble(producto -> producto.getCosto())
				.sum();
	}
	
	public double getCostoGestion() {
		return this.getCostoFijo() * this.porcentajeCostoGestion / 100;
	}
}
