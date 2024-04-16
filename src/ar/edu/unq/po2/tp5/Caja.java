package ar.edu.unq.po2.tp5;

import java.util.ArrayList;
import java.util.List;


public class Caja {
	
	private List<Pagable> pagables;
	
	
	public Caja() {
		this.pagables = new ArrayList<Pagable>(); 
	}
	
	
	public List<Pagable> getPagables() {
		return pagables;
	}
	
	
	public void addPagable(Pagable pagable) {
		pagables.add(pagable);
	}
	
	
	//Agrega un "pagable" a la lista y llama a su metodo registrar
	public void registrarPagables(Pagable pagable) {
		this.addPagable(pagable);
		pagable.registrar();
	}
	
	
	//Suma todos los precios de los pagables de la lista
	//Devuelve la suma total
	public double sumarImportes() {
		return pagables.stream()
					   .mapToDouble(Pagable::getPrecio)
					   .sum();
	}
}

