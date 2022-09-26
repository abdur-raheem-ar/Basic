package eve;

public class ClassDemo2 {

	public static void main(String[] args) {
		TrainingRoom tr1 = new TrainingRoom();
		TrainingRoom tr2 = new TrainingRoom();
		System.out.println(tr1.tb);
		System.out.println(tr2.tb);
		System.out.println(tr1.tl);
		System.out.println(tr2.tl);
		

	}

}

class TrainingRoom {
	Table tb = new Table();
	static Toilet tl = new Toilet();
}

class Table {
	
}

class Toilet {
	
}