package sortingalgorithems;

public class InsertionSort {

	public static void main(String[] args) {
		/* Insertion Sort : It goes linearly and if the previous element is < the current element than it insert it there .*/
		
		int arr[] = { 6,5,9,2,7 };

		int temp,j;
		
		for(int i = 1; i<arr.length; i++)
		
		{
			temp = arr[i];
			j=i;
			while(j>0 && arr[j-1]>temp)
			{
				arr[j] = arr[j-1];
				j = j-1;
			}
			arr[j] = temp;
		}


		for (int i : arr) {
			System.out.print(i + " ");
		}

	}

}
