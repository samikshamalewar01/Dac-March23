class Star13
{
	public static void main(String args[])
	{
		// Row loop 1
		for(int i=5; i>=1; i--)
		{
			
			// Space Triangle
			for(int j=5; j>i; j--)
			{
				System.out.print(" ");
				
				
			}
			
			
			// Triangle 1
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
				
				
			}
			
			
			
			// for new line
			System.out.println();
			
		}
		
		// Row loop 2
		for(int i=2; i<=5; i++)
		{
			
			// Space Triangle
			for(int j=4; j>=i; j--)
			{
				System.out.print(" ");
				
				
			}

			// Triangle 1
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
				
				
			}
			
			
			
			// for new line
			System.out.println();
			
		}
	}
}