package mixed;

public class StringLength {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		String name = "Selenium";
		
		char[] charaters = name.toCharArray();
		
		int i = 0;
		
		for(char s : charaters)
		{
			i++;
		}		
		
		System.out.println(i);

	}

}
