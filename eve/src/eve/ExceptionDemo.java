package eve;

public class ExceptionDemo {
	public static void main(String[] args) throws Exception {
		System.out.println("Before...");
		new ExceptionDemo().met();
		System.out.println("After...");
	}
	void met() throws Exception {
		super.clone();
	}
}
