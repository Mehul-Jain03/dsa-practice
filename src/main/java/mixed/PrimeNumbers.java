package mixed;

public class PrimeNumbers {

	public static boolean isPrimeNumber(int num) {
		if (num <= 1) {
			return false;
		}

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {

				return false;
			}

		}

		return true;
	}

	public static void getPrimeNumbers(int num) {
		for (int i = 2; i <= num; i++) {
			if (isPrimeNumber(i)) {
				System.out.print(i + " ");
			}

		}

	}

	public static void main(String[] args) {

		/*
		 * System.out.println("12 is prime number : " + isPrimeNumber(12));
		 * System.out.println("15 is prime number : " + isPrimeNumber(15));
		 * System.out.println("101 is prime number : " + isPrimeNumber(101));
		 * System.out.println("17 is prime number : " + isPrimeNumber(17));
		 */
		getPrimeNumbers(17);

	}

}
