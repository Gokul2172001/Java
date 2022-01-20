//Java program for find number of even numbers in 1 to 100.
import java.util.Scanner;
class even1to100 {
	private static Scanner sc;
	public static void main(String[] args) {
		int i;
		sc=new Scanner(System.in);
		System.out.println("The first 100 even numbers are...");
		for(i=0;i<100;i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
		
	}
}

