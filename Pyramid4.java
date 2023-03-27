class Pyramid4
{
	public static void main(String args[])
	{
		
		// Row loop
		for(int i=1; i<=9; i++)
		{
			// for Space Triangle
			for(int j=9; j>i; j--)
			{
				System.out.print("  ");
			}
			
			// Triangle 1
			for(int j=1; j<=i; j++)
			{
				System.out.print(j+" ");
			}
			
			// Triangle 2
			for(int j=i-1; j>=1; j--)
			{
				System.out.print(j+" ");
			}
			
			// for new line
			System.out.println();
		}
	}
}