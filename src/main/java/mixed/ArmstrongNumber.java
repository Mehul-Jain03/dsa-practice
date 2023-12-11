package mixed;

public class ArmstrongNumber {

	static int i = 0;

	static int sum = 0;

	public static void main(String[] args) {

		int abc = i;
		while (abc > 0) {
			int remainder = abc % 10;
			sum = sum + remainder * remainder * remainder;
			abc = abc / 10;
		}
		
		
		/*System.out.println(sum);
		System.out.println(i);*/
		
		
		if (i == sum) {
			System.out.println("Number is Armstrong num : " + ArmstrongNumber.i);
		} else {
			System.out.println("Number is not Armstrong num  : " + ArmstrongNumber.i);
		}
	}

}
