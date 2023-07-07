package Task2;
import java.util.Scanner;

public class Ascending_Descending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] a = new int[5];
		int i,j,temp;
		System.out.println("Enter 5 elements in array");
		for(i=0;i<5;i++) {
			a[i] =scan.nextInt();}
		for(i=0;i<5;i++) {
			for(j=i+1;j<5;j++) {
				if(a[i]>a[j]) {
				  temp=a[i];
				  a[i]=a[j];
				  a[j]=temp;
				}
			}
		}
		System.out.println("Sorted array in Increasing order:");
		for(j=0;j<5;j++) {
		System.out.println(a[j]);
		}
		for(i=0;i<5;i++) {
			for(j=i+j;j<5;j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;}}}
		System.out.println("Sorted arry in decreasing order:");
		for(j=0;j<5;j++) {
			System.out.println(a[j]);}
				}
			}
		


