package eve;

class Demo {
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

public class Encapsulation{
	
	public static void main(String[] args) {
		Demo demo = new Demo();
		//demo.name = "Abdur";
		demo.setName("Abdur");
		System.out.println(demo.getName());
		
	}

}
