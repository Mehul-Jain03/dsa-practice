package arrays;

import java.util.ArrayList;
import java.util.List;

public class UnionOfTwoSortedArray {

    public static void findUnion(int[] arr1, int[] arr2) {
        List<Integer> list = new ArrayList<>();
        int l1 = arr1.length;
        int l2 = arr2.length;
        int i = 0;
        int j = 0;
        while (i < l1 && j < l2) {
            if (arr1[i] < arr2[j]) {
                if (list.isEmpty() || !list.contains(arr1[i])) {
                    list.add(arr1[i]);
                }
                i++;
            } else {
                if (list.isEmpty() || !list.contains(arr2[j])) {
                    list.add(arr2[j]);
                }
                j++;
            }
        }
        while (i < l1) {
            if (list.isEmpty() || !list.contains(arr1[i])) {
                list.add(arr1[i]);
            }
            i++;
        }
        while (j < l2) {
            if (list.isEmpty() || !list.contains(arr2[j])) {
                list.add(arr2[j]);
            }
            j++;
        }

        list.forEach(e -> System.out.print(e + " "));
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 4, 5, 6, 7, 8};
        int[] arr2 = {2, 3, 4, 4, 5, 7, 9};
        findUnion(arr1, arr2);
    }
}


