package Strings;

import java.util.Scanner;

public class String09 {

	public static void main(String[] args) {
 Scanner sc= new Scanner(System.in);
 String str= sc.nextLine();
char[] ch=str.toCharArray();
 String nst="";
 int nc=0;
 for (int i=0; i<str.length();i++ )
 {
 if (str.charAt(i)!=' ')
 {
	 nc++;
	 nst=nst + str.charAt(i);
 }
 else
 {
	 nst=nst + nc;
	 nc=0;
 }
 }
 nst=nst + nc;
 System.out.println (" no of character in each word in a string is "+ nst);
 
	}

}
