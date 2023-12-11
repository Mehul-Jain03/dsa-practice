package mixed;

public class PrimeNumberCheck {

	public boolean isPrime(int n) {
		for (int i = 2; i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		PrimeNumberCheck prime = new PrimeNumberCheck();
		System.out.println(prime.isPrime(47));

	}

}
