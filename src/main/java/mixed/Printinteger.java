package mixed;

import java.util.Scanner;

public class Printinteger {

	public static void main(String[] args) {
	
		@SuppressWarnings("resource")
		Scanner read = new Scanner(System.in); 
		System.out.println("Enter your number :");
		
		int num = read.nextInt();
		
		System.out.println("You Entered : "+ num);

	}

}
