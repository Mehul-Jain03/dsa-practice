package arrays;

public class FindSumOfIntegersInString {

    static int findSum(String str) {
        int sum = 0;
        String string = "0";
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isAlphabetic(str.charAt(i))) {
                string = string + str.charAt(i);
            } else {
                sum = sum + Integer.parseInt(string);
                string = "0";
            }
        }
        return sum + Integer.parseInt(string);
    }


    public static void main(String[] args) {
        String str = "abc10def20ghi30jk5";
        System.out.println(findSum(str));
    }
}
