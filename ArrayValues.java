package practice;

public class ArrayValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {10,39,47,54};
		int sum = 0;
		for(int num : array) {
			sum = sum+num;
		}
        System.out.println("Sum of arry elements is :" +sum);
	}

}
