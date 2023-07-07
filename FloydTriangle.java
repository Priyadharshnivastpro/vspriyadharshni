package practice;

import java.util.Scanner;

public class FloydTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num1, num2 = 1, i ,j;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of rows for floyd's triangle :");
        num1 = input.nextInt();
        System.out.println("Floyd's triangle");
        for (i = 1;i <= num1;i++) {
        	for(j = 1;j <=i;j++) {
        		System.out.print(num2+" ");
        		num2++;
        	}
           System.out.println();
        }
	}

}
