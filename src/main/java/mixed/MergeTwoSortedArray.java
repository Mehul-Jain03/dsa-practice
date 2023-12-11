package mixed;

public class MergeTwoSortedArray {

	public static void main(String[] args) {
		int a[] = { 10, 15, 20, 25 };
		int b[] = { 5, 6, 6, 10, 15 };

		int i = 0;
		int j = 0;

		while (i < a.length && j < b.length) {
			if (a[i] < b[j]) {
				System.out.println(a[i++]);
			} else {
				System.out.println(b[j++]);
			}

		}
		while (i < a.length) {
			System.out.println(a[i++]);
		}
		while (j < b.length) {
			System.out.println(b[j++]);
		}

	}

}
