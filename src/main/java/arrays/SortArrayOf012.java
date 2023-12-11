package arrays;

import java.util.Arrays;

public class SortArrayOf012 {

    //Sort Array that contains only 0,1 and 2 without using any sorting algo.
    public static void sort(int[] arr) {
        int zero = 0, one = 0, two = 0;
        for (int num : arr){
            if (num == 0) zero++;
            if (num == 1) one++;
            if (num == 2) two++;
        }

        for (int i =0;i<zero;i++) arr[i] = 0;
        for (int i =zero;i<zero+one;i++) arr[i] = 1;
        for (int i =zero+one;i<arr.length;i++) arr[i] = 2;

        System.out.println(Arrays.toString(arr));
    }


    public static void main(String[] args) {
        int[] arr = {0, 2, 1, 2, 1, 2, 1, 0, 2};
        sort(arr);
    }

}
