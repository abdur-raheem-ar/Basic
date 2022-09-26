package Basic;

public class WrapperClass {

	public static void main(String[] args) {
		// Wrapper classes - complex types
		
		Integer i;
		Float f;
		Short s;
		Byte b;
		Long l;
		Double d;
		
		int x = 100;
		i = new Integer(x);// Boxing (depricated)
		i = Integer.valueOf(x); //Boxing
		i = 100; // Auto boxing
		i = x; // Auto boxing
		
		x = i.intValue();// Unboxing
		x = i;// Auto unboxing 
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.compare(10, 20));
		System.out.println(Integer.max(10, 20));
		System.out.println(Integer.min(10, 20));
		
		String str = "123";
		String str1 = "123";
		int n = Integer.parseInt(str);
		System.out.println(n + Integer.parseInt(str1));
	}

}
