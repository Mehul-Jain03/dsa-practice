package miscellaneous;

public class KadaneAlgorithm {

	// Max Sum of Continuous Subarray

	public static int kadaneAlgorithm(int[] arr) {
		int currSum = arr[0];
		int maxSum = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (currSum >= 0) {
				currSum += arr[i];
			} else {
				currSum = arr[i];
			}

			if (currSum > maxSum) {
				maxSum = currSum;
			}
		}

		return maxSum;
	}

	public static void main(String[] args) {

		int[] arr = { 4, 3, -2, 6, -14, 7, -1, 4, 5, 7, -10, 2, 9, -10, -5 - 9, 6, 1 };
		//int[] arr = { 4, 3, -2, 6 };
		System.out.println(kadaneAlgorithm(arr));
	}

}