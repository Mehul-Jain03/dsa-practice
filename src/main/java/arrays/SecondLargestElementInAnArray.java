package arrays;

import java.util.Arrays;

public class SecondLargestElementInAnArray {

    static int findSecondLargestViaBruteForce(int[] arr) {
        Arrays.sort(arr);
        int largest = arr[arr.length - 1];
        int secondLargest = Integer.MIN_VALUE;
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] != largest) {
                secondLargest = arr[i];
                break;
            }
        }
        return secondLargest;
    }

    static int findSecondLargestViaBetter(int[] arr) {
        int largest = arr[0];
        for (int k : arr) {
            if (k > largest) {
                largest = k;
            }
        }

        int secondLargest = Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > secondLargest && j != largest) {
                secondLargest = j;
            }
        }
        return secondLargest;
    }

    static int findSecondLargestViaOptimal(int[] arr) {
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > largest) {
                secondLargest = largest;
                largest = i;
            }
        }
        return secondLargest;
    }


    public static void main(String[] args) {
        int[] arr = {1, 4, 7, 2, 7, 5, 6, 4, 8};
        System.out.println(findSecondLargestViaBruteForce(arr));
        System.out.println(findSecondLargestViaBetter(arr));
        System.out.println(findSecondLargestViaOptimal(arr));
    }
}
