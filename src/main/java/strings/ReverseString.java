package strings;

public class ReverseString {


    public static String wayOne(String input) {
        if (input == null || input.length() == 0) {
            return "Invalid String";
        }
        String output = "";
        char[] arrayOfChars = input.toCharArray();
        for (int i = arrayOfChars.length - 1; i >= 0; i--) {
            output = output + arrayOfChars[i];
        }
        return output;
    }

    public static String wayTwo(String input) {
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }
        return reversed;
    }

    public static String wayThree(String input) {
        char ch;
        String s = "";
        for (int i = 0; i < input.length(); i++) {
            ch = input.charAt(i);
            s = ch + s;
        }
        return s;
    }

    public static StringBuilder wayFour(String input) {
        StringBuilder sb = new StringBuilder();
        sb.append(input);
        return sb.reverse();
    }

    public static void wayFive(String input){
        char[] tempArr = input.toCharArray();
        int left,right;
        right = tempArr.length-1;
        for(left = 0;left<right;left++,right--){
            char temp = tempArr[left];
            tempArr[left] = tempArr[right];
            tempArr[right] = temp;
        }
        for(char c : tempArr){
            System.out.print(c);
        }
    }


    public static void main(String[] args) {
        System.out.println(wayOne("Mehul"));
        System.out.println(wayTwo("Mehul"));
        System.out.println(wayTwo("Mehul"));
        System.out.println(wayFour("Mehul"));
        wayFive("Mehul");
    }


}
