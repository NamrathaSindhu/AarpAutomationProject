//Java Program to find all subsets of a string
package Strings0410;

import java.util.Scanner;

public class String06 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine();
		char[] ch=str.toCharArray();
		String str1="";
		for(int i=0;i<ch.length;i++)
		{
			for(int j=0;j<ch.length;j++)
			{
			str1=str.substring(i,j);
			}
			System.out.println("Substring is:"+str1 );
		}
		
	}
}
