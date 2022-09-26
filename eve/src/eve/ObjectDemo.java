package eve;

public class ObjectDemo {

	public static void main(String[] args) {
		int x = 100; //simple
		Humann junaid = new Humann(); // complex
		Humann mahdi = new Humann();
		System.out.println(x);
		System.out.println(junaid.x);
		junaid.met();
		junaid.mett();
		System.out.println(junaid.mett());
		System.out.println(junaid.sss);
		System.out.println(mahdi.sss);
	}

}

class Humann {
	int x = 10;
	void met() { //non returnable
		System.out.println("met called...");
	}
	String mett() {
		System.out.println("returnable met called..");
		return "Hello";
	}
	String s = mett();// s = "Hello"
	Humann sss = new Humann();
}
