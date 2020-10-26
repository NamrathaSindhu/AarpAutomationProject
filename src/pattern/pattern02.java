/*
 A
 A B
 A B C
 A B C D
 A B C D E
 
 */

package pattern;

public class pattern02 {
	public static void main(String[] args) {
		
		int n=5;
		for(int i=1;i<=n;i++)
		{
			int k=64;
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(k+j) + " ");
			}
			System.out.println("");
		}
	}

}
