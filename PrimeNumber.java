package practice;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int i =0;
      int num =0;
      String primeNumbers = "";
      for (i=1;i<=50;i++) {
    	  int count =0;
    	  for(num =i;num>=1;num--) {
    		  if(i%num==0) {
    			  count = count +1;
    			  
    		  }
    	  }
    	  if (count==2) {
    		  primeNumbers = primeNumbers +i+" ";
    		  
    	  }
      }
      System.out.println("Prime numbers from 1 to 100 are:");
      System.out.println(primeNumbers);
	}

}
