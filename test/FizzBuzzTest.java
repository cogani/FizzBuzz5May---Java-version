import static org.junit.Assert.*;

import org.junit.Test;


public class FizzBuzzTest {

	@Test
	public void will_return_1_when_1_is_supplied() {
		int result = FizzBuzz.calculate(1);
		
		assertEquals(1, result);
	}	

}
