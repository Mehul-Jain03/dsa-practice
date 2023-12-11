package strings;

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequencyCount {


    public static void countFrequency(String str) {
        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            while ((i < str.length() - 1) && (str.charAt(i) == str.charAt(i + 1))) {
                count++;
                i++;
            }
            System.out.print(str.charAt(i) + "" + count + " ");
        }
    }


    public static void charFreq(String str) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (char c : str.toCharArray()) {
            if (!hm.containsKey(c)) {
                hm.put(c, 1);
            } else {
                hm.put(c, hm.get(c) + 1);
            }
        }
        for (Map.Entry<Character, Integer> set : hm.entrySet()) {
            System.out.println(set.getKey() + " " + set.getValue());
        }
    }


    public static void main(String[] args) {
        countFrequency("abccd");
        //charFreq("aaabbccbddddeeesb");
    }
}


