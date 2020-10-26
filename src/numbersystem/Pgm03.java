//Write a program to display sum of 1 to N numbers?

package numbersystem;

import java.util.Scanner;

public class Pgm03 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println("Sum is:" + sum);
	}
}
