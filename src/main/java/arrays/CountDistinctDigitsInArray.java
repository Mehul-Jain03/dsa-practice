package arrays;

import java.util.HashSet;

public class CountDistinctDigitsInArray {

    public static int count(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                count++;
            }
        }
        return count;
    }

    public static int countByHashSet(int[] arr) {
        HashSet<Integer> hs = new HashSet<>();
        for (int a : arr) {
            hs.add(a);
        }
        return hs.size();
    }


    public static void main(String[] args) {
        System.out.println(count(new int[]{2, 2, 6, 8}));
        System.out.println(countByHashSet(new int[]{2, 2, 6, 8}));
    }
}
