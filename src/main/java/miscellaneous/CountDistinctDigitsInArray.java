package miscellaneous;

import java.util.HashSet;

public class CountDistinctDigitsInArray {

	public static int countDistinct(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			int flag = 0;
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j] && (i != j)) {
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				count++;
			}

		}
		return count;
	}
	
	
	public static int hashSetDistintDigits(int[] arr) {
		HashSet<Integer> hs = new HashSet<Integer>();
		for(int i : arr) {
			hs.add(i);
		}
		
		return hs.size();
	}

	public static void main(String[] args) {
		int[] arr = { 2, 5, 7, 2, 10, 7 };
		System.out.println(countDistinct(arr));
		//System.out.println(hashSetDistintDigits(arr));
	}
}
