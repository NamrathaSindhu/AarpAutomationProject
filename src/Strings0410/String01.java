//Java Program to count the total number of characters in a string
package Strings0410;

import java.util.Scanner;

public class String01 {

	public static void main(String[] args) {

	Scanner sc= new Scanner(System.in);
		String str=sc.nextLine();
		char[] ch=str.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>=65&&ch[i]<=90||ch[i]>=97&&ch[i]>=122||ch[i]<=48&&ch[i]>=58||ch[i]!='.'||ch[i]!=' ')
			{
				System.out.println("******************");
				count++;
			}
			
		}
		System.out.println("Character count is:"+count);
//		
//		Scanner sc= new Scanner(System.in);
//		String str=sc.nextLine();
//		char[] ch=str.toCharArray();
//		int count=0;
//		String str1="";
//		for(int i=0;i<ch.length;i++)
//		{
//			if(ch[i]!=' ')
//			{
//				str1=str1+ch[i];
//				count++;
//			}
//		}
//		System.out.println("String is "+str1+"Character count is: "+count);
	}

}
