package strings;

public class FindTheVowels {

    public static void main(String[] args) {

        String str = "mehul";

        char[] chars = str.toCharArray();

        for (char c : chars) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                System.out.println("This are the Vowels " + c);
            }
        }

    }
}
