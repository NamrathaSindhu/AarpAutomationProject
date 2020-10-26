package pattern1;

public class Pattern04 {

	public static void main(String[] args) {

		int n=5;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=n-i-1;j++)
			{
				System.out.print(j);
			}
			for(int l=0;l<i;l++)
			{
				System.out.print("*");
				System.out.print("*");
			}
			for(int k=n-i-1;k>=0;k--)
			{
			System.out.print(k);
			}
			System.out.println();
		}
	}
}
