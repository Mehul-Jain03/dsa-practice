package arrays;

import java.util.*;

public class ThreeSum {


    public static List<List<Integer>> threeSum(int[] arr, int sum) {
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            int temp = sum - arr[i];
            int j = i + 1;
            int k = arr.length - 1;
            while (j < k) {
                if (arr[j] + arr[k] > temp) {
                    k--;
                } else if (arr[j] + arr[k] < temp) {
                    j++;
                } else {
                    List<Integer> list = new ArrayList<>();
                    list.add(arr[i]);
                    list.add(arr[j]);
                    list.add(arr[k]);
                    Collections.sort(list);
                    set.add(list);
                    j++;
                    k--;
                }
            }
        }
        return new ArrayList<>(set);
    }


    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(arr, 0));
    }
}
