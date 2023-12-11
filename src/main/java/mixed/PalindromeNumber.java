package mixed;

public class PalindromeNumber {

	public static void main(String[] args) {
		int num = 201;
		int reverse = 0, temp = num;
		while (temp > 0) {
			int remainder = temp % 10;
			reverse = remainder + reverse * 10;
			temp = temp / 10;
		}
		System.out.println(reverse);
		if (num == reverse) {
			System.out.println("Number is palindrome");
		} else {
			System.out.println("Number is not palindrome");
		}
	}
}
