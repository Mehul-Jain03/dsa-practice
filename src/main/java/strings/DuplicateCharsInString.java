package strings;

import java.util.HashMap;

import java.util.Map;

public class DuplicateCharsInString {

	public static void duplicateChars(String str) {

		char[] chars = str.toCharArray();

		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

		for (char c : chars) {
			if (!hm.containsKey(c)) {
				hm.put(c, 1);
			} else {
				hm.put(c, hm.get(c) + 1);
			}
		}

		for (Map.Entry<Character, Integer> mapElement : hm.entrySet()) {
			char key = (char) mapElement.getKey();
			int value = ((int) mapElement.getValue());

			if (value > 1)
				System.out.println(key + ", count = " + value);
		}
	}

	public static void main(String[] args) {

		String str = "Automation Challneges in Niyo";

		duplicateChars(str);

	}

}