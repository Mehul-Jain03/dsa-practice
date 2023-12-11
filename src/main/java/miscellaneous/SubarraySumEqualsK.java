package miscellaneous;

import java.util.HashMap;

public class SubarraySumEqualsK {
	
	public static int subarraySumEqualsK(int[] arr,int target) {
		
		int ans = 0;
		 
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		hm.put(0, 1);
		int sum=0;
		for(int i = 0;i<arr.length;i++) {
			sum += arr[i];
			if(hm.containsKey(sum-target)) {
				ans += hm.get(sum-target);
			}
			hm.put(sum,hm.getOrDefault(sum, 0)+1);
		}
		
		
		return ans;
		
	}

	public static void main(String[] args) {
		int[] arr = {3,9,-2,4,1,-7,2,6,-5,8,-3,-7,6,2,1};
		System.out.println(subarraySumEqualsK(arr, 5));

	}

}
