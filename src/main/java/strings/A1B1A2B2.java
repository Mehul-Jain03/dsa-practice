package strings;

import java.util.HashMap;

public class A1B1A2B2 {

    // aabbcbab -> a1a2b1b2c1b3a3b4
    public static void printFreq(String str) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (char c : str.toCharArray()) {
            if (!hm.containsKey(c)) {
                hm.put(c, 1);
            } else {
                hm.put(c, hm.get(c) + 1);
            }

            System.out.print(c + "" + hm.get(c) + " ");
        }
    }

    public static void main(String[] args) {
        printFreq("aabbcbab");
    }

}