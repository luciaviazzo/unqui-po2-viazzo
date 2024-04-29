package ar.edu.unq.po2.tp8.poker;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PokerStatus {

	
	public PokerStatus(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
		// TODO Auto-generated constructor stub
	}

	
	public String verificar(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
		
		String resultado = "NADA";
		List<Carta> mazo = Arrays.asList(carta1, carta2, carta3, carta4, carta5);
		
		if(this.hayCartasDeValor(mazo, 4)) {
			resultado = "POKER";
		} else if(this.hayColor(mazo)) {
			resultado = "COLOR";
		} else if(this.hayCartasDeValor(mazo, 3)) {
			resultado = "TRIO";
		}
		
		return resultado;
	}
	
	
	public boolean hayCartasDeValor(List<Carta> mazo, int cantidad) {
		return mazo.stream()
				   .collect(Collectors.groupingBy(carta -> carta.getNumero(), Collectors.counting()))
				   .values().stream()
				   .anyMatch(count -> count >= cantidad);
  
	}
		
	
	public boolean hayColor(List<Carta> mazo) {
		return mazo.stream()
					.map(carta -> carta.getPalo())
					.distinct()
					.count() == 1;
	}
}
