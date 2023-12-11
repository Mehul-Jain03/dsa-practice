package mixed;

public class FibonnaciSeries {

	public void printFibonnaciViaRecusrison(int n) {

		for (int i = 0; i <= n; i++) {
			System.out.print(fib(i) + " ");
		}

	}

	public int fib(int i) {

		if (i <= 1) {
			return i;
		}

		return fib(i - 1) + fib(i - 2);
	}

	public void printFibonnaciViaWhileLoop(int n) {
		int a = 0;
		int b = 1;
		int i = 1;
		int sum = 0;
		while (i < n) {
			sum = a + b;
			System.out.print(sum + " ");
			a = b;
			b = sum;
			i++;
		}
		System.out.println();
	}

	public static void main(String[] args) {

		FibonnaciSeries fs = new FibonnaciSeries();
		fs.printFibonnaciViaWhileLoop(9);
		fs.printFibonnaciViaRecusrison(9);

	}

}
