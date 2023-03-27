class Pyramid5
{
	public static void main(String args[])
	{
		
		// Row loop
		for(int i=0; i<9; i++)
		{
			// for Space Triangle
			for(int j=8; j>i; j--)
			{
				System.out.print("  ");
			}
			
			// Triangle 1
			for(int j=9-i; j<=9; j++)
			{
				System.out.print(j+" ");
			}
			
			// Triangle 2
			for(int j=9-i; j<9; j++)
			{
				System.out.print(j+" ");
			}
			
			// for new line
			System.out.println();
		}
	}
}