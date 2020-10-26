package Strings;

import java.util.Scanner;

public class String04 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		String str1=sc.nextLine();
		System.out.println(str1);
		String str2=sc.nextLine();
		String rs1=removeSpace(str1);
		String rs2=removeSpace(str2);
		System.out.println(rs1+"  "+rs2);
		String lc1=lowerCase(rs1);
		String lc2=lowerCase(rs2);
		System.out.println(lc1+" "+lc2);
		String cmp1=compareStr(lc1);
		String cmp2=compareStr(lc2);
		System.out.println(cmp1+" "+cmp2);
		anagram(cmp1,cmp2);
	}

	public static void anagram(String cmp1, String cmp2) {
		if(cmp1.length()==cmp2.length())
		{
			System.out.println("check for anagram");
		}
		else
		{
			System.out.println("Strings are not anagram");
		}
		if(cmp1.equals(cmp2)) {
			System.out.println("Strings are anagram");
		}
		else {
			System.out.println("Strings are not anagram");
		}
		
		
	}

	public static String compareStr(String lc1) {
		char[] ch=lc1.toCharArray();
		
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
		
		return new String(ch);
	}

	public static String lowerCase(String rs1) {

		
		String str=rs1.toLowerCase();
		return str;
	}

	public static String removeSpace(String str1) {
		char[] ch=str1.toCharArray();
		String str="";
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!=' ')
			{
			str=str+ch[i];
			}
		}
		return new String(str);
	}
	
	

}
