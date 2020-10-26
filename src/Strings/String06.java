package Strings;

import java.util.Scanner;

public class String06 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println("String is:"+str);
		char[] ch=str.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!=' ')
			{
				count=count+1;
			}
		}
		System.out.println("character count is:"+count);
	}
}
