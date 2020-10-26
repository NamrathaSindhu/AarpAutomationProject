//Write a program to display PRIME NUMBERS from 1 to n?
package numbersystem;

import java.util.Scanner;

public class Pgm05 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		for(int i=2;i<n;i++)
		{
			boolean isprime=true;
		
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					isprime=false;
					break;
				}
			}
			if(isprime==true)
			{
				System.out.println(i+" i is prime");
			}
			else
			{
				System.out.println(i+ " i is not prime");
			}
		}
		
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		boolean isprime=true;
//		for(int i=2;i<n;i++)
//		{
//			if(n%i==0)
//			{
//				isprime=false;
//				break;
//			}
//		}
//		if(isprime==true)
//		{
//			System.out.println(n+ " is prime");
//		}
//		else
//		{
//			System.out.println(n+ " is not a prime");
//		}
//	}


