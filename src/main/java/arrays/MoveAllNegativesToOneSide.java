package arrays;

import java.util.Arrays;

public class MoveAllNegativesToOneSide {


    public static void move(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            while (arr[left] < 0) left++;
            while (arr[right] > 0) right--;

            if (left>=right) break;
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }


    public static void main(String[] args) {
        int[] arr = {2, -1, 4, -4, 3, -2, 4, 7, -6};
        move(arr);
    }


}
