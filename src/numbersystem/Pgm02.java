//Write a program to Print REVERSE of N to 1 numbers?
package numbersystem;

import java.util.Scanner;

public class Pgm02 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Number is:"+ n);
		for(int i=n;i>0;i--)
		{
			System.out.println(i);
		}
	}

}
