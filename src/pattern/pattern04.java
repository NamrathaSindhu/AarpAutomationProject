/*
a
a b
a b c
a b c d
a b c d e
*/
package pattern;

public class pattern04 {

	public static void main(String[] args) {

		int n=5;
		for(int i=0;i<n;i++)
		{
			int k=97;
			for(int j=0;j<=i;j++)
			{
				System.out.print((char)(j+k)+" ");
			}
			System.out.println();
		}
	}

}
