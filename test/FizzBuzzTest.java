import static org.junit.Assert.*;

import org.junit.Test;


public class FizzBuzzTest {

	@Test
	public void will_return_the_own_number_when_a_normal_number_is_supplied() {
		String result = FizzBuzz.calculate(1);
		
		assertEquals("1", result);
	}	
	
	@Test
	public void will_return_fizz_when_a_multiple_of_3_is_supplied() {
		String result = FizzBuzz.calculate(3);
		
		assertEquals("fizz", result);
	}
	
	@Test
	public void will_return_buzz_when_a_multiple_of_5_is_supplied() {
		String result = FizzBuzz.calculate(5);
		
		assertEquals("buzz", result);
	}	
	
	@Test
	public void will_return_fizzbuzz_when_a_multiple_of_15_is_supplied() {
		String result = FizzBuzz.calculate(15);
		
		assertEquals("fizzbuzz", result);
	}	
}
