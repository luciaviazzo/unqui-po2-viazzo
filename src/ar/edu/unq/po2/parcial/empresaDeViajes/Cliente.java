package ar.edu.unq.po2.parcial.empresaDeViajes;

import java.util.List;

public class Cliente {

	private List<Producto> productos;
	
	public double getCostoTotal() {
		return productos.stream()
						.mapToDouble(producto -> producto.getCosto())
						.sum(); 
	}
}
