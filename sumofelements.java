//Java program for calculate sum of array.
import java.util.Scanner;
class sumofarray
{
	private static Scanner sc;
	public static void main(String args[])
	{
		int i,size,sum=0;
		sc=new Scanner(System.in);
		System.out.println("Please Enter the size of the array..");
		size=sc.nextInt();
		System.out.println("Enter the "+size+" of elements:");
		int[] a=new int[size];
		for(i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<size;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("Sum of the elements are..."+sum);
	}
}
