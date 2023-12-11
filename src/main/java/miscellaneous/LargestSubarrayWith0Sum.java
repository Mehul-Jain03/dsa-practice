package miscellaneous;

import java.util.HashMap;

public class LargestSubarrayWith0Sum {
	
	public static int largestSubarrayWith0Sum(int[] arr) {
		int ans = 0;
		
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		hm.put(0, -1);
		int sum = 0;
		for(int i = 0;i<arr.length;i++) {
			sum += arr[i];
			if(hm.containsKey(sum)==false) {
				hm.put(sum,i);
			}
			else {
				int len  =  i - hm.get(sum);
				if(len>ans) {
					ans = len;
				}
			}
		}
		
		return ans;
	}

	public static void main(String[] args) {

		int[] arr = { 2, 8, -3, -5, 2, -4, 6, 1, 2, 1, -3, 4 };

		System.out.println(largestSubarrayWith0Sum(arr));

	}

}