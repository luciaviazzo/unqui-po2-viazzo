package ar.edu.unq.po2.tp6.banco;

import java.util.List;

public class Banco {

	private List<Cliente> clientes;
	private List<SolicitudCredito> solicitudes;
	
	
	public Banco(List<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	
	public void addCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	
	
	public void addSolicitud(SolicitudCredito solicitud) {
		solicitudes.add(solicitud);
	}
	
	
	public void evaluar(SolicitudCredito solicitud) {
		
	}
}
