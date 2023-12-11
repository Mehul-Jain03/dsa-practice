package strings;

public class FirstNonRepeatingChar {

    public static void firstNonRepeatingChar(String str){
        for(int i =0;i<str.length();i++){
            if(str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i))){
                System.out.println(str.charAt(i));
                break;
            }
        }
    }




    public static void main(String[] args) {
        String string = "mmehul";
        firstNonRepeatingChar(string);
    }
}
