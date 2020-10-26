package Strings;

import java.util.Scanner;

public class String05 {

	public static void main(String[] args) {

		//palindrome
		
		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println("String is:"+ str);
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length/2;i++)
		{
			char t=ch[i];
			ch[i]=ch[ch.length-i-1];
			ch[ch.length-i-1]=t;
		}
		String s=new String(ch);
		if(str.equals(s))
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
	}

}
