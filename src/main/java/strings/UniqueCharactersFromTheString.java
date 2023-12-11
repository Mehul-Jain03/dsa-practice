package strings;

import java.util.Set;
import java.util.TreeSet;

public class UniqueCharactersFromTheString {

	static void uniqueChars(String string) {

		char[] c = string.toLowerCase().toCharArray();
		Set<Character> set = new TreeSet<Character>();
		for (Character s : c) {
			set.add(s);
		}

		System.out.println(set);

	}

	public static void main(String[] args) {

		String s1 = "Mehum";

		uniqueChars(s1);

	}

}
