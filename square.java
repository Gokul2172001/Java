//Java Program to find square of the number
import java.util.Scanner;
class square {
	private static Scanner sc;
	public static void main(String args[]) {
		int number,square;
		sc=new Scanner(System.in);
		System.out.println("Enter the number to get Square....");
		number=sc.nextInt();
		square=number*number;
		System.out.println("The Square of the number is :"+square);
	}
}

		