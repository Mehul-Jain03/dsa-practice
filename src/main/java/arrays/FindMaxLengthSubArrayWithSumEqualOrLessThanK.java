package arrays;

public class FindMaxLengthSubArrayWithSumEqualOrLessThanK {

    static int findSubArrayLength(int[] arr, int num){
        int sum = 0;
        int l = 0;
        int r = 0;
        int length = 0;
        while (r<arr.length){
            sum = sum+arr[r];
            if(sum>num){
                sum = sum-arr[l];
                l++;
            }
            length = Math.max(length, r - l + 1);
            r++;
        }
        return length;
    }

    public static void main(String[] args) {
        int[] arr = {2,5,1,10,12};
        int sum = 14;
        System.out.println(findSubArrayLength(arr,sum));
    }
}
