package eve;

public class DataTypes {
	
	
	
	public static void main(String[] args) {
		// Datatypes - byte, short, int, long, float, double, char, String and boolean
		//type variableName = value;
		byte a = 127; // -127 - 127
		short b = 150; 
		int c = 12345; 
		long d = 123456789l;
		float e = 1.444444f; // 32bit
		double f =2.45656; //64 bit
		char g = 'a';
		char Ascii = 97;
		String h = "Hello...";
		boolean i = true;
		boolean j = false;
		System.out.println(Ascii);
		System.out.println(h);
		
		//Type Casting
		int x = a; // byte to int - automatic casting
		byte y = (byte)c;
		
		double z = e;
		float m = (float)f;
		
		int ic = 97;
		char cc = (char)ic;
		System.out.println(cc);
		
	}

}
