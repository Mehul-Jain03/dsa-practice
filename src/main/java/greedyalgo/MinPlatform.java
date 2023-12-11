package greedyalgo;

import java.util.Arrays;

public class MinPlatform {


    public static int minPlatform(int[] arr, int[] dep, int trains){
        Arrays.sort(arr);
        Arrays.sort(dep);
        int count = 0;
        int ans = 0;
        int i =0, j= 0;
        while(i<trains){
            if(arr[i]<=dep[j]){
            count++;
            ans = Math.max(ans,count);
            i++;
            }
            else if (arr[i]>dep[j]){
                count--;
                j++;
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        int arr[] = { 100, 300, 500 };
        int dep[] = { 900, 400, 600 };
        int n = 3;
        System.out.println(minPlatform(arr,dep,n));
    }
}
