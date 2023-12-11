package miscellaneous;

public class PrintUniqueNumber {

	public static void printUniqueNumber(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			boolean isDuplicate = false;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j] && (i != j)) {
					isDuplicate = true;
					break;
				}
			}
			if (isDuplicate == false)
				System.out.println("This is the unique number :: " + arr[i]);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 9, 9, 1, 3, 4, 5, 1, 3, 4 };
		printUniqueNumber(arr);

	}

}