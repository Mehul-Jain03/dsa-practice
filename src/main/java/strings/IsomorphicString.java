package strings;

import java.util.HashMap;

public class IsomorphicString {

    public static boolean isIsomorphic(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        HashMap<Character, Character> hashMap = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            Character str1Ch = str1.charAt(i);
            Character str2Ch = str2.charAt(i);
            if (hashMap.containsKey(str1Ch)) {
                if (hashMap.get(str1Ch) != str2Ch) return false;
            } else if (hashMap.containsValue(str2Ch)) return false;
            else hashMap.put(str1Ch, str2Ch);
        }
        return true;
    }

    public static void main(String[] args) {

        String str1 = "abcd"; // abca -> false
        String str2 = "wxyz"; // wxyw -> false
        System.out.println(isIsomorphic(str1, str2));

    }

}