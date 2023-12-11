package arrays;

public class WorkLoadEmployee {

    public static int rating(int[] arr, int hours) {
        int rating = 1;
        for (int i = 0; i < arr.length; i++) {
            int currentRating = 1;
            while ((i < arr.length - 1) && (arr[i] > hours && arr[i + 1] > hours)) {
                currentRating++;
                i++;
            }
            if (currentRating > rating) {
                rating = currentRating;
            }
        }
        return rating;
    }


    public static void main(String[] args) {
        int[] arr = {4, 6, 1, 8, 6, 6, 3, 6, 7, 1, 9, 7};
        System.out.println(rating(arr, 5));
    }
}
