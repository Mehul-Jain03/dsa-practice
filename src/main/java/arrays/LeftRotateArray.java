package arrays;

import java.util.Arrays;

public class LeftRotateArray {

    // Left Rotate Array By One Position

    public static void leftRotate(int[] arr) {
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp;
        Arrays.stream(arr).forEach(a -> System.out.print(a + " "));
    }


    public static void main(String[] args) {
        int[] arr = {1, 5, 5, 8, 10, 10, 12, 15, 15, 16};
        leftRotate(arr);
    }
}
