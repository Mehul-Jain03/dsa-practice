package miscellaneous;

import java.util.HashMap;

public class GetCommonElement {
	
	
	public static void getCommonElement(int[] arr1,int[] arr2) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for(int i = 0;i<arr1.length;i++) {
			if(!hm.containsKey(arr1[i])) {
				hm.put(arr1[i], 0);
			}
			else {
				hm.put(arr1[i], hm.get(arr1[i])+1);
			}
		}
		
		for(int i = 0; i<arr2.length;i++) {
			if(hm.containsKey(arr2[i])) {
				System.out.print(arr2[i]+" ");
				hm.remove(arr2[i]);
			}
		}
	}
	

	public static void main(String[] args) {
		int[] arr1 = {1,1,2,2,2,3,5};
		int[] arr2 = {1,1,1,2,2,4,5};
		getCommonElement(arr1,arr2);

	}

}
