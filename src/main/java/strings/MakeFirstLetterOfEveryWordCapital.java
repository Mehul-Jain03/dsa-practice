package strings;

public class MakeFirstLetterOfEveryWordCapital {


    public static String make(String s) {
        String uppers = s.substring(0, 1).toUpperCase() + s.substring(1);
        System.out.println(uppers);
        return uppers;
    }

    public static void main(String[] args) {
        String s = "hi what are you doing?";
        String[] sArr = s.split(" ");
        String sNew = "";
        for (int i = 0; i < sArr.length; i++) {
            sNew += make(sArr[i]) + " ";
        }
        System.out.println(sNew);
    }

}
