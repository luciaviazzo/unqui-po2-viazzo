package ar.edu.unq.po2.tp3;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class CounterTestCase {
	private Counter counter;
	
	@BeforeEach
	public void setUp() throws Exception {

	counter = new Counter();

	counter.addNumber(10);
	counter.addNumber(3);
	counter.addNumber(5);
	counter.addNumber(7);
	counter.addNumber(9);
	counter.addNumber(2);
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
	int amount = counter.countMultiplesOf(3);
	assertEquals(amount, 2);
	}
}