package assignment2;

public class Program4 {
	private String consumerName;
	private double unitsConsumed;
	private double billAmount;

	Program4() {
		consumerName = "Samiksha Malewar";
		unitsConsumed = 100;
	}

	// Function to Calculate bill amount
	public void customerBillAmount() {
		double tempUnit = unitsConsumed;
		if (tempUnit < 101) {
			billAmount += tempUnit * 5;
		} else if (tempUnit < 301) {
			tempUnit -= 100;
			billAmount += 500 + tempUnit * 7;
		} else {
			tempUnit -= 300;
			billAmount += 1900 + tempUnit * 10;
		}
	}

	@Override
	public String toString() {
		return "ElectricityBill [consumerName=" + consumerName + ", unitsConsumed=" + unitsConsumed + ", billAmount="
				+ billAmount + "]";
	}

     public static void main(String[] args) {
		Program4 bill = new Program4();
		bill.customerBillAmount();
		System.out.println(bill.toString());

	}

}


