package assignment;

import java.util.Scanner;

public class PerimeterOfArea {

	public static void main(String[] args) { 
	Scanner s = new Scanner(System.in); 
	System.out.println("Enter the radius of Circle");
	       double radius= s.nextDouble(); 
	       double perimeter; 
	       double area; 
	if(radius<=0) 
	{ 
	 System.out.println("please enter non zero positive number "); 
	} 
	else 
	{ 
	 perimeter = 2 * Math.PI * radius; 
	area = Math.PI * radius * radius; 
	System.out.println(perimeter); 
	 System.out.println(area);
	}}
}
