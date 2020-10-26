//Java Program to count the total number of punctuation characters exists in a String
package Strings0410;

import java.util.Scanner;

public class String02 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char[] ch=str.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==','||ch[i]=='.'||ch[i]=='!')
			{
				count++;
			}
		}
		System.out.println("character count is:"+count);
	}

}
