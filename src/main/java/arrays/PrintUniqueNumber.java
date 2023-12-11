package arrays;

import java.util.ArrayList;

public class PrintUniqueNumber {

	public static void printUniqueDigit(int[] arr) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			int k = 0;
			if (!al.contains(arr[i])) {
				al.add(arr[i]);
				k++;

				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] == arr[j]) {
						k++;

					}
				}
				System.out.println("The Value " + arr[i] + " is Repeated " + k + " times");
			}

		}

	}

	public static void main(String[] args) {
		int[] arr = { 9, 9, 1, 3, 4, 5, 1, 3, 4 };
		printUniqueDigit(arr);
	}
}
