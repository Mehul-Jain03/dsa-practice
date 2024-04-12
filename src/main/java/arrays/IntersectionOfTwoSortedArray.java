package arrays;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfTwoSortedArray {

    public static void findIntersection(int[] arr1, int[] arr2) {
        List<Integer> list = new ArrayList<>();
        int l1 = arr1.length;
        int l2 = arr2.length;
        int i = 0;
        int j = 0;
        while (i < l1 && j < l2) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                list.add(arr1[i]);
                i++;
                j++;
            }
        }
        list.forEach(e -> System.out.print(e + " "));
    }


    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 4, 5, 6, 7, 8};
        int[] arr2 = {2, 3, 4, 4, 5, 7, 9};
        findIntersection(arr1, arr2);
    }
}



