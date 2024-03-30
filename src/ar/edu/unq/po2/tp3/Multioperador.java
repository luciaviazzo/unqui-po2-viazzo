package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Multioperador {
	
	private ArrayList<Integer> numeros;
	
	
	//Suma todos los elementos del Array
	public int suma() {
		int total = 0;
		for (int numero : numeros) {
			total = total + numero;
		}
		return total;
	}
	
	
	//Resta todos los elementos del Array
	public int resta() {
		int total = 0;
		for (int numero : numeros) {
			total = total - numero;
		}
		return total;
	}
	
	//Multiplica todos los elementos del Array
	public int multiplicacion() {
		int total = 0;
		for (int numero : numeros) {
			total = total * numero;
		}
		return total;
	}	
}
