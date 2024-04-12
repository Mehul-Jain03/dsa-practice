package hashmap;

import java.util.HashMap;

public class LongestSubArrayWithSumK {


    //Brute Force
    public static void longestSubArrayWithSumKBruteForce(int[] arr, int summation) {
        int length = 0;
        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum = sum + arr[k];
                }
                if (sum == summation) {
                    int currentLength = j - i + 1;
                    length = Math.max(currentLength, length);
                }
            }
        }
        System.out.println("Length is " + length);
    }


    //Optimal
    public static void longestSubArrayWithSumKOptimal(int[] arr, int num) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int maxLength = 0;
        int sum = 0;
        hashMap.put(0, -1);
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            hashMap.put(sum, i);
            if (hashMap.containsKey((sum - num))) {
                int currentLength = i - hashMap.get(sum - num);
                maxLength = Math.max(currentLength, maxLength);
            }
        }
        System.out.println(maxLength);
    }

    //Optimal
    public static int longestSubArrayWithSumKOptimalTwoPointer(int[] arr, int reqSum) {
        int i = 0;
        int j = 0;
        int maxLength = 0;
        int sum = arr[0];
        while (i < arr.length) {
            while (j <= i && sum > reqSum) {
                sum = sum - arr[j];
                j++;
            }

            if (sum == reqSum) {
                maxLength = Math.max(maxLength, i - j + 1);
            }
            i++;
            if (i < arr.length) {
                sum = sum + arr[i];
            }

        }
        return maxLength;
    }


    public static void main(String[] args) {
        int[] arr = {10, 5, 1, 2, 7, 9};
        int sum = 15;
        longestSubArrayWithSumKBruteForce(arr, sum);
        longestSubArrayWithSumKOptimal(arr, sum);
        System.out.println(longestSubArrayWithSumKOptimalTwoPointer(arr, sum));
    }

}
