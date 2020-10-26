package Strings;
import java.util.Scanner;

public class Sring01 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s=sc.nextLine();
		String s1=removeSpace(s);
		System.out.println(s1);
	}

	public static String removeSpace(String s) {

		String st="";
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]!=' ')
			{
				st=st+ch[i];
			}
		}
		return new String(st);
	}
}
