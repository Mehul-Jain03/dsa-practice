package arrays;

public class SwapVariableWihtoutUsingThirdVariable {

	public static void main(String[] args) {

		int a = 5;
		int b = 10;
		System.out.println("-------Before Operations-------");
		System.out.println("a---------> " + a);
		System.out.println("b---------> " + b);
		a = a + b; // 15
		b = a - b; // 5
		a = a - b; // 10
		System.out.println("-------After Operations-------");
		System.out.println("a---------> " + a);
		System.out.println("b---------> " + b);
	}

}
