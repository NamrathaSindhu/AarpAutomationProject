package Strings;

import java.util.Scanner;

public class String07 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	char[] ch=str.toCharArray();
	String str1="";
	int count=0;
	for(int i=0;i<ch.length;i++)
	{
		if(ch[i]!=' ')
		{
			str1=str1+ch[i];
			count=count+1;
		}
	}
	System.out.println(str1);
	System.out.println(count);
}
}
