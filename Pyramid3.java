class Pyramid3
{
	public static void main(String args[])
	{
		
		// Row loop
		for(int i=1; i<=9; i++)
		{
			// for Space Triangle
			for(int j=9; j>i; j--)
			{
				System.out.print(" ");
			}
			
			// Column loop
			for(int j=1; j<=i; j++)
			{
				System.out.print("* ");
			}
			// for new line
			System.out.println();
		}
	}
}