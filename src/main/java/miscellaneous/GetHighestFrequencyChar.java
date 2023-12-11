package miscellaneous;

import java.util.HashMap;

public class GetHighestFrequencyChar {

	public static char getHighestFrequencyChar(String str) {
		if (str.length() == 0) {
			System.out.println("String is Empty");
		}
		if (str.length() == 1) {
			return str.charAt(0);
		}
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			if (!hm.containsKey(str.charAt(i))) {
				hm.put(str.charAt(i), 0);
			} else {
				hm.put(str.charAt(i), hm.get(str.charAt(i)) + 1);
			}
		}
		
		char returns = str.charAt(0);
		for (Character c : hm.keySet()) {
			if(hm.get(c)>hm.get(returns)) {
				returns = c;
			}
		}
		
		return returns;
	}

	public static void main(String[] args) {
		String str = "abracadabra";
		System.out.println(getHighestFrequencyChar(str));
	}

}
