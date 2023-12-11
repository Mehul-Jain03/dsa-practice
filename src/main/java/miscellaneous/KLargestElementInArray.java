package miscellaneous;

import java.util.PriorityQueue;

public class KLargestElementInArray {

	public static void kLargestElementInArray(int[] arr, int n) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (i < n) {
				pq.add(arr[i]);
			} else {
				if (pq.peek()< arr[i]) {
					pq.remove();
					pq.add(arr[i]);
				}
			}
		}

		for (int i : pq) {
			System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		int[] arr = { 13, 46, 12, 56, 79, 34, 45 };
		kLargestElementInArray(arr, 3);
	}

}