package ar.edu.unq.po2.parcial.airport;

import java.time.LocalDate;

public interface Aeropuertos {

	public void estadoOK();
	public void aeropuertoCerradoPorClima(WeatherEvent reason);
	public void aeropuertoCerrado(String reason);
	public void vueloDespegando(String flightNumber, LocalDate time);
	public void vueloAterrizando(String flightNumber, LocalDate time);
}
