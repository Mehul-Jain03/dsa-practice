package miscellaneous;

import java.util.HashSet;

public class UniqueCharacter {

	public static boolean stringHasUniqueCharacter(String str) {
		if (str.length() == 0 || str == null) {
			return false;
		}
		if (str.length() == 1) {
			return true;
		}
		HashSet<Character> hs = new HashSet<Character>();
		for (char c : str.toCharArray()) {
			hs.add(c);
		}
		if (hs.size() == str.length()) {
			return true;
		}
		return false;
	}

	public static void stringHasUniqueCharacterViaForLoop(String str) {
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					System.out.println(str.charAt(i) + " is duplicate");
				}
			}
		}
	}

	public static void main(String[] args) {

		String str = "sudeep";
		stringHasUniqueCharacterViaForLoop(str);

	}

}