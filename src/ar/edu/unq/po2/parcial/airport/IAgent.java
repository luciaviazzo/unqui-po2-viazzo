package ar.edu.unq.po2.parcial.airport;

import java.time.LocalDate;

public interface IAgent {

	public void airportStatusOK();
	public void airportClosedWeahter(WeatherEvent reason);
	public void airportClosed(String reason);
	public void departFlight(String flightNumber, LocalDate time);
	public void arriveFlight(String flightNumber, LocalDate time);
}
