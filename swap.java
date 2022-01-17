//Java program for swap two numbers
import java.util.Scanner;
class swap {
	private static Scanner sc;
	public static void main(String args[]) {
		float x,y,temp;
		sc=new Scanner(System.in);
		System.out.println("Enter the x number......");
		x=sc.nextFloat();
		System.out.println("Enter the y number.....");
		y=sc.nextFloat();
		System.out.println("---------- Before Swapping ----------");
		System.out.println("The x number is :" + x);
		System.out.println("The y number is :" + y);
		System.out.println("---------- After Swapping ----------");
		temp=x;
		x=y;
		y=temp;
		System.out.println("The x number is :" + x);
		System.out.println("The y number is :" + y);
	}
}