package fridaytask;

import java.util.Scanner;

abstract class Shape {
	abstract void calculateArea();

	public static double area;
	Scanner scan = new Scanner(System.in);
}

class Rectangle extends Shape {

	@Override
	public void calculateArea() {
		System.out.println("Enter the length of Rectangle");
		int length = scan.nextInt();
		System.out.println("Enter the width of Rectangle");
		int width = scan.nextInt();
		System.out.println("Print the length and width of Rectangle:" + area);
		area = length * width;
	}
}

class Circle extends Shape {
	
	@Override
	public void calculateArea() {
		System.out.println("enter the radius of circle");
		int radius = scan.nextInt();
		area = (Math.PI) * (radius * radius);
		System.out.println("Print the radius of Circle:" + area);
	}

	}


