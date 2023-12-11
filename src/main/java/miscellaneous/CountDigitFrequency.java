package miscellaneous;

public class CountDigitFrequency {
	
	// Given 6777 -> Count 7 in this : 3

	public static int countDigitFrequency(int num, int dig) {
		int rv = 0;

		while (num > 0) {
			int digit = num % 10;
			num = num / 10;
			if (digit == dig) {
				rv++;
			}
		}

		return rv;
	}

	public static void main(String[] args) {

		int num = 6777;
		System.out.println(countDigitFrequency(num, 7));

	}

}
