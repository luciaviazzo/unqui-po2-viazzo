package ar.edu.unq.po2.parcial.companiaDeSeguros;

public class Item {
	
	private int cantidad;
	private double valor;
	
	public Item(int cantidad, double valor) {
		super();
		this.cantidad = cantidad;
		this.valor = valor;
	}
	
	public int getCantidad() {
		return cantidad;
	}

	public double getValor() {
		return valor;
	}

	public double valorDeItem() {
		return this.cantidad * this.valor;
	}

}
