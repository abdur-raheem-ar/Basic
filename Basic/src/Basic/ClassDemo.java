package Basic;

public class ClassDemo {

	public static void main(String[] args) {
		TrainingRoom tr1 = new TrainingRoom();
		TrainingRoom tr2 = new TrainingRoom();
		System.out.println(tr1.tb);
		System.out.println(tr1.sulab);
		System.out.println(tr2.tb);
		System.out.println(tr2.sulab);
	}

}

class TrainingRoom {
	static Toilet sulab = new Toilet();
	Table tb = new Table();
}

class Toilet {
	
}

class Table {
	
}
