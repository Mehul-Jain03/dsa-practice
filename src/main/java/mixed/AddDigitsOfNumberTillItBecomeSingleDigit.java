package mixed;

public class AddDigitsOfNumberTillItBecomeSingleDigit {

    public static int addDigits(int a) {
        if (a < 10) {
            return a;
        }
        int res = 0;
        while (a != 0) {
            int mod = a % 10;
            res = res + mod;
            a = a / 10;
        }
        return addDigits(res);
    }

    public static void main(String[] args) {

        System.out.println(addDigits(68));

    }

}
