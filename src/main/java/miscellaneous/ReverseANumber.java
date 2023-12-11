package miscellaneous;

public class ReverseANumber {

    public static int reverseNumber(int num){
        int reverseNum = 0;
        while (num>0){
            int quotient = num%10;
            reverseNum = reverseNum*10+quotient;
            num = num/10;
        }
        return reverseNum;
    }

    public static boolean isPalindrome(int num){
        int reverseNum = 0;
        int original = num;
        while (num>0){
            int quotient = num%10;
            System.out.println(quotient);
            reverseNum = reverseNum*10+quotient;
            num = num/10;
        }
       if (original-reverseNum==0){
           return true;
       }
       return false;
    }

    public static void main(String[] args) {
        System.out.println(reverseNumber(9));
        System.out.println(isPalindrome(9));
    }

}
