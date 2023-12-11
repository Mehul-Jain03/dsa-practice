package mixed;

public class ReverseAnInteger {

	public static int reverseNumber(int n) {
		int rev = 0;
		while (n != 0) {
			int modulus = n % 10;
			rev = modulus + rev * 10;
			n = n / 10;
		}
		return rev;

	}

	public static void main(String[] args) {
		System.out.println(reverseNumber(490));
	}

}
