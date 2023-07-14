package fridaytask;

public class ExceptionHandle {
	
	public static void main(String[] args){
		
		exceptionmethod();
		
	}
	
	public static  void exceptionmethod()
	{
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		try {
			System.out.println(4/0);
		

		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic exceptions is handled");
		}
		finally
		{
			System.out.println("Finally is executed");
		}
		
	
	}

}
