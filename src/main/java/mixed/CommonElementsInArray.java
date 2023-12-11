package mixed;

public class CommonElementsInArray {

	public static void main(String[] args) {
		int[] a = { 75, 50, 15, 28, 20, 55 };
		int[] b = { 75, 50, 15, 28, 20, 55 };

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					System.out.println(a[i]);
				}
			}
		}

	}
}
