package Task2;
import java.util.Scanner;
public class Average {
	 void m1(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num =scan.nextInt();
		int average=0;
		int sum=0;
		for(int i=0;i<=num;i++) {
			sum+=i;
			average=sum/num;
		}
		System.out.println("The average is: "+average);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Average age = new Average();
		age.m1();
		

	}

}
