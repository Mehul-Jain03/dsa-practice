package arrays;

public class CheckIfArrayIsSorted {

    public static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                continue;
            } else return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 7, 8};
        System.out.println(isSorted(arr));
    }
}
