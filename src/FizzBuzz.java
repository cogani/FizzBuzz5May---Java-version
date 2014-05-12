
public class FizzBuzz {

	public static String calculate(int aNumber) {
		if(aNumber==3)
			return "fizz";
		
		if(aNumber==5)
			return "buzz";
		
		return Integer.toString(aNumber);			
	}

}
