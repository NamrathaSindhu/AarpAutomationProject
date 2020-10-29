package employee;

import java.util.Scanner;

public class EmployeeInfo {

	String empInfo;
	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		String[] str=new String[10];
		for(int i=0;i<10;i++)
		{
			System.out.println("Employee info");
			str[i]=sc.nextLine();
		}
	}
}
