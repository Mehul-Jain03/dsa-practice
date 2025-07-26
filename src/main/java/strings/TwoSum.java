package strings;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum(int[] arr, int target) {
        int[] ans = new int[0];
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!hashMap.containsKey(target - arr[i])) {
                hashMap.put(arr[i], i);
            } else {
                ans = new int[]{hashMap.get(target - arr[i]), i};
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 1, 3};
        int target = 5;
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }
}