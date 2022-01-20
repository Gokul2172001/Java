//java program for find the prime number.
import java.util.Scanner;
class prime
{
	private static Scanner sc;
	public static void main(String args[])
	{
		int i,number,count=0;
		sc=new Scanner(System.in);
		System.out.println("Enter the number...");
		number=sc.nextInt();
		for(i=2;i<=number/2;i++)
		{
			if(number%i==0)
			{
				count++;
				break;
			}
		}
		if(count==0&&number!=1)
		{
			System.out.println(number+" is a prime number.");
		}
		else
		{
	
			System.out.println(number+" is not a prime number.");
		}
	}
}