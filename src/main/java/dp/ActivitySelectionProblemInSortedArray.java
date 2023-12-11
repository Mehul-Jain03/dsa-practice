package dp;

public class ActivitySelectionProblemInSortedArray {

	public static int noOfActivity(int[] s, int[] f) {

		int count = 1;
		int compare = 0;
		for (int i = 1; i < f.length; i++) {
			if (s[i] >= f[compare]) {
				count++;
				compare = i;
			}
		}
		return count;
	}

	public static void main(String[] args) {

		int s[] = { 1, 3, 0, 5, 8, 5 };
		int f[] = { 2, 4, 6, 7, 9, 9 };

		System.out.println(noOfActivity(s, f));

	}

}
