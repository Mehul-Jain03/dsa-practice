package strings;

import java.util.ArrayList;
import java.util.List;

public class FindNumbersInString {

    public static List<Integer> getNumbers(String str) {
        List<Integer> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                sb.append(str.charAt(i));
            } else {
                if (!sb.isEmpty()) {
                    ans.add(Integer.parseInt(sb.toString()));
                    sb = new StringBuilder();
                }
            }
        }
        ans.add(Integer.parseInt(sb.toString()));
        return ans;
    }

    public static void main(String[] args) {
        String str = "TestCasesPassed100TestCasesFailed50TestCasesSkipped25";
        System.out.println(getNumbers(str));
    }


}
