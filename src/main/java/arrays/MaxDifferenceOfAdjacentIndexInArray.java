package arrays;

public class MaxDifferenceOfAdjacentIndexInArray {

	public static int maxDifference(int[] a) {
		int maxDiff = 0;
		int diff = 0;
		for (int i = 0; i < a.length - 1; i++) {
			diff = a[i + 1] - a[i];
			if (maxDiff < diff) {
				maxDiff = diff;
			}
		}
		return maxDiff;
	}

	public static void main(String[] args) {

		int[] arr = { 10, -30, 20, 12 };
		int result = maxDifference(arr);
		System.out.println(result);

	}
}
