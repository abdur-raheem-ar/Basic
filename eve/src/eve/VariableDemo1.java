package eve;

public class VariableDemo1 {

	public static void main(String[] args) {
		//DataType - simple or primitive , Complex or non-primitive
		//Scope of variable - Instance, Local, Class or static
		VD obj = new VD();
		obj.x = 50;
		VD obj2 = new VD();
		obj2.x = 100;
		System.out.println(obj.x);
		System.out.println(obj2.x);
		
		VD.z = 50;
		VD.z = 100;
		System.out.println(VD.z);
		System.out.println(VD.z);
	}

}

class VD {
	int x; //instance variable
	static int z; // Class variable
	void met() {
		int y = 20; // local variable
		System.out.println(x);//20
	}
//	void met2 {
//		System.out.println(y);//10
//	}
}
