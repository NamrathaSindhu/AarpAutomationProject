/*
 * 
 00 01 02 03 04 05 06         
 10 11 12 13 14 15 16
 20 21 22 23 24 25 26
 30 31 32 33 34 35 36
 40 41 42 43 44 45 46
 50 51 52 53 54 55 56
 60 61 62 63 64 65 66

1      1 
 2    2  
  3  3   
   4    
  5  5   
 6    6  
7      7 

 */

package pattern;

public class pattern12 {

	public static void main(String[] args) {

		int n=7;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==j||j+i==n-1)
				{
				System.out.print((i+1)+" ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
	}

}
