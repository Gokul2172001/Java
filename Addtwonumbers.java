//Java program for calculate addition of two numbers.
import java.util.Scanner;
class additionoftwonumbers {
	private static Scanner sc;
	public static void main(String args[]) {
		int num1,num2,sum;
		sc=new Scanner(System.in);
		System.out.println("Enter the first value....");
		num1=sc.nextInt();
		System.out.println("Enter the second value....");
		num2=sc.nextInt();
		sum=num1+num2;
		System.out.println("The addition of the values are...."+sum);
	}
}

		
