package Strings;

import java.util.Scanner;

public class String08 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	String str=sc.nextLine();
	char[] ch=str.toCharArray();
	int sum=0;
	for(int i=0;i<ch.length;i++)
	{
		if(ch[i]>=47&&ch[i]<=58)
		{
			sum=sum+ch[i]-48;
		}
	}
	System.out.println(sum);
}
}
