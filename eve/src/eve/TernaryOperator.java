package eve;

public class TernaryOperator {
	public static void main(String[] args) {
		//Arithmetic Operators - + - * / %
		int a = 20;
		int b = 20;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(b/a);
		System.out.println(b%a);
		//10/3=3 10%3=1
		
		//Increment++ and Decrement--
		System.out.println(++a);  //20
		System.out.println(a);  //21
		System.out.println(--b); //19
		System.out.println(b); //19
		
		//Relational Operators - ==, <=, >= , <, >, != (true or false)
		
		System.out.println(a == b); //true
		System.out.println(a != b); //false
		System.out.println(a < b); // false
		System.out.println(a > b); // false
		System.out.println(a <= b);// true
		System.out.println(a >= b); //true
		
		int x = 10;
		int y = 10;
		
		//Logical Operator - && And   || or   ! Not
		// AND - if both returns true then the result will be true
		System.out.println(x == y && x >= y);
		// Or - If any one is true then the result will be true
		System.out.println(x == y || x > y);
		// Not - It will reverse the result
		System.out.println(!(x == y));
		
		
	}
}
