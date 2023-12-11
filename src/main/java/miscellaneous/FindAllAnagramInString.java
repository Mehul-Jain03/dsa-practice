package miscellaneous;

import java.util.HashMap;

public class FindAllAnagramInString {

	public static int findAnagrams(String string, String pattern) {
		int count = 0;
		HashMap<Character, Integer> stringHm = new HashMap<Character, Integer>();
		HashMap<Character, Integer> patternHm = new HashMap<Character, Integer>();

		for (int i = 0; i < pattern.length(); i++) {
			char pChar = pattern.charAt(i);
			patternHm.put(pChar, patternHm.getOrDefault(pChar, 0) + 1);
			char sChar = string.charAt(i);
			stringHm.put(sChar, stringHm.getOrDefault(sChar, 0) + 1);
		}

		int i = pattern.length();
		while (i < string.length()) {
			if (stringHm.equals(patternHm) == true) {
				count++;
			}

			char cha = string.charAt(i);
			stringHm.put(cha, stringHm.getOrDefault(cha, 0) + 1);

			char chr = string.charAt(i - pattern.length());
			if (stringHm.get(chr) == 1) {
				stringHm.remove(chr);
			} else {
				stringHm.put(chr, stringHm.get(chr) - 1);
			}

			i++;
		}

		if (stringHm.equals(patternHm) == true) {
			count++;
		}

		return count;

	}

	public static void main(String[] args) {

		String str = "catac";
		String pattern = "tac";
		System.out.println(findAnagrams(str, pattern));

	}

}