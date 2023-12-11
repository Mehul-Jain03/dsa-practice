package mixed;

import java.util.Arrays;

public class LargestAndSmallestNumberInArray {

    public static void main(String[] args) {

        int a[] = {-12, 14, -11, 16, 18, 20, 155};

        //Using  Arrays Class
		/*Arrays.sort(a);

		System.out.println(a[0]);
		System.out.println(a[a.length-1]);*/


        //Using For Loop
        int largest = a[0];
        int smallest = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] > largest) {
                largest = a[i];
            } else if (a[i] < smallest) {
                smallest = a[i];
            }
        }

        System.out.println("Array is :: " + Arrays.toString(a));
        System.out.println("Largest Number is ::" + largest);
        System.out.println("Smallest Number is ::" + smallest);


    }

}