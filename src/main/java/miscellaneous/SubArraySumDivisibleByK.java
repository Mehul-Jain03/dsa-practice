package miscellaneous;

import java.util.HashMap;

public class SubArraySumDivisibleByK {

	public static int subArraySumDivisibleByK(int[] arr, int num) {
		int ans = 0;

		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

		int sum = 0;
		int rem = 0;
		hm.put(0, 1);
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			rem = sum % num;
			if (rem < 0) {
				rem = rem + num;
			}
			if (hm.containsKey(rem)) {
				ans = ans + hm.get(rem);
				hm.put(rem, hm.get(rem) + 1);

			} else {
				hm.put(rem, 1);
			}
		}
		return ans;

	}

	public static void main(String[] args) {
		int[] arr = { 2, 3, 5, 4, 5, 3, 4 };
		int k = 7;
		System.out.println(subArraySumDivisibleByK(arr, k));

	}

}