package practice;

import java.util.Scanner;

public class Multiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the value i: ");
		int i=obj.nextInt();
		System.out.println("Enter the value j: ");
		int j=obj.nextInt();
		int mult=i*j;
		System.out.println("The multiplication of i and j is : " + mult);

	}

}
