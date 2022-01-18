//Java program for calculate Area of Rectangle
import java.util.Scanner;
class areatriangle {
	private static Scanner sc;
	public static void main(String args[]) {
		int breadth,length,area;
		sc=new Scanner(System.in);
		System.out.println("Enter the breadth of the Rectangle....");
		breadth=sc.nextInt();
		System.out.println("Enter the length of the Rectangle....");
		length=sc.nextInt();
		area=breadth*length;
		System.out.println("The area of the Rectangle is......"+area);
	}
}
		