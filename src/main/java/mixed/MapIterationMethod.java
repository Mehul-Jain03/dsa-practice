package mixed;

import java.util.HashMap;
import java.util.Map;

public class MapIterationMethod {

	public static void main(String[] args) {
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		hm.put("Mehul", 1001);
		hm.put("Aman", 1002);
		hm.put("Jayesh", 1003);
		hm.put("Rahul", 1004);
		hm.put("Kartik", 1005);
		hm.put("Siddharth", 1006);
		
		//1st Way
		for(Map.Entry<String, Integer> entry : hm.entrySet())
		{
			System.out.println("Key is : "+ entry.getKey() + " and value is : "+ entry.getValue());
		}
		System.out.println("----------------------------------------------------------------------------------"); 
		
		
		//2nd Way
		for(String s : hm.keySet())
		{
			System.out.println("Keys are : "+ s);
			
		}
		for(Integer p : hm.values())
		{
			System.out.println("Values are : "+ p);
			
		}
		System.out.println("----------------------------------------------------------------------------------"); 
		
		
		//3rd Way
		hm.forEach((k,v) -> System.out.println("Key = "
                + k + ", Value = " + v));
	}

}
