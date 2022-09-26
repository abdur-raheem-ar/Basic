package eve;

public class MethodDemo {
	int x = 10;
	// Returnable Method - int, float, double, char, boolean, etc
	int retMet() {
		return 10;
	}
	int y = retMet();
	float retMet2() {
		return 10;
	}
	boolean retMet3() {
		return true;
	}
	
	// Non- returnable Method
	void nonRetMet(int x, float y) { // x and y are parameters
		System.out.println("Non returnable Method " + x + " " + y);
	}
	
	
	public static void main(String[] args) {
		MethodDemo obj1 = new MethodDemo();
		System.out.println(obj1.x);
		System.out.println(obj1.y);
		System.out.println(obj1.retMet2());
		System.out.println(obj1.retMet3());
		obj1.nonRetMet(5,10); //5 and 10 are arguements - values passed to the paramter
	}
	
}

class Demo {
	MethodDemo obj = new MethodDemo();
	void myMet() {
		MethodDemo obj = new MethodDemo();
		obj.retMet();
	}
}
