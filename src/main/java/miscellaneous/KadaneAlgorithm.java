package miscellaneous;

public class KadaneAlgorithm {

    // Max Sum of Continuous Subarray

    public static int kadaneAlgorithm(int[] arr) {
        int currSum = arr[0];
        int maxSum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (currSum >= 0) {
                currSum += arr[i];
            } else {
                currSum = arr[i];
            }
            if (currSum > maxSum) {
                maxSum = currSum;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {

        int[] arr = {-4, 5, -1, 9, -3, 10};
        //int[] arr = { 4, 3, -2, 6 };
        System.out.println(kadaneAlgorithm(arr));
    }

}