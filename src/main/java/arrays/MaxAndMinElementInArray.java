package arrays;

public class MaxAndMinElementInArray {

    public static void find(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int num : arr){
            if(num>max){
                max = num;
            }
            if(num<min){
                min = num;
            }
        }
        System.out.println("Max number is "+max);
        System.out.println("Min number is "+min);
    }

    public static void main(String[] args) {
        int[] arr = {-1, 8, 3, 0, 5, 9};
        find(arr);
    }
}
