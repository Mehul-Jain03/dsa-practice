package mixed;

public class SwapTwoInt {

	public static void main(String[] args) {

		/*
		 * int a = 100; int b = 200;
		 * 
		 * int temp = 0; 
		 * temp = a; 
		 * a = b; 
		 * b = temp;
		 * 
		 * System.out.println(a); System.out.println(b);
		 */

		int a = 100;
		int b = 200;
		a = b + a;
		b = a - b;
		a = a - b;
		System.out.println(a);
		System.out.println(b);

	}

}
