package mixed;

import java.util.Scanner;

public class CheckEvenOrOddInteger {

	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		System.out.println("Enter a number to check : ");
		
		int num = sc.nextInt();
		
		if(num%2==0)
		{
			System.out.println("Your Number is Even");
		}
		else 
		{
			System.out.println("Your Number is Odd");
		}

	}

}
