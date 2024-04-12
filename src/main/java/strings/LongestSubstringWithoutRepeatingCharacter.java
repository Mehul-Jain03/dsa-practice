package strings;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacter {
        public static int lengthOfLongestSubstring(String s) {
            if(s == null || s.isEmpty()){
                return 0;
            }
            else if(s.length() == 1){
                return 1;
            }
            else {
                int current = 0;
                int max = 0;
                for(int i = 0;i<s.length()-1;i++){
                    for(int j=i;j<=s.length();j++){
                        String str = s.substring(i,j);
                        if(isUnique(str)){
                            current = str.length();
                        }
                    }
                    if(max<current){
                        max = current;
                    }
                }
                return max;
            }
        }

        public static boolean isUnique(String str){
            int length = str.length();
            HashSet<Character> set = new HashSet<>();
            for(char c : str.toCharArray()){
                set.add(c);
            }
            return length == set.size();
        }

    public static void main(String[] args) {
        String str = "ab";
        System.out.println(lengthOfLongestSubstring(str));
    }
}
