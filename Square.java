package practice;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the side of square: ");
		Scanner scan = new Scanner(System.in);
		int side = scan.nextInt();
		int area = side*side;
		System.out.println("Area of square is: "+area);

	}

}
