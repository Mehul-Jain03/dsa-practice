package sortingalgos;

public class ArraysSort {

	public static void main(String[] args) {

		int[] arr = { 12, 34, 14, 1, 45, 4 };
		int temp;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}
		}

		for (int i : arr) {
			System.out.print(i + " ");
		}

	}
}