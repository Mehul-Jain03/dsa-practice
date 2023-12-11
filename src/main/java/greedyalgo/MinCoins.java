package greedyalgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinCoins {


    public static int minCoins(int[] arr, int target){
        Arrays.sort(arr);
        List<Integer> list = new ArrayList<>();
        for(int i = arr.length -1;i>=0;i--){
            while (target >= arr[i]){
                target = target - arr[i];
                list.add(arr[i]);
            }
        }
        return list.size();
    }


    public static void main(String[] args) {
        int[] coin = {10,25,5,30};
        System.out.println(minCoins(coin,60));
    }


}
