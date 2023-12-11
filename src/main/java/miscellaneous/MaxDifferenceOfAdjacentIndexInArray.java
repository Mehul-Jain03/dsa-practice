package miscellaneous;

public class MaxDifferenceOfAdjacentIndexInArray {
	
	public static int maxDiffInArray(int[] arr) {
		int maxDiff = Integer.MIN_VALUE;
		int diff = Integer.MIN_VALUE;
		
		for(int i = 0; i<arr.length-1;i++) {
			diff = arr[i+1]-arr[i];
			if(maxDiff<diff) {
				maxDiff = diff;
			}
		}
		return maxDiff;
	}

	public static void main(String[] args) {
		
		int[] arr = { 10, -30, 20, 12 };
		System.out.println(maxDiffInArray(arr));
	}

}
