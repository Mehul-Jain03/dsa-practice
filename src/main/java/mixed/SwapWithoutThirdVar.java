package mixed;

public class SwapWithoutThirdVar {

	public static void main(String[] args) {
	int x = 10;
	int y = 20;
	
	//1 Using third Variable
	/*int t;
	t = x;
	x=y;
	y=t;
	
	System.out.println(x);
	System.out.println(y);*/
	
	//2 Without using third variable
	/*
	x = x+y ; // 30
	y = x-y ; //10
	x = x-y; // 20
	*/

	x  = x*y ;
	y = x/y;
	x = x/y;
	
	System.out.println(x);
	System.out.println(y);
	
	
	
	
	
	
	
	
	}

}
