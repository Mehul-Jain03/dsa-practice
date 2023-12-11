package strings;

public class CountDigitFrequency {


    public static int countDigitFrequency(int number, int digit) {
        int rv = 0;
        while (number > 0) {
            int dig = number % 10;
            number = number / 10;
            if (dig == digit) {
                rv++;
            }
        }
        return rv;
    }


    public static void main(String[] args) {
        System.out.println(countDigitFrequency(100, 0));
    }

}
