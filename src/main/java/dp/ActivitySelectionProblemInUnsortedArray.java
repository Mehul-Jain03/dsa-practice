package dp;

import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelectionProblemInUnsortedArray {

	int start, finish;

	// Constructor
	public ActivitySelectionProblemInUnsortedArray(int start, int finish) {
		this.start = start;
		this.finish = finish;
	}

	// A utility function that is used for sorting in ascending order (s2.finish -
	// s1.finish -- Will give in Descending Order)
	// activities according to finish time
	public static void compare(ActivitySelectionProblemInUnsortedArray[] arr) {

		Arrays.sort(arr, new Comparator<ActivitySelectionProblemInUnsortedArray>() {
			@Override
			public int compare(ActivitySelectionProblemInUnsortedArray s1, ActivitySelectionProblemInUnsortedArray s2) {
				return s1.finish - s2.finish;
			}
		});
	}

	public static int countNoOfActivities(ActivitySelectionProblemInUnsortedArray[] arr) {
		int count = 1;
		int compare = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i].start >= arr[compare].finish) {
				count++;
				compare = i;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int n = 6;
		ActivitySelectionProblemInUnsortedArray[] arr = new ActivitySelectionProblemInUnsortedArray[n];
		arr[0] = new ActivitySelectionProblemInUnsortedArray(5, 9);
		arr[1] = new ActivitySelectionProblemInUnsortedArray(1, 2);
		arr[2] = new ActivitySelectionProblemInUnsortedArray(3, 4);
		arr[3] = new ActivitySelectionProblemInUnsortedArray(0, 6);
		arr[4] = new ActivitySelectionProblemInUnsortedArray(5, 7);
		arr[5] = new ActivitySelectionProblemInUnsortedArray(12, 13);
		compare(arr);
		
		//Print the array after conversion
		for(ActivitySelectionProblemInUnsortedArray a : arr) {
			System.out.println(a.finish);
		}
		
		System.out.println(countNoOfActivities(arr));

	}

}
