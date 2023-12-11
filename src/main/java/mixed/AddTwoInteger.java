package mixed;

import java.util.Scanner;

public class AddTwoInteger {

    private static Scanner readnext;
    private static Scanner read;

    public static void main(String[] args) {

        read = new Scanner(System.in);
        System.out.println("Enter num1 :");
        int num1 = read.nextInt();

        readnext = new Scanner(System.in);
        System.out.println("Enter num2 :");
        int num2 = readnext.nextInt();

        System.out.println("Your sum is :" + (num1 + num2));
    }

}