package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {

    public static List<Boolean> kidsWithCandies(int[] arr, int extras) {
        List<Boolean> list = new ArrayList<>();
        int max = arr[0];
        for (int a : arr) {
            if (a > max) {
                max = a;
            }
        }
        for (int a : arr) {
            if ((a + extras) >= max) {
                list.add(true);
            } else list.add(false);
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 1, 3};
        int extra = 3;
        System.out.println(kidsWithCandies(arr, extra));
    }


}
