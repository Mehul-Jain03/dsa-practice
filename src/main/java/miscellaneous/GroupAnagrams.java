package miscellaneous;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {

	public static List<List<String>> groupAnagrams(String[] strs) {
		HashMap<HashMap<Character, Integer>, ArrayList<String>> bigHm = new HashMap<HashMap<Character, Integer>, ArrayList<String>>();

		for (String str : strs) {
			HashMap<Character, Integer> freqHm = new HashMap<Character, Integer>();
			for (int i = 0; i < str.length(); i++) {
				freqHm.put(str.charAt(i), freqHm.getOrDefault(str.charAt(i),0) + 1);
			}

			if (bigHm.containsKey(freqHm) == false) {
				ArrayList<String> al = new ArrayList<String>();
				al.add(str);
				bigHm.put(freqHm, al);
			} else {
				ArrayList<String> list = bigHm.get(freqHm);
				list.add(str);
			}

		}
		List<List<String>> listt = new ArrayList<List<String>>();
		for (ArrayList<String> all : bigHm.values()) {
			listt.add(all);
		}
		return listt;
	}

	public static void main(String[] args) {

		String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
		System.out.println(groupAnagrams(strs));
	}

}