package mixed;

public class StringJunk {

	public static void main(String[] args) {

		// Regex [^a-zA-Z0-9]

		String s = "Mehul $%$#$^^^%# Jain *^*%&&$&$&";

		s = s.replaceAll("[^a-zA-Z0-9]", "");

		System.out.println(s);
	}

}
