//Write a program to find SUM OF PRIME numbers?
package numbersystem;

import java.util.Scanner;

public class Pgm06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 2; i < n; i++) {
			boolean isprime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isprime = false;
					break;
				}
			}
			if (isprime == true) {
				sum = sum + i;
			}
		}
		System.out.println(" the sum of prime" + n + " number is:" + sum);
	}

}
