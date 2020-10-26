
//Write a program to check given number is EVEN or ODD?
package numbersystem;

import java.util.Scanner;

public class Pgm04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				System.out.println(i + "number is even");
			}

			else {
				System.out.println(i + "number is odd");
			}
		}
	}

}
