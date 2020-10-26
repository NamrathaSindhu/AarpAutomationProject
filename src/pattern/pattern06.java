/*
    e
   de
  cde
 bcde
abcde



        
 */
package pattern;

public class pattern06 {
	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<n;i++)
		{
			int k=97;
			for(int j=0;j<n;j++)
			{
				if(j<n-i-1)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print((char)(j+k));
				}
			}
			System.out.println();
		}
	


	}
}
