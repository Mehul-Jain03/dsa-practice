package arrays;

import java.util.Arrays;

public class MoveAllZerosAtEnd {

    public static void moveZerosToEnd(int[] arr) {
        int j = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }

        for (int i = j + 1; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        Arrays.stream(arr).forEach(e -> System.out.print(e + " "));
    }


    public static void main(String[] args) {
        int[] arr = {1, 0, 3, 6, 0, 1, 9, 0, 4, 7, 0, 3, 8};
        moveZerosToEnd(arr);
    }
}
