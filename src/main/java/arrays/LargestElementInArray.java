package arrays;

public class LargestElementInArray {


    public static int findLargestElement(int[] arr){
        int largest = arr[0];
        for(int i : arr){
            if(i>largest){
                largest = i;
            }
        }
        return largest;
    }


    public static void main(String[] args) {
        int[] arr = {1, 4, 7, 2, 7, 5, 6, 4, 8};
        System.out.println(findLargestElement(arr));
    }
}
