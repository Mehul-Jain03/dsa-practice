package arrays;

public class MaxAndMinInMultiDimensionalArray {

	public int getMinOf2DArray(int arr[][]) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (arr[i][j] < min) {
					min = arr[i][j];
				}
			}
		}
		return min;
	}

	public int getMaxOf2DArray(int arr[][]) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (arr[i][j] > max) {
					max = arr[i][j];
				}
			}
		}
		return max;
	}

	public static void main(String[] args) {

		int arr[][] = { { 13, 12 }, { 56, 9 }, { 59, 23 } };
		MaxAndMinInMultiDimensionalArray val = new MaxAndMinInMultiDimensionalArray();
		System.out.println("Max Value is ------> " + val.getMaxOf2DArray(arr));
		System.out.println("Min Value is ------> " + val.getMinOf2DArray(arr));

	}

}
