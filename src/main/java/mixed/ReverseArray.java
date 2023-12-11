package mixed;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner  in = new Scanner(System.in);
		System.out.println("Enter the size of an array :");
		int n = in.nextInt();
		
		//Declare an array
		int[] arr = new int[n];
		
		System.out.println("Enter the values in array");
		
		for (int i=0;i<n;i++) 
		{
			arr[i] = in.nextInt();
		}
		
		/*int temp;
		int start = 0;
		int end = n-1;
		
		while (start<end) 
		{
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;	
		}*/
		
		int[] result = new int[arr.length];
		int i = 0;
		for(int j=arr.length-1;j>=0;j--) 
		{
			result[i++] = arr[j];
		}
		
		System.out.println("Printing the values after reversing");
		
		/*for (int j=0;j<n;j++)
		{System.out.println(arr[j]);}*/
		for (int k=0;k<n;k++)
		{
			System.out.println(result[k]);
		}
	}

}
