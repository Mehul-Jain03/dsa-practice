package arrays;

public class FactorialOfNumber {

    public static int factorial(int a){
        if(a == 0){
            return 1;
        }
        return  a*factorial(a-1);
    }


    public static void main(String[] args) {
        System.out.println(factorial(5));

        String s1 = new String("mehul");
        String s2 = new String("mehul");
//        System.out.println(s1==s2);
//        System.out.println(s1.equals(s2));

        String s3 =  "mehul";
        String s4 = "mehul";
        System.out.println(s3==s4);
        System.out.println(s3.equals(s4));
    }
}
