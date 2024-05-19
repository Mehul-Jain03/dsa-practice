package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {

    public static List<List<String>> groupAnagram(String[] strArr) {
        HashMap<String, List<String>> hm = new HashMap<>();
        for (String string : strArr) {
            char[] charArr = string.toCharArray();
            Arrays.sort(charArr);
            String strNew = new String(charArr);
            if (!hm.containsKey(strNew)) {
                hm.put(strNew, new ArrayList<>());
            }
            hm.get(strNew).add(string);
        }
        return new ArrayList<>(hm.values());
    }

    public static void main(String[] args) {
        System.out.println(groupAnagram(new String[]{"cat", "act", "silent", "listen", "bat", "tab", "mehul"}));
    }

}
