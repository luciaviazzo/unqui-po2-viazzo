package ar.edu.unq.po2.parcial.airport;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class FilterAgent implements IAgent{

	private Set<IAgent> agents;
	private String flight;
	
	
	public FilterAgent(String flightNumber) {
		this.flight=flightNumber;
		this.agents= new HashSet<IAgent>();
	}
	
	
	public boolean isForThisFlight(String flightNumber) {
		return this.flight.equals(flightNumber);
	}

	public void addListener(IAgent agent) {
		this.agents.add(agent);
	}
	
	public void removeListener(IAgent agent) {
		this.agents.remove(agent);
	}

	@Override
	public void airportStatusOK() {
		this.agents.forEach((a)-> {a.airportStatusOK();});

	}

	@Override
	public void airportClosedWeahter(WeatherEvent reason) {
		this.agents.forEach((a)-> {a.airportClosedWeahter(reason);});
	}

	@Override
	public void airportClosed(String reason) {
		this.agents.forEach((a)-> {a.airportClosed(reason);});

	}

	@Override
	public void departFlight(String flightNumber, LocalDate time) {
		if(flightNumber.equals(this.flight)) {
			this.agents.forEach((a)-> {a.departFlight(flightNumber, time);});
		}
	}

	@Override
	public void arriveFlight(String flightNumber, LocalDate time) {
		if(flightNumber.equals(this.flight)) {
			this.agents.forEach((a)-> {a.arriveFlight(flightNumber, time);});
		}
	}
}
