package dp;

import java.util.Arrays;

public class MinimumNumberOfCoins {

    public static int minimumCoins(int[] coins, int num) {
        Arrays.sort(coins);
        int res = 0;
        for (int i = coins.length - 1; i >= 0; i--) {
            if (num == 0) {
                break;
            }
            int quotient = num / coins[i];
            res += quotient;
            num = num - (coins[i] * quotient);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] coins = {1, 5, 1, 10};
        System.out.println(minimumCoins(coins, 37));

    }

}