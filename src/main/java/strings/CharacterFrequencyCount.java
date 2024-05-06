package strings;

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequencyCount {


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
            System.out.print(set.getKey() + "" + set.getValue() + " ");
        }
    }


    public static void main(String[] args) {
        charFreq("aaabbccbddddeeesb");
    }
}
