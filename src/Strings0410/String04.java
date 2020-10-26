package Strings0410;

import java.util.Scanner;

public class String04 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		//System.out.println(str);
		int count=0;
		char[] ch=str.toCharArray();
		String str1="";
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==' ')
			{
				str=str+count;
				count=0;
			}
			else
			{
				str=str+ch[i];
				count++;
			}
		}
		str=str+count;
		System.out.println("String count is: "+str);
	}

}
