package strings;

import java.util.Set;
import java.util.TreeSet;

public class UniqueCharactersFromString {

    public static void unique(String string){
        Set<Character> unique = new TreeSet<>();
        for(char c : string.toCharArray()){
            unique.add(c);
        }

        System.out.println(unique);
    }

    public static void main(String[] args) {
        unique("Mehul");
        unique("mehum");
        unique("gharg");
    }
}
