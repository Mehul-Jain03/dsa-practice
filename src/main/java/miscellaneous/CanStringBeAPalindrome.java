package miscellaneous;

import java.util.HashMap;
import java.util.Map;

public class CanStringBeAPalindrome {

	public static boolean canStringBeAPalindrome(String str) {
		if (str.length() == 0 || str == null) {
			return false;
		}
		if (str.length() == 1) {
			return true;
		}
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			if (!hm.containsKey(str.charAt(i))) {
				hm.put(str.charAt(i), 1);
			} else {
				hm.put(str.charAt(i), hm.get(str.charAt(i)) + 1);
			}
		}

		int odd = 0;

		for (Map.Entry<Character, Integer> map : hm.entrySet()) {
			if (map.getValue() % 2 != 0) {
				odd++;
			}
		}

		if (odd > 1) {
			return false;
		}

		return true;

	}

	public static void main(String[] args) {
		String str = "refer";
		System.out.println(canStringBeAPalindrome(str));
	}

}