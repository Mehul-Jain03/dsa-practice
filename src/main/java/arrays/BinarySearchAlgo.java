package arrays;

public class BinarySearchAlgo {


    public static int index(int[] arr, int target){
        int l = 0;
        int h = arr.length-1;
        while (l<=h){
            int mid  = l + (h-l)/2 ;
            if(target < arr[mid]){
                h = mid-1;
            }
            else if (target > arr[mid]){
                l = mid +1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] arr = {12,1,4,6,8,10,34,98,111};
        System.out.println(index(arr,34));
    }
}