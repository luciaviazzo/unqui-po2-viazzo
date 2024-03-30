package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Counter {
	
	private ArrayList<Integer> integerNumbers;
	
	
	public Counter () {
		this.integerNumbers = new ArrayList<Integer>();
	}
	
	
	//PUNTO 1
	public void addNumber(int number) {
		integerNumbers.add(number);
	}
	
	
	public ArrayList<Integer> getIntegerNumbers() {
		return integerNumbers;
	}
	
	public int countMultiplesOf(int nro) {
		int count = 0;
		for (int number : integerNumbers) {
			if(this.isMultiple(number, nro)) {
				count ++;
			}
		}
		return count;
	}
	
	
	public int countEven() {
		return this.countMultiplesOf(2);
	}
	
	
	public int countUneven() {
		int count = 0;
		for (int number : integerNumbers) {
			if (!this.isMultiple(number, 2)) {
				count ++;
			}
		}
		return count;
	}
	
	
	//Indica si x es multiplo de y
	public boolean isMultiple(int x, int y) {
		return (x % y == 0);
	}
	
	
	
	//PUNTO 2
	//Receibe un arreglo de numeros y devuelve el nro con mayor cantidad de digitos pares
	public int numberMoreEvenDigits(ArrayList<Integer> numbers) {
		int maxNumber = 0;
		int amountDigits = 0;
		
		
		for (int number : numbers) {
			int lastAmountDigits = this.countEvenDigits(number); //Guarda la cantidad de digitos pares del numero que se esta evaluando
			
			//Si el numero que se esta evaluando tiene mas digitos pares que el anterior, se actualzan las variables
			if(amountDigits < lastAmountDigits) {
				maxNumber = number;
				amountDigits = lastAmountDigits;
			}
		}
		
		return maxNumber;
	}
	
	
	//Devuelve la cantidad de diigitos pares de un numero
	public int countEvenDigits(int number) {
		int amount = 0;

        while (number > 0) {
            int digit = number % 10; //Extraer el ultimo digito
            if (this.isMultiple(digit, 2)) { //Verificar si el dígito es par
            	amount++; 
            }
            number /= 10; // Elimina el ultimo digito
        }
        return amount; 
	}
	
	
	
	//PUNTO 3
	public int maxMultipl(int x, int y) {
		int max = -1;
		for (int i = 1000; i >= 0; i--) {
			if(this.isMultiple(i, x) && (this.isMultiple(i, y))) {
				max = i;
			}
		}
		return max;
	}
}
