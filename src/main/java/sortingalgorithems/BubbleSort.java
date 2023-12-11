package sortingalgorithems;


public class BubbleSort {

	public static void main(String[] args) {
		
		/*Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping 
		the adjacent elements if they are in wrong order.*/
		
		int arr[] = { 10, 30, 20, 40, 70, 20, 60 };
		
		for (int i = 0; i < arr.length; i++) {
			
			int num = 0;
			
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					num = 1;
				}
				
			}
			if(num==0){
				break;
			}
		}

		for (int k : arr) {
			System.out.print(k+" ");
		}

	}

}
