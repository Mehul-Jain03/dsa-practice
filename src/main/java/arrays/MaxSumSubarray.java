package arrays;

public class MaxSumSubarray {


    //BruteForce
    public static int maxSumSubArray(int[] arr){
        int maxSum = Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            int currentSum = 0;
            for(int j =i;j<arr.length;j++){
                currentSum = currentSum+arr[j];
                if (currentSum>maxSum){
                    maxSum = currentSum;
                }
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {-5,6,-1,10};
        System.out.println(maxSumSubArray(arr));
    }


}
