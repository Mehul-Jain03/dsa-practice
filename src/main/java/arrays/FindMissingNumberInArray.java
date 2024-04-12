package arrays;

public class FindMissingNumberInArray {

    public static int findNumber(int[] arr, int num) {
        int sumExpected = (num * (num + 1)) / 2;
        int sumActual = 0;
        for (int i : arr) {
            sumActual = sumActual + i;
        }
        return sumExpected - sumActual;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        System.out.println(findNumber(arr, 5));
    }
}