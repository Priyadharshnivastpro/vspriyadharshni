package assignment;

import java.util.Scanner;

public class EvenNumber {
	
	       public static void main(String[] args) { 
	    	   int n;
	    	   System.out.println("Enter the number");
	     Scanner sc = new Scanner(System.in); 
	     n=sc.nextInt(); 
	    int sum=0; 
	int result=1; 
	int i=0; 
	
	while(result<=n) 
	   { 
	    if(i%2==0) 
	    { 
	     if(i%3==0) 
	     { 
	       sum=sum+i; 
	       
	         }       
	     result=result+1;  
	    } 
	    i=i+1; 
	   } 
	      System.out.println(sum); 
	 } 
	
	 

}
