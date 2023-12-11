package sortingalgorithems;

public class SelectionSort {

	/*
	 * Selection sort algorithm sorts an array by repeatedly finding the minimum
	 * element (considering ascending order) from unsorted part and putting it
	 * at the beginning. The algorithm maintains two subarrays in a given array.
	 * In every iteration of selection sort, the minimum element (considering
	 * ascending order) from the unsorted subarray is picked and moved to the
	 * sorted subarray.
	 */

	public static void main(String[] args) {

		int[] arr = { 23, 19, 27, 25, 29 };

		for (int i = 0; i < arr.length - 1; i++)

		{
			int min = i;

			for (int j = i + 1; j < arr.length; j++) {
				
				if(arr[j]<arr[min])
				{
					min = j;
				}

			}
			 int temp = arr[min];
	         arr[min] = arr[i];
	         arr[i] = temp;
		}

		for(int i : arr)
		{
			System.out.print(i+ " ");
		}
	}
}
