import static org.junit.Assert.*;

import org.junit.Test;


public class FizzBuzzTest {

	@Test
	public void will_return_1_when_1_is_supplied() {
		String result = FizzBuzz.calculate(1);
		
		assertEquals("1", result);
	}
	
	@Test
	public void will_return_2_when_2_is_supplied() {
		String result = FizzBuzz.calculate(2);
		
		assertEquals("2", result);
	}
	
	@Test
	public void will_return_fizz_when_3_is_supplied() {
		String result = FizzBuzz.calculate(3);
		
		assertEquals("fizz", result);
	}
	
	@Test
	public void will_return_buzz_when_5_is_supplied() {
		String result = FizzBuzz.calculate(5);
		
		assertEquals("buzz", result);
	}
	
	@Test
	public void will_return_buzz_when_6_is_supplied() {
		String result = FizzBuzz.calculate(6);
		
		assertEquals("fizz", result);
	}
	
	@Test
	public void will_return_buzz_when_10_is_supplied() {
		String result = FizzBuzz.calculate(10);
		
		assertEquals("buzz", result);
	}
	
	@Test
	public void will_return_fizzbuzz_when_15_is_supplied() {
		String result = FizzBuzz.calculate(15);
		
		assertEquals("fizzbuzz", result);
	}	
}
