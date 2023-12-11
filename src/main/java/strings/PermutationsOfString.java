package strings;

public class PermutationsOfString {

    public static void printAllPermutations(String str){
        int factorial = factorial(str.length());
        for(int i=0;i<factorial;i++){
            StringBuilder sb = new StringBuilder(str);
            int temp = i;
            for(int div = str.length();div>=1;div--){
                int q = temp/div;
                int r = temp%div;
                System.out.print(sb.charAt(r));
                sb.deleteCharAt(r);
            }
            System.out.println();
        }
    }

    public static int factorial(int n){
        if(n == 1){
            return 1;
        }
        return n * factorial(n-1);
    }

    public static void main(String[] args) {
        String str = "abc";
        printAllPermutations(str);
    }
}
