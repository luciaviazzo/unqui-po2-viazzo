package ar.edu.unq.po2.parcial.airport;

import java.time.LocalDate;

public class AeropuertosAdapter implements IAgent, InterfaceB{
	
	private Aeropuertos aeropuertos;

	@Override
	public void airportStatusOK() {
		aeropuertos.estadoOK();
		
	}

	@Override
	public void airportClosedWeahter(WeatherEvent reason) {
		aeropuertos.aeropuertoCerradoPorClima(reason);
	}

	@Override
	public void airportClosed(String reason) {
		aeropuertos.aeropuertoCerrado(reason);
		
	}

	@Override
	public void departFlight(String flightNumber, LocalDate time) {
		aeropuertos.vueloDespegando(flightNumber, time);
	}

	@Override
	public void arriveFlight(String flightNumber, LocalDate time) {
		aeropuertos.vueloAterrizando(flightNumber, time);
	}
}
