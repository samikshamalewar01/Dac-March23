class Pyramid7
{
	public static void main(String args[])
	{
		
		// Row loop
		for(int i=9; i>=1; i--)
		{
			// for Space Triangle
			for(int j=9-i; j>0; j--)
			{
				System.out.print(" ");
			}
			
			// Column loop
			for(int j=1; j<=i; j++)
			{
				System.out.print(i+" ");
			}
			
			
			// for new line
			System.out.println();
		}
	}
}