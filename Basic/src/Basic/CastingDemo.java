package Basic;

public class CastingDemo {

	public static void main(String[] args) {
		byte b = 20;
		int i = b;
		byte c = 2;
		
		//byte result = b%c;
		int result = b*c;
		byte bresult = (byte)(b*c);
		
		boolean boo = true;
		//int iboo = (int)boo;
		
		String str = "Hello World";
		//int istr = (int)str;
		
		int x = 100;
		//str = (String)x;
		
		char ch = 'a';
		char cc = 97;
		int ic = ch;
		char ci = (char)ic;
		
		int n = 257;
		byte bn = (byte)258;
		
		System.out.println(bn);
	}

}
