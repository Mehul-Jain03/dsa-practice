package mixed;

public class FactorialNumber {

	//Using For Loop
	public static void fact(int i) 
	{
		int factorial = 1;
		while (i > 1) {
		factorial = factorial * i;
		i--;
	}
	
		System.out.println(factorial);
}
	
	//Using Recursion
	
	public static int factorial(int num)
	{
		if(num == 0)
			return 1;
		
		else 
		return (num * factorial(num-1));
	}


	public static void main(String[] args) {

		fact(5);
		System.out.println(factorial(5));

	}
}
