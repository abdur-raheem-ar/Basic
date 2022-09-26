package eve;

public class StringMethods {

	public static void main(String[] args) {
		String s = "Hello";
		System.out.println(s.charAt(0)); // Prints the char at 0th index
		System.out.println(s.endsWith("l"));
		System.out.println(s.substring(1));
		System.out.println(s.substring(1,4));
		String s2 = " world";
		String s3 = s.concat(s2); // s3 = s + s2
		System.out.println(s3);	
		
		String name = "abu";
		String name2 = "Abu";
		System.out.println(name.equals(name2));
		System.out.println(name.equalsIgnoreCase(name2));
		
		String x = "z"; 
		String y = "a"; 
		System.out.println(x.compareTo(y)); // a - b
		
	}

}
