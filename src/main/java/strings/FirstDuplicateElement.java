package strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstDuplicateElement {

    public static int getIndexByMap(String str) {
        if (str == null || str.length() == 0) {
            return -1;
        }
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char c : str.toCharArray()) {
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) + 1);
            }
        }

        for (Map.Entry<Character, Integer> maps : map.entrySet()) {
            if (maps.getValue() > 1) {
                return str.indexOf(maps.getKey());
            }
        }
        return -1;
    }


    public static int getIndexByBruteForce(String str) {
        if (str == null || str.isEmpty()) {
            return -1;
        }
        for (int i = 0; i < str.length(); i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j) && (i != j)) {
                    isDuplicate = true;
                    break;
                }
            }
            if (isDuplicate) {
                return str.indexOf(str.charAt(i));
            }
        }
        return -1;
    }


    public static int getIndexByMethod(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) != str.lastIndexOf(str.charAt(i))) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(getIndexByMap("mmehul"));
        System.out.println(getIndexByBruteForce("mehhul"));
        System.out.println(getIndexByMethod("mmeehul"));
    }
}