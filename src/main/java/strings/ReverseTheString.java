package strings;

public class ReverseTheString {

	public static void main(String[] args) {
		
		String a = "Mehul";
		String b = "";
		
		//Method 1
		char[] arr = a.toCharArray();
		for(int i = arr.length-1;i>=0;i--) {
			b=b+arr[i];
		}
		
		System.out.println(b);
		
		//Method 2
		StringBuilder sb = new StringBuilder();
		sb.append(a);
		System.out.println(sb.reverse());

	}

}
