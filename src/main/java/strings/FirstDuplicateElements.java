package strings;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstDuplicateElements {
	
	
	public static void firstDuplicateChar(String str) {
		
		char[] chars = str.toCharArray();
		
		Map<Character, Integer> map = new LinkedHashMap<>();
		
		for(char c : chars) {
			if(!map.containsKey(c)) {
				map.put(c, 1);
			}
			else {
				System.out.println("The First Duplicate Element is : "+c);
				break;
			}
		}
	}
	
	
	public static void main(String[] args) {

		firstDuplicateChar("mmehul");

	}

}
