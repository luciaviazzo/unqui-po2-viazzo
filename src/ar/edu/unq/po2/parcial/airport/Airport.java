package ar.edu.unq.po2.parcial.airport;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Airport {
	
	private Set<IAgent> agents;
	private Set<FilterAgent> filterAgents;
	
	public Airport() {
		this.agents = new HashSet<IAgent>();
		this.filterAgents = new HashSet<FilterAgent>();
	}
	
	
	public void addListener(IAgent agent) {
		agents.add(agent);
	}
	
	public void removeListener(IAgent agent) {
		agents.remove(agent);
	}
	
	public void addListenerToFly(IAgent agent, String flightNumber) {
		this.agents.remove(agent);
		FilterAgent correct = this.getFilterAgent(flightNumber);
		correct.addListener(agent);
	}
	
	public void removeListenerToFly(IAgent agent, String flightNumber) {
		this.getFilterAgent(flightNumber).removeListener(agent);
	}
	
	public FilterAgent getFilterAgent(String flighNumber) {
		FilterAgent fa = this.filterAgents.stream()
							 .filter(a -> a.isForThisFlight(flighNumber))
							 .findFirst().orElse(new FilterAgent(flighNumber));
		this.filterAgents.add(fa);
		return fa;
	}
	
	public void notifyAirporStatusOK() {
		this.getAgents().stream()
						.forEach(agent -> agent.airportStatusOK());
	}
	
	public void notifyAirportClosedWeather(WeatherEvent reason) {
		this.getAgents().stream()
						.forEach(agent -> agent.airportClosedWeahter(reason));
	}
	
	public void notifyAirportClosedWeather(String reason) {
		this.getAgents().stream()
						.forEach(agent -> agent.airportClosed(reason));
	}
	
	public void notifyDepartureFlight(String flightNumber) {
		this.getAgents().stream()
						.forEach(agent -> agent.departFlight(flightNumber, LocalDate.now()));
	}
	
	public void notifyArrivedFlight(String flightNumber) {
		this.getAgents().stream()
						.forEach(agent -> agent.arriveFlight(flightNumber, LocalDate.now()));
	}
	
	private Set<IAgent> getAgents(){
		Set<IAgent> all = new HashSet<IAgent>();
		all.addAll(this.agents);
		all.addAll(this.filterAgents);
		return all;
	}
}