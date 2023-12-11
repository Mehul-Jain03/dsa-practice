package arrays;

public class MaxAndMinInArray {

	public static void main(String[] args) {
		int arr[] = { 10, 15, 20, 5, 2, 9, 12, 39, 18, 6, 77, 55, 89 };

		int smallest = arr[0];
		int largest = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < smallest)
				smallest = arr[i];
			if (arr[i] > largest)
				largest = arr[i];
		}

		System.out.println("The Smallest number in an Array is : " + smallest);
		System.out.println("The largest number in an Array is : " + largest);
	}

}
