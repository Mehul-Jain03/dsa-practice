package arrays;

import java.util.Arrays;

public class LeftRotateArrayByKPlace {

    public static void leftRotateBrute(int[] arr, int d) {
        d = d % arr.length;
        int[] temp = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }
        for (int i = d; i < arr.length; i++) {
            arr[i - d] = arr[i];
        }
        int j = 0;
        for (int i = arr.length - d; i < arr.length; i++) {
            arr[i] = temp[j];
            j++;
        }
        Arrays.stream(arr).forEach(a -> System.out.print(a + " "));
    }


    public static void main(String[] args) {
        int[] arr = {1, 5, 5, 8, 10, 10, 12, 15, 15, 16};
        leftRotateBrute(arr, 3);
    }
}
