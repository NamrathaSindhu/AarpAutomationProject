package Strings0410;
import java.util.Scanner;

//Java Program to remove all the white spaces from a string
public class String05 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine();
		char[] ch=str.toCharArray();
		System.out.println("String is:"+str);
		String str1="";
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!=' ')
			{
				str1=str1+ch[i];
			}
		}
		System.out.println(str1);
	}
}
