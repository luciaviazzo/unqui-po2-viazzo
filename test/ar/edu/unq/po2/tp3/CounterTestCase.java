package ar.edu.unq.po2.tp3;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class CounterTestCase {
	private Counter counter;
	private ArrayList<Integer> numbers;
	
	@BeforeEach
	public void setUp() throws Exception {

	counter = new Counter();

	counter.addNumber(102);
	counter.addNumber(321);
	counter.addNumber(5111);
	counter.addNumber(7);
	counter.addNumber(9);
	counter.addNumber(222);
	counter.addNumber(1);
	counter.addNumber(5);
	counter.addNumber(8);
	counter.addNumber(4);	
	
	}

	
	
	@Test
	public void testEvenNumbers() {
		int amount = counter.countEven();
		assertEquals(amount, 4);
	}
	
	
	@Test
	public void testUnevenNumbers() {
		int amount = counter.countUneven();
		assertEquals(amount, 6);
	}
	
	
	@Test
	public void testMultiplesNumbersOf3() {
		int amount = counter.countMultiplesOf(4);
		assertEquals(amount, 2);
	}
	
	
	@Test
	public void testNumberMoreEvenDigits() {
		assertEquals(counter.numberMoreEvenDigits(counter.getIntegerNumbers()), 222);
	}
	
	
	public void testMultipleOf() {
		assertEquals(counter.isMultiple(1000, 10000), 1000);
		assertEquals(counter.isMultiple(1000, 7), -1);
	}
}