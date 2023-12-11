package miscellaneous;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharsInString {

	public static void dup(String str) {
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (char c : str.toCharArray()) {
			if (!hm.containsKey(c)) {
				hm.put(c, 1);
			} else {
				hm.put(c, hm.get(c) + 1);
			}
		}

		for (Map.Entry<Character, Integer> map : hm.entrySet()) {
			if (map.getValue() > 1) {
				System.out.println(map.getKey() + " " + map.getValue());
			}
		}
	}

	public static void main(String[] args) {
		String str = "Automation Challneges in Niyo";
		dup(str.toLowerCase());
	}

}
