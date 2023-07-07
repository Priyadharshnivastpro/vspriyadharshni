package practice;
import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of the Rectangle: ");
		float length = scan.nextFloat();
		System.out.println("Enter the width of the Rectangle: ");
		float width = scan.nextFloat();
		float area = length*width;
		System.out.println("Area of Rectangle is: "+area);

	}

}
