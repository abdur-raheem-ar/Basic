package eve;

public class AbstractDemo {
	static void mett() {
		System.out.println("....");
	}
	public static void main(String[] args) {
		Hall hall;
		Hall.met1();
		hall = new PartyHall();
		if (hall instanceof PartyHall) {
			System.out.println("Yes, Hall is an istance of party hall...");
		}
		hall.met();
		hall = new MeetingHall();
		hall = new PartyHall();
		if (hall instanceof MeetingHall) {
			System.out.println("Yes, Hall is an istance of meeting hall...");
		}
		else {
			System.out.println("No, Hall is an istance of party hall");
		}
		PartyHall halll = new PartyHall();
		accept(halll);
		accept(new MeetingHall());
		accept(new PartyHall());
	}
	 
	static void accept(PartyHall hall) {
		System.out.println("party..." + hall);
	}
	static void accept(MeetingHall hall) {
		System.out.println("meeting..." + hall);
	}

}

abstract class Hall {
	public void met() {
		System.out.println("Abstract class met..");
	}
	static {
		System.out.println("Static block of abs called...");
	}
	public Hall() {
		System.out.println("Cons of abs called...");
	}
	public static void met1() {
		System.out.println("Static met of abs called..");
	}	
}

class PartyHall extends Hall {
	public PartyHall() {
		System.out.println("Cons of party hall called...");
	}
}

class MeetingHall extends Hall {
	public MeetingHall() {
		System.out.println("Cons of meeting hall called...");
	}
}
