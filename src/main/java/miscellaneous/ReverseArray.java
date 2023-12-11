package miscellaneous;

public class ReverseArray {

	public static void reverseUsingThirdVariable(int[] arr) {
		int[] arrNew = new int[arr.length];
		int index = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			arrNew[index] = arr[i];
			index++;
		}

		for (int i : arrNew) {
			System.out.print(i + " ");
		}
	}

	public static void reverseWithoutUsingThirdVariable(int[] arr) {
		int i = 0;
		int j = arr.length - 1;
		while (i <= j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}

		for (int k : arr) {
			System.out.print(k + " ");
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 45, 23, 76, 15, 12 };
		// reverseUsingThirdVariable(arr);
		reverseWithoutUsingThirdVariable(arr);
	}

}