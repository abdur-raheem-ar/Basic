package eve;

public class HelloWorld {
	int a;
	//a = 10;
	private void met() {
		System.out.println("Met called...");
	}
	
}

class demo extends HelloWorld {
	void met1() {
		met();
	}
	public static void main(String[] args) {
		//met();
		HelloWorld H = new HelloWorld();
		System.out.println("Welcome to programming in Java...." + H.a);
		H.met1();
	}
}