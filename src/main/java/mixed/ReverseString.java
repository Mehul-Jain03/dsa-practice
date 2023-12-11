package mixed;

public class ReverseString {

	public static void main(String[] args) {

		String s = "Selenium is my Heart";
		
		int len = s.length();
		
		String rev = "";
		
		//1 Using For Loop
		for(int i= len-1; i>=0; i--)
		{
			rev = rev + s.charAt(i);
		}
		
		System.out.println(rev);
		
		//2 Using String Buffer
		StringBuffer sf = new StringBuffer(s);
		
		System.out.println(sf.reverse());
	}
	
	

}
