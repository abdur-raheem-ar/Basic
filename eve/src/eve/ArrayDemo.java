package eve;

public class ArrayDemo {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4}; // Single dimensional array
		System.out.println(arr[1]); //prints 2
		arr[1] = 3;
		System.out.println(arr[1]);// prints 3
		int[] arr1 = new int[4]; //Declaring an array of size 4
		//int[] arr1 = {0,0,0,0} By default int values will be 0
		System.out.println(arr1[2]);
		arr1[2] = 5;
		System.out.println(arr1[2]);
		System.out.println(arr.length);
		
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
		for(int i:arr) { //Enhanced for loop
			System.out.println(i);
		}
	}
}
