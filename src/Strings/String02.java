package Strings;
import java.util.Scanner;

public class String02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		
		String s=casechange(st);
		System.out.println(s);
	}

	public static String casechange(String st) {

		String s1=st.toLowerCase();
		return s1;
	}
}
