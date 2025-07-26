package miscellaneous;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class MinimumIds {

    //Minimum Unique IDs After Removing m Items
    //Input: Bag contains item IDs: [1, 1, 1, 2, 2, 3]
    //You can remove m = 2 items
    //Goal: Minimize the number of unique IDs left in the bag after removing any m items.

    public static void findMinUniqueIds(int[] arr, int m) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        PriorityQueue<Integer> freq = new PriorityQueue<>(map.values());
        System.out.println(freq);

        while (m > 0 && !freq.isEmpty()) {
            int f = freq.poll();
            if (m >= f) {
                m = m - f;
            } else {
                f = f - m;
                freq.add(f);
                m = 0;
            }
        }
        System.out.println(freq.size());
    }


    public static void main(String[] args) {
        int[] ids = {1, 1, 1, 1, 2, 2, 2};
        int m = 2;
        findMinUniqueIds(ids, m);
    }

}
