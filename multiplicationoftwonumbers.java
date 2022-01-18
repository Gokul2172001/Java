//Java program for calculate multiplication of two numbers.
import java.util.Scanner;
class multiplicationoftwonumbers {
	private static Scanner sc;
	public static void main(String args[]) {
		int num1,num2,mul;
		sc=new Scanner(System.in);
		System.out.println("Enter the first value....");
		num1=sc.nextInt();
		System.out.println("Enter the second value....");
		num2=sc.nextInt();
		mul=num1*num2;
		System.out.println("The multiplication of the values are...."+mul);
	}
}

		
