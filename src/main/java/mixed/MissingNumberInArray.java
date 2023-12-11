package mixed;

public class MissingNumberInArray {

	public static void main(String[] args) {

		int real[] = { 1, 2, 3, 4, 5, 6, 7 };

		int len = real.length;

		int realSum = 0;

		int org = 0;

		for (int i = 0; i < len; i++) {
			realSum = realSum + real[i];

		}

		for (int j = 1; j <= len + 1; j++) {
			org = org + j;
		}

		int missingNumber = org - realSum;

		System.out.println("Missing Number is : " + missingNumber);

	}

}
