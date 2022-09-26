package eve;

public class MultiArray1 {

	public static void main(String[] args) {
		int[][] arr= {
				{1,2,3}, // i[] = {1,2,3} j =1, j=2, j=3
				{4,5,6}, // i[] = {4,5,6}
				{7,8,9} // i[] = {7,8,9}
		};
		int[] arrr = {1,2,3}; // i = 1, i = 2, i = 3 - enhanced forloop
		int[][] arr1 = new int[3][3];
		System.out.println(arrr[0]);
		System.out.println(arr[0][2]);
		arrr[1] = 2;
		arr[0][2] = 3; //reassign
		System.out.println(arr[0][2]);
		
		System.out.println(arrr.length);
		System.out.println(arr.length); //no. of rows
		System.out.println(arr[0].length);// no. of columns
		
		for(int i:arrr) {
			System.out.println(i);
		}
		
		for(int[] i: arr) { // arr[0][]
			for(int j: i) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
