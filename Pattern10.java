class Pattern10
{
    public static void main(String args[])
	{
	   for(int i=0;i<5;i++)
	   {
	   char ch = 'E';
	   ch = (char)(ch-i);
	        for(int j=5;j>i;j--)
			{ 
			   System.out.print(" ");
			}
			for(int j=5-i; j<=5; j++)
			{
				System.out.print(ch+" ");
				ch++;
			}
		
			System.out.println();
		}
	}
}	
	    