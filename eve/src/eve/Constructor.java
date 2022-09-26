package eve;

class Demo1 {
	int x;
	int y;
	Demo1(){
		x = 10;
		y = 20;
	}
	Demo1(int x, int y){
		this.x = x;
		this.y = y;
	}
}

public class Constructor {

	public static void main(String[] args) {
		Demo1 demo = new Demo1();
		Demo1 demo1 = new Demo1(30,60);
		System.out.println(demo.x+demo.y);
		System.out.println(demo1.x+demo1.y);
	}

}
