package strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingChar {

    public static int firstNonRepeatingChar(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))) {
                return i;
            }
        }
        return -1;
    }

    public static int getIndexOfFirstNonRepeatatingChar(String str) {
        if (str == null || str.isEmpty()) {
            return -1;
        }
        Map<Character, Integer> hm = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (!hm.containsKey(str.charAt(i))) {
                hm.put(str.charAt(i), 1);
            } else {
                hm.put(str.charAt(i), hm.get(str.charAt(i)) + 1);
            }
        }
        for (Map.Entry<Character, Integer> set : hm.entrySet()) {
            if (set.getValue() == 1) {
                Character c = set.getKey();
                return str.indexOf(c);
            }
        }
        return -1;
    }

    public static int getFirstNonRepeatingCharBruteForce(String s) {
        for (int i = 0; i < s.length(); i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j) && (i != j)) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                return s.indexOf(s.charAt(i));
            }

        }
        return -1;
    }


    public static void main(String[] args) {
        String string = "mmeehhuull";
        System.out.println(firstNonRepeatingChar(string));
        System.out.println(getIndexOfFirstNonRepeatatingChar(string));
        System.out.println(getFirstNonRepeatingCharBruteForce(string));
    }
}
