package Strings0410;

import java.util.Scanner;

public class String07 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine();
		char[] ch=str.toCharArray();
		int n=ch.length;
		
		for(int i=0;i<n-1;i++)
		{
			int count=1;
			for(int j=i+1;j<n;j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
					ch[j]=ch[n-1];
//					int k=j;
//					while(k<n-1)
//					{
//						ch[k]=ch[k+1];
//						k++;
//					}
					j--;
					n--;
				}
				
			}
			System.out.println(ch[i]+" char count is"+ count);
		}
	}

}
