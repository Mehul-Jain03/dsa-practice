package miscellaneous;

public class PalindromeString {
	
	public static boolean isPalindrome(String str) {
		String s = "";
		for(int i = str.length()-1;i>=0;i--) {
			s = s+str.charAt(i); 
		}
		if(s.equals(str)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		String str = "racecar";
		System.out.print(isPalindrome(str));
	}

}
