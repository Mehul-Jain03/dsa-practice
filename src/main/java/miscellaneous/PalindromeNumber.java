package miscellaneous;

public class PalindromeNumber {

	public static boolean isPalindromeNumber(int i) {
		if(i<=9) {
			return true;
		}
		int k=0;
		int j = i;
		while(j>0) {
		int l = j%10;	
		k = k*10 + l;
		j = j/10;
		}
		if(k-i==0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		int i = 131;
		System.out.println(isPalindromeNumber(i));
	}

}