package mixed;

public class StringManipulation {

	public static void main(String[] args) {
		
		/*String s = "I am going to manipulate this String";
		
		String s1 = "I am Going to manipulate this String";
		*/
		
		//System.out.println(s.length());
		
		//System.out.println(s.charAt(3));
		
		//System.out.println(s.indexOf("g"));
		
		//System.out.println(s.indexOf("g", s.indexOf("g")+1));
		
		//String Comparison
		//System.out.println(s.equals(s1));
		
		//System.out.println(s.equalsIgnoreCase(s1));
		
		//Substring
		
		//System.out.println(s.substring(0, 4));
		
		//Trim
		//String s2 = "       Hello there are spaces       ";
		//System.out.println(s2.trim());
		//System.out.println(s2.replace(" ", ""));
		
		//Spilt
		/*
		String s3 = "Hello_world_this_is_my_selenium";
		String splitted[]= s3.split("_");
		for(int i=0;i<=splitted.length-1;i++)
		{
			System.out.println(splitted[i]);
		}*/
		
		
		/*String s4 = "Care";
		System.out.println(s4.concat("s"));
		*/
		
		String s5 = "Hello";
		String s6 = "World";
		
		int a = 200;
		int b = 50;
		
		System.out.println(s5+s6);
		System.out.println(a+b);
		
		System.out.println(s5+s6+a+b);
		System.out.println(a+b+s5+s6);
		System.out.println(s5+s6+(a+b));
		
	}

}
