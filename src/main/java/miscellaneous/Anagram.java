package miscellaneous;

import java.util.Arrays;

public class Anagram {

	// Given words are anagram or not : "triangle" -- "intregal";

	public static boolean isAnagram(char[] a, char[] b) {
		Arrays.sort(a);
		Arrays.sort(b);
		if (a.length != b.length) {
			return false;
		} else if (a.length == 0 || b.length == 0) {
			return false;
		} else {
			for (int i = 0; i < a.length; i++) {
				if (a[i] != b[i]) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {

		String str1 = "triangle";
		String str2 = "intregal";

		System.out.println(isAnagram(str1.toCharArray(), str2.toCharArray()));

	}

}