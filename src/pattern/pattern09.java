/*
         a
       b a
     c b a
   d c b a
 e d c b a 
 
 */

package pattern;

public class pattern09 {
public static void main(String[] args) {
	int n=5;
	int k[]=new int[5];
	
	for(int i=0;i<n;i++)
	{
		int r=4;
		for(int j=0;j<n;j++)
		{
			if(j<n-i-1)
			{
			System.out.print(" ");
			}
			else
			{
				System.out.print((char)(k[r]+69));
			}
			r--;
		}
		System.out.println();
	}
}
}
