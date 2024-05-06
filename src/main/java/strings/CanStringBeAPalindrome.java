package strings;

import java.util.HashMap;
import java.util.Map;

public class CanStringBeAPalindrome {


    public static boolean palindromicCandidate(String str) {
        if (str.isEmpty()) {
            return false;
        }
        if (str.length() == 1) {
            return true;
        }
        HashMap<Character, Integer> hm = new HashMap<>();
        for (char c : str.toCharArray()) {
            if (!hm.containsKey(c)) {
                hm.put(c, 1);
            } else {
                hm.put(c, hm.get(c) + 1);
            }
        }
        int odd = 0;
        for (Map.Entry<Character, Integer> map : hm.entrySet()) {
            if (map.getValue() % 2 != 0) {
                odd++;
            }
        }

        return odd <= 1;
    }


    public static void main(String[] args) {
        System.out.println(palindromicCandidate("faceface"));
    }
}