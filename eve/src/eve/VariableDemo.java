package eve;

public class VariableDemo {
// Variable - Instance, Class/static And Local
	int x = 10; // Instance variable - declared immediately in a class
	static int y = 20; // Class/ Static variable
	void met(int x, int y) { // Local variable - variables declared inside a method either as paramaters or inside it.
		int z = 10; 
	}
	
	
	public static void main(String[] args) {
		VariableDemo obj = new VariableDemo();
		System.out.println(obj.x);
		System.out.println(y);
		System.out.println(obj.z); // Error bcos local variables are only accessible inside their method
	}
}
