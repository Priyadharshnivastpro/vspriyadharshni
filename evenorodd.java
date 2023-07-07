package practice;
import java.util.Scanner;

public class evenorodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter an Integer number: ");
		number = obj.nextInt();
		if(number%2==0)
			System.out.println("Enter num is even : ");
		else {
			System.out.println("Enter num is odd : ");
		}
		

	}

}
