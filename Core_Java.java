package Task3;
import java.util.Scanner;

public class Core_Java {

	
			
					int add(int num1,int num2) {		
					    int sum=num1+num2;
					   System.out.println("The sum of number is:" + sum);
					    return sum;
						
					}
				    int subtract(int num1,int num2) {
				    	 int difference=num1-num2;
				    	 System.out.println("The difference of number is:" + difference);
					 return difference;
						
					}
				     int multiple(int num1,int num2) {
				 	   int multiple=num1*num2;
					  System.out.println("The multiple of number is: "+ multiple);
					    return multiple;
					
				      }
				    int division( int num1,int num2) {
				        int division=num1/num2;
					  System.out.println("The division of number is: "+division);
					    return division;
					
				     }
				    int PowerCalculation(int num1,int num2) {
				    	
				    	int power = 1;  
						for (int i = 1; i <= num1; i++)   
						power = power * num2;
						System.out.println("The power value is :"+power);
						return power;  
						
				    
					
				     }

					
						public static void main(String[]args)
						{
							Scanner input = new Scanner(System.in);
							System.out.println("Enter the First Number");
							int num1= input.nextInt();
							System.out.println("Enter the Second Number");
							int num2=input.nextInt();
							
							Core_Java arthamatic= new Core_Java();
							arthamatic.add( num1, num2);
							arthamatic.subtract(num1,num2);
							arthamatic.multiple(num1,num2);
							arthamatic.PowerCalculation(num1,num2);
							arthamatic.division(num1,num2);

						
					}



			


}
