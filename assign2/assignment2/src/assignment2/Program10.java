package assignment2;

public class Program10 {
	private int creditHistory;
	private double creditUtilization;
	private boolean paymentHistory;
	private double creditScore;
	
	public Program10() {
		this.creditHistory= 10;
		this.creditUtilization= 32;
		this.paymentHistory=true;
	}
	
	public void findCreditScore()
	{
		if(paymentHistory==true)
		{
			creditScore = (creditHistory * 15) + (int)(creditUtilization * 30) + 55;
		}
		else {
			creditScore = (creditHistory * 15) + (int)(creditUtilization * 30) + 35;
		}
		
		System.out.println("Your Credit Score: " + creditScore);
	}


	public static void main(String[] args) {
		Program10 credit = new Program10();
		credit.findCreditScore();
	}
}

