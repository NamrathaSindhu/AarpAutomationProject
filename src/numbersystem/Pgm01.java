//Write a program to Print 1 to N numbers?
package numbersystem;

import java.util.Scanner;

public class Pgm01 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("number is:"+ n);
		for(int i=1;i<=n;i++)
		{
			System.out.println(i);
		}
	
	}

}
