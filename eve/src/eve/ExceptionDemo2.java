package eve;

public class ExceptionDemo2 {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Child baby = new Child();
		System.out.println("Before...");
		//dog.play("stick");
		baby.playWithDog(dog, "stick");
		System.out.println("After...");
	}
}
class Child {
	public void playWithDog(Dog dogg, String item) {
		try {
			dogg.play(item);
		}catch(DogBiteException e) {
			System.out.println(e);
		}
		
	}
}
class Dog {
	public void play(String item) throws DogBiteException {
		if(item.equals("stick")) {
			throw new DogBiteException("DogBiteException...");
		}
	}
}
class DogBiteException extends Exception {
	String msg;
	public DogBiteException(String msg) {
		this.msg = msg;
	}
	@Override
	public String toString() {
		return "Exception: " + msg;
	}
}
