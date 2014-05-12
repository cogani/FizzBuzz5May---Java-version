public class FizzBuzz {

	public static String calculate(int aNumber) {
		String result = "";

		if(isDivisibleBy(aNumber, 3))
			result = "fizz";

		if(isDivisibleBy(aNumber, 5))
			result += "buzz";

		if (result.equals(""))
			return Integer.toString(aNumber);
		else
			return result;
	}
	
	
	private static boolean isDivisibleBy(int aNumber, int aDivisor){
		return (aNumber%aDivisor==0);
	}

}
