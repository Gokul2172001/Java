//Java program for find the number even or odd.
import java.util.Scanner;
class evenorodd {
	private static Scanner sc;
	public static void main(String[] args) {
		int num;
		sc=new Scanner(System.in);
		System.out.println("Enter the integer number...");
		num=sc.nextInt();
		if(num%2==0) {
			System.out.println("The number is even.");
		}
		else {
			System.out.println("The number is odd.");
		}
	}
}


