//program weather the number is PERFECT NUMBER or not?

package numbersystem;

import java.util.Scanner;

public class Pgm07 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==n)
		{
			System.out.println("The number "+ n+ " is a perfect number");
		}
		else
		{
			System.out.println("The number "+ n+ " is not a perfect number");
		}
	}

}
