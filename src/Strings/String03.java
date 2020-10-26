package Strings;

import java.util.Scanner;

public class String03 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		String st1=sc.nextLine();
		String st2=sc.nextLine();
		String s1=compare(st1);
		String s2=compare(st2);
		System.out.println(s1+"  "+s2);
	}

	public static String compare(String st1) {
		char[] ch=st1.toCharArray();
		//char[] ch2=st2.toCharArray();
		
		for(int i=0;i<ch.length-1;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]>ch[j])
				{
					char t=ch[i];
					ch[i]=ch[j];
					ch[j]=t;
				}
				
			}
			
		}
		String s= new String(ch);
		return s;
	}
}
