package arrays;

public class SumOfElements {

	public int sumOfAllTheElements(int[] a) {
		int sum = 0;
		for (int i : a) {
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {

		SumOfElements as = new SumOfElements();
		int[] a = { -10, 20, -30, -40 };
		System.out.println(as.sumOfAllTheElements(a));

	}

}
