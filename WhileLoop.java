package practice;
import java.util.Scanner;

public class WhileLoop {
	public static void main(String[] args) {
		int num ,
		 sum =0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a integer value below 12: ");
		num = scan.nextInt();
		while (num<=12) {
			sum = sum + num;
			num++;
		}
		System.out.format("Sum of numbers from the while loop is : %d ", sum);
		
	}

}
