package mixed;

public class LargestAmontThreeNumbers {
	
	public static void main(String[] args)
	{
		int num1 = 800;
		int num2 = 900;
		int num3 = 500;
		if(num1>num2 && num1>num3)
		{
			System.out.println(num1);
		}
		else if (num2 > num3) 
		{
			System.out.println(num2);
		}
		else 
		{
			System.out.println(num3);
		}
		
	}

}
