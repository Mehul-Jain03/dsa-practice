package strings;

public class MergeStringAlternatively {

    public static StringBuilder mergedString(String strOne, String strTwo) {
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        int j = 0;
        boolean flag = true;
        while (i < strOne.length() && j < strTwo.length()) {
            if (flag) {
                stringBuilder.append(strOne.charAt(i));
                i++;
            } else {
                stringBuilder.append(strTwo.charAt(j));
                j++;
            }
            flag = !flag;
        }

        while (i < strOne.length()) {
            stringBuilder.append(strOne.charAt(i));
            i++;
        }
        while (j < strTwo.length()) {
            stringBuilder.append(strTwo.charAt(j));
            j++;
        }
        return stringBuilder;
    }


    public static void main(String[] args) {
        String stringOne = "abc";
        String stringTwo = "defgh";
        System.out.println(mergedString(stringOne, stringTwo));
    }

}
