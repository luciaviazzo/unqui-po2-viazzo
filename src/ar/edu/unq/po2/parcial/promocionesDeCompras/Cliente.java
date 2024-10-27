package ar.edu.unq.po2.parcial.promocionesDeCompras;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	private List<Compra> compras;
	private Periodo periodo;
	private String mail;
	
	public Cliente() {
		this.compras = new ArrayList<Compra>();
		this.periodo = new Bienvenida();
	}
	
	public String getMail() {
		return mail;
	}
	
	public void SetPeriodo(Periodo periodo) {
		this.periodo = periodo;
	}
	
	public void realizarCompra(double monto, double descuento, MedioDePago medioDePago) {
		compras.add(new Compra(monto, this.calcularDescuentos(monto), medioDePago));
		periodo.realizarCompra(this);
	}
	
	public double calcularDescuentos(double monto) {
		return periodo.calcularDescuentos(monto);
	}
	
	//Devuelve el ultimo elemento de la lista
	public Compra getUltimaCompra() {
		return compras.get(compras.size() - 1);
	}
}
