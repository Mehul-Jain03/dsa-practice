package strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class CompressStringUniqueWay {

    public static String compress(String input) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        int i = 0;

        while (i < input.length()) {
            char ch = input.charAt(i++);
            int count = 0;
            while (i < input.length() && Character.isDigit(input.charAt(i))) {
                count = count * 10 + (input.charAt(i++) - '0');
            }
            map.put(ch, map.getOrDefault(ch, 0) + count);
        }

        StringBuilder ans = new StringBuilder();
        for (Map.Entry<Character, Integer> set : map.entrySet()) {
            ans.append(set.getKey()).append(set.getValue());
        }
        return ans.toString();
    }


    public static void main(String[] args) {
        String input = "a3c9b2c2"; //a3c11b2
        String result = compress(input);
        System.out.println("Compressed: " + result);
    }

}
