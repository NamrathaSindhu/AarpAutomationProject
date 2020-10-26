/*
a
b b
c c c
d d d d
e e e e e

*/


package pattern;

public class pattern08 {

	public static void main(String[] args) {
		
		int n=5;
		int k=97;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print((char)k+" ");
				
			}
			k++;
			System.out.println();
		}
	}
}
