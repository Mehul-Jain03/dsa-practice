package miscellaneous;

public class BubbleSort {

	public static int[] bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int a = arr[i];
					arr[i] = arr[j];
					arr[j] = a;
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = { 23, 12, 45, 23, 8, 27, 4 };
		bubbleSort(arr);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

}