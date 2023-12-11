package miscellaneous;

import java.util.HashSet;

public class FirstRepeatingChar {
	
	public static void firstRepeatingChar(String str) {
		for(int i=0;i<str.length();i++) {
			boolean isRepeating = false;
			for(int j=0;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)&&(i!=j)) {
					isRepeating = true;
					break;
				}
			}
			if(isRepeating==true) {
				System.out.println("This is the first repeating char :: " +str.charAt(i));
				break;
			}
		}
	}
	
	public static void firstRepeatingCharHashSet(String str) {
		HashSet<Character> hs = new HashSet<Character>();
		for(char c : str.toCharArray()) {
			if(!hs.contains(c)) {
				hs.add(c);
			}
			else {
				System.out.println("This is the first non repeating char :: " +c);
				break;
			}
		}
	}

	public static void main(String[] args) {
		String str = "bccaccdd";
		firstRepeatingChar(str);
		firstRepeatingCharHashSet(str);

	}

}
