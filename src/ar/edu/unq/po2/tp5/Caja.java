package ar.edu.unq.po2.tp5;

import java.util.List;


public class Caja {
	
	private List<Pagable> pagables;
	
	
	public Caja(List<Pagable> pagables) {
		this.pagables = pagables; 
	}
	
	
	public void addPagable(Pagable pagable) {
		pagables.add(pagable);
	}
	
	
	//Registra a cada pagable de la lista, devuelve la suma de sus importes
	public double registrarPagables() {
		pagables.stream().forEach(pagable -> pagable.registrar());
		
		return this.sumarImportes();
	}
	
	
	//Suma todos los precios de los pagables de la lista
	//Devuelve la suma total
	public double sumarImportes() {
		return pagables.stream().mapToDouble(Pagable::getPrecio).sum();
	}

}

