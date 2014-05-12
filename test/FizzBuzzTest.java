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
}
