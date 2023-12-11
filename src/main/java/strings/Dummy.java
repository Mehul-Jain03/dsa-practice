package strings;

public class Dummy {

    public static void duplicate(String str){
        for(int i = 0;i<str.length();i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j) && (i != j)) {
                    isDuplicate = true;
                    System.out.println(str.charAt(i));
                    break;
                }
            }
        }
    }


    public static void main(String[] args) {
        duplicate("hubbule");
    }
}
