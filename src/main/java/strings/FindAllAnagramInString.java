package strings;

import java.util.HashMap;

public class FindAllAnagramInString {


    public static Integer countAnagram(String string, String pattern) {
        HashMap<Character, Integer> patternMap = new HashMap<>();
        for (char c : pattern.toCharArray()) {
            patternMap.put(c, patternMap.getOrDefault(c, 0) + 1);
        }
        int start = 0;
        int end = pattern.length() - 1;
        int count = 0;
        while (end < string.length()) {
            String sub = string.substring(start, end + 1);
            HashMap<Character, Integer> stringMap = new HashMap<>();
            for (char c : sub.toCharArray()) {
                stringMap.put(c, stringMap.getOrDefault(c, 0) + 1);
            }
            if (patternMap.equals(stringMap)) {
                count++;
            }
            start++;
            end++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countAnagram("abab", "ab"));
    }
}
