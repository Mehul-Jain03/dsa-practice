package miscellaneous;

import java.util.HashMap;

public class LongestSubarrayWithSumDivisibleByK {

	public static int longestSubarrayWithSumDivisibleByK(int[] arr, int num) {
		int ans = 0;

		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		int sum = 0;
		int rem = 0;
		hm.put(0, -1);

		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			rem = sum % num;
			if (rem < 0) {
				rem = rem + num;
			}
			if (hm.containsKey(rem)) {
				int ind = hm.get(rem);
				int len = i - ind;
				if (len > ans) {
					ans = len;
				}
			} else {
				hm.put(rem, i);
			}
		}

		return ans;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 4, 6, 3, 5, 7, 8 };
		int k = 4;
		System.out.println(longestSubarrayWithSumDivisibleByK(arr, k));

	}
}