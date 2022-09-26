package lab;

import java.util.Scanner;

public class Multiply {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter value for i : ");
		int i = reader.nextInt();
		System.out.println("Enter value for j : ");
		int j = reader.nextInt();
		int sum = i*j;
		System.out.println("Multiplication of i and j is : " + sum);
	}
}
