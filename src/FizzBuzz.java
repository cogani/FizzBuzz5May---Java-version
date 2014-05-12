public class FizzBuzz {

	public static String calculate(int aNumber) {
		String result = "";

		if (aNumber % 3 == 0)
			result = "fizz";

		if (aNumber % 5 == 0)
			result += "buzz";

		if (result.equals(""))
			return Integer.toString(aNumber);
		else
			return result;
	}

}
