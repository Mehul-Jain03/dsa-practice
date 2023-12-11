package strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class GetIndexOfFirstNonRepeatingCharacter {

    public static int getIndexByMap(String str){
        if(str==null){
            return -1;
        }
        Map<Character,Integer> map = new LinkedHashMap<>();
        for(char c : str.toCharArray()){
            if(!map.containsKey(c)){
                map.put(c,1);
            }
            else
                map.put(c,map.get(c)+1);
        }

        for(Map.Entry<Character,Integer> set : map.entrySet()){
            if(set.getValue()==1){
                Character c = set.getKey();
                return str.indexOf(c);
            }
        }

        return -1;
    }

    public static int getIndexByBruteForce(String str){
        if(str==null){
            return -1;
        }
        if(str.length()==1){
            return -1;
        }

        for(int i = 0;i<str.length();i++){
            boolean isDuplicate = false;
            for (int j = 0;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)&&(i!=j)){
                    isDuplicate = true;
                    break;
                }
            }
            if(isDuplicate==false){
                return str.indexOf(str.charAt(i));
            }
        }
        return -1;
    }

    public static int getIndexByMethod(String str){
        for(int i = 0;i<str.length();i++){
            if(str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i))){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(getIndexByMap("mehul"));
        System.out.println(getIndexByBruteForce("mehul"));
        System.out.println(getIndexByMethod("mmeehul"));

    }

}