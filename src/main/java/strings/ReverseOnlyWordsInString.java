package strings;

public class ReverseOnlyWordsInString {


    public static String reverse(String str){
        String reversed = "";
        for(int i = str.length()-1;i>=0;i--){
            reversed = reversed+str.charAt(i);
        }
        return reversed;
    }

    public static void main(String[] args) {
        String inputString = "hi what are you doing?";
        String outputString = "";
        String[] arrayOfString = inputString.split(" ");
        for (String str : arrayOfString ){
            outputString=outputString+reverse(str)+" ";
        }
        System.out.println(outputString.trim());
    }

}
