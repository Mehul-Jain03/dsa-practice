package arrays;

public class MaximumConsecutiveOnes {

    static int maxIs(int[] arr){
        int max = 0;
        int count  =0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==1){
                count = count+1;
            }
            else {
                if(count>max){
                    max = count;
                    count = 0;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1,0,0,1,1,1,1,0,0};
        System.out.println(maxIs(arr));
    }
}
