//Java Program to count the total number of vowels and consonants in a string
package Strings0410;

import java.util.Scanner;

public class String03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] ch = str.toCharArray();
		int vowel = 0;
		int cons = 0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 65 && ch[i] <= 90) {
				if (ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'O' || ch[i] == 'U' || ch[i] == 'I') {
					vowel++;
				}
				else {
					cons++;
				}
			} else if (ch[i] >= 97 && ch[i] <= 122) {

				if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'o' || ch[i] == 'u' || ch[i] == 'i') {
					vowel++;
				}
				else {
					cons++;
				}
			}
			
			
		}
		System.out.println("Vowels and cons count is"+ vowel+" "+ cons);
	}
}