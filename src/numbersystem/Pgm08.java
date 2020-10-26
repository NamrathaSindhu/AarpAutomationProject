//Write a program to check the given number is PALINDROME or not?
package numbersystem;

import java.util.Scanner;

public class Pgm08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int rev = 0;
		int t = n;
		while (n != 0) {
			rev = rev * 10 + (n % 10);
			n = n / 10;
		}
		if (rev == t) {
			System.out.println(t + " Is palindrome");
		} else {
			System.out.println(t + " is not a palindrome");
		}
	}

}
