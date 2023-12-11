package mixed;

import java.util.HashMap;

public class NumberOfAsBsCs {

	public static void main(String[] args) {

		String s1 = "ababbdGgdjjjjsdb";

		HashMap<Character, Integer> h1 = new HashMap<>();

		for (int i = 0; i < s1.length(); i++) {
			char c = s1.charAt(i);
			if (h1.containsKey(c)) {
				int count = h1.get(c);
				h1.put(c, ++count);
			} else
				h1.put(c, 1);
		}

		System.out.println(h1);
	}
}