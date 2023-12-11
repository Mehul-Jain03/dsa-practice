package arrays;

public class MultiplyMethod {

	// We are building multiply method without using * operator

	public static int multiply(int a, int b) {

		int result = 0;

		for (int i = 1; i <= b; i++) {
			result += a;
		}

		return result;

	}

	public static void main(String[] args) {

		int answer = multiply(4, 100);
		System.out.println(answer);

	}

}
