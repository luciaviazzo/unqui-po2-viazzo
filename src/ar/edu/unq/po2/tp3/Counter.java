package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Counter {
	
	private ArrayList<Integer> numbers;
	
	
	public Counter () {
		this.numbers = new ArrayList<Integer>();
	}
	
	
	public void addNumber(int number) {
		numbers.add(number);
	}
	
	
	public int countMultiplesOf(int nro) {
		int count = 0;
		for (int number : numbers) {
			if(number % nro == 0) {
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
		for (int number : numbers) {
			if(!(number % 2 == 0)) {
				count ++;
			}
		}
		return count;
	} 
}
