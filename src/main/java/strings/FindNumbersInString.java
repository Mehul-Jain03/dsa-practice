package strings;

public class FindNumbersInString {

	public static void main(String[] args) {
		String str = "TestCasesPassed100TestCassesFailed50TestCasesSkipped25";
		// Replacing every non-digit number
        // with a space(" ")
		str = str.replaceAll("[^\\d]", " ").trim();
		
		// Remove extra spaces from the beginning
        // and the ending of the string
		str = str.replaceAll(" +", " ");
		
		// Replace all the consecutive white
        // spaces with a single space
		String[] s = str.split(" ");
		int sum = 0;
		for (int i = 0; i < s.length; i++) {
			int value = Integer.parseInt(s[i]);
			System.out.println(value);
			sum += value;
		}
		System.out.println(sum);
	}
	

}
