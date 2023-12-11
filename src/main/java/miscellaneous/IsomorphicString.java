package miscellaneous;

import java.util.HashMap;

public class IsomorphicString {

	public static boolean isIsomorphic(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		}

		HashMap<Character, Character> hm1 = new HashMap<Character, Character>();
		HashMap<Character, Boolean> hm2 = new HashMap<Character, Boolean>();

		for (int i = 0; i < str1.length(); i++) {
			char ch1 = str1.charAt(i);
			char ch2 = str2.charAt(i);

			if (hm1.containsKey(ch1) == true) {
				if (hm1.get(ch1) != ch2) {
					return false;
				}
			} else {
				if (hm2.containsKey(ch2) == true) {
					return false;
				} else {
					hm1.put(ch1, ch2);
					hm2.put(ch2, true);
				}
			}

		}
		return true;
	}

	public static void main(String[] args) {

		String str1 = "abcd"; // abca -> false
		String str2 = "wxyz"; // wxyw -> false
		System.out.println(isIsomorphic(str1, str2));

	}

}