package ar.edu.unq.po2.tp6.banco;

import java.util.List;

public class Banco {

	private List<Cliente> clientes;
	
	
	public Banco(List<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	
	public void addCliente(Cliente cliente) {
		clientes.add(cliente);
	}
}
