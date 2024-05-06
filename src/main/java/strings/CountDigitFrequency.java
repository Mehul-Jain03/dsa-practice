package strings;

public class CountDigitFrequency {


    public static int countDigitFrequency(int number, int digit) {
        int result = 0;
        while (number > 0) {
            int quotient = number % 10;
            number = number / 10;
            if (quotient == digit) {
                result++;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(countDigitFrequency(515, 5));
    }

}