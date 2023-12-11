package miscellaneous;

import java.util.HashMap;

public class A1B1A2Print {
	
	// Given :  "ababcbc" -> "a1b1a2b2c1b3c2"
	
	public static void printNumberWithOccurance(String str) {
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for(char c : str.toCharArray()) {
			if(!hm.containsKey(c)) {
				hm.put(c, 1);
			}
			else {
				hm.put(c, hm.get(c)+1);
			}
			System.out.print(c+""+hm.get(c)+"");
		}
	}
	
	
	public static void printFreq() {
		
	}
	
	

	public static void main(String[] args) {
		String str = "ababcbc";
		printNumberWithOccurance(str);
	}

}
