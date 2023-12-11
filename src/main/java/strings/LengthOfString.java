package strings;

public class LengthOfString {


    public static int lengthOfStringByInBuiltMethod(String str){
        return str.length();
    }

    public static int lengthOfStringByForLoop(String str){
        char[] chars = str.toCharArray();
        int count = 0;
        for(char c : chars){
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfStringByInBuiltMethod("pl1"));
        System.out.println(lengthOfStringByForLoop("pl1"));
    }

}
