package miscellaneous;

public class MinAndMaxInAnArray {

	public static void main(String[] args) {
		int[] arr = { 10, 15, 20, 5, 2, 9, 12, 39, 18, 6, 77, 55, 89, 1 };

		int max = arr[0];
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
			if (min > arr[i]) {
				min = arr[i];
			}
		}

		System.out.println(max);
		System.out.println(min);

	}

}