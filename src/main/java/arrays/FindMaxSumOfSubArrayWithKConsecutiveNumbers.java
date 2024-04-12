package arrays;

public class FindMaxSumOfSubArrayWithKConsecutiveNumbers {

    static int findMaxSum(int[] arr,int num){
        int sum = Integer.MIN_VALUE;
        int l = 0;
        int r = num-1;
        while (r<arr.length){
            int temp = 0;
            for(int i = l;i<=r;i++){
                temp = temp+arr[i];
            }
            sum = Math.max(sum,temp);
            l++;
            r++;
        }
        return sum;
    }


    public static void main(String[] args) {
        int[] arr = {-1,2,3,3,4,5,-1};
        int subArrayOfConsecutiveNumber = 3;
        System.out.println(findMaxSum(arr,subArrayOfConsecutiveNumber));
    }



}
