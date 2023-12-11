package strings;

public class PalindromeString {

	public static boolean isPalindrome(String s) {
		int first = 0;
		int last = s.length() - 1;
		while (first < last) {
			if (s.charAt(first) != s.charAt(last)) {
				return false;
			}
			first++;
			last--;
		}
		return true;
	}

	public static void main(String[] args) {

		System.out.println(isPalindrome("mehul"));
	}
}
