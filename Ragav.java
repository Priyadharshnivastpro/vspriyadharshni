package assignment;

import java.util.Scanner;

public class Ragav {
	 public static void main(String[] args) { 
		         int i;
		 System.out.println("Enter number of subjects");
		   Scanner input = new Scanner(System.in); 
		         double mark_avg; 
		         int result; 
		         int s; 
		      
		       s = input.nextInt(); 
		     
		      int[] arr = new int[s]; 
		      System.out.println("Enter marks");
		      for(i=0;i<arr.length;i++) 
		    { 
		  arr[i]=input.nextInt(); 
		        } 
		int max=arr[0]; 
		      double sum=arr[0];   
		   for(i=1;i<arr.length;i++) 
		    {  
		         sum=sum+arr[i];  
		         if(arr[i]>max) 
		            max =arr[i]; 
		    } 
		   
		   result=max;   
		   mark_avg=sum/(arr.length);     
		    System.out.println("Highest mark: "+result); 
		    System.out.println("Average mark: "+mark_avg);
	 }

}
