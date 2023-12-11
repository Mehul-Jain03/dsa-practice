package miscellaneous;

public class BinarySearchAlgo {

	
	public static int binarySearch(int[] arr, int data) {
		int l = 0;
		int h = arr.length - 1;

		while (l <= h) {
			int m = (l + h) / 2;
			if (data > arr[m]) {
				l = m + 1;
			} else if (data < arr[m]) {
				h = m - 1;
			} else {
				return m;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println(binarySearch(arr, 11));
	}

}