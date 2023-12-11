package arrays;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementInArray {

    public static boolean containsDuplicate(int[] num) {
        for (int i = 0; i < num.length; i++) {
            boolean appeared = false;
            for (int j = 0; j < num.length; j++) {
                if (num[i] == num[j] && (i != j)) {
                    appeared = true;
                    break;
                }
            }
            if (appeared) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsDuplicateFromSet(int[] num) {
        Set<Integer> set = new HashSet<>();
        for (int i : num) {
            if (!set.contains(i)) {
                set.add(i);
            } else
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] numbs = {2, 14, 18, 22};
        System.out.println(containsDuplicate(numbs));
        System.out.println(containsDuplicateFromSet(numbs));
    }
}
