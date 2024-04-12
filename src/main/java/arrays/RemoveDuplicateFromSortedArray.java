package arrays;

public class RemoveDuplicateFromSortedArray {
    // Remove Duplicates form Sorted and return the number of unique elements

    public static int distinct(int[] arr){
        int i =0;
        for(int j =1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        return i+1;
    }
    int i =0;

    public static void main(String[] args) {
        int[] arr = {1,5,5,8,10,10,12,15,15,16};
        System.out.println(distinct(arr));
    }
}
