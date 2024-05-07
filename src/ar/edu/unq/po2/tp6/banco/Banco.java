package ar.edu.unq.po2.tp6.banco;

import java.util.List;

public class Banco {

	private List<Cliente> clientes;
	private List<SolicitudCredito> solicitudes;
	
	
	public Banco(List<Cliente> clientes, List<SolicitudCredito> solicitudes) {
		this.clientes = clientes;
		this.solicitudes = solicitudes;
	}
	
	
	public void addCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	
	
	public void addSolicitud(SolicitudCredito solicitud) {
		solicitudes.add(solicitud);
	}
	
	
	//Filtra las solicitudes aprobadas
	//Suma el monto a desembolsar de cada una
	public double calcularMontoTotalDesembolsable() {
		return solicitudes.stream()
						  .filter(solicitud -> solicitud.esAceptable())
						  .mapToDouble(solicitud -> solicitud.getMonto())
						  .sum();
	}
}
