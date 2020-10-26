package pattern1;

public class Pattern01 {

	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<n;i++)
		{
			for(int j=n-1;j>=0;j--)
			{
			if(i==j)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(j);
			}
			}
			System.out.println();
		}
	}

}
