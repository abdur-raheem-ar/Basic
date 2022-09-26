package eve;

public class StaticDemo2 {
	public static void main(String[] args) {
		StatBlock obj = new StatBlock();
		StatBlock.met();
		StatBlock.met1();
	}
}

class StatBlock {
	public StatBlock() {
		System.out.println("Cons called...");
	}
	static {
		System.out.println("Static block called...");
	}
	static void met() {
		System.out.println("Static met called...");
	}
	static void met1() {
		System.out.println("Static met1 called...");
	}
}