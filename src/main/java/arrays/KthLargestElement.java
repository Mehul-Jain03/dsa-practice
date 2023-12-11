package arrays;

import java.util.Arrays;

public class KthLargestElement {


    // Kth Largest is after sorting index of (n-k)
    public static int find(int[] arr,int k) {
        Arrays.sort(arr);
        return arr[arr.length-k];
    }


    public static void main(String[] args) {
        int[] arr = {89, -1, -3, 6, 4};
        System.out.println(find(arr,3));
    }

}
