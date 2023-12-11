package arrays;

public class ReverseArray {


    public static int[] reverse(int[] arr,int size){
        int i = 0;
        int j = size-1;
        int k;
        while (i<j){
            k = arr[i];
            arr[i] = arr[j];
            arr[j] = k;
            i++;
            j--;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = reverse(new int[]{1, 2, 3, 4, 5},5);
        for(int i : arr){
            System.out.print(i+" ");
        }

    }

}
