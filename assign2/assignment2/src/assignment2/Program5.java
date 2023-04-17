package assignment2;
import java.util.Scanner;
public class Program5 {
	private String customerName;
	private String phoneNo;
	private int calls;
	private int duration;

	public void setCustomerName(String name) {
		this.customerName = name;
	}

	public void setPhoneNo(String num) {
		this.phoneNo = num;
	}

	public void setCalls(int call) {
		this.calls = call;
	}

	public void setDuration(int dur) {
		this.duration = dur;
	}

	public float calBil() {
		int num = calls;
		float billAmount = 10;

		if (calls < 101) {
			billAmount += (calls * 0.50);
		} else {
			num -= 100;
			billAmount += 50 + num * 0.25;
		}

		return billAmount;
	}

        public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Program5 tell = new Program5();

		System.out.print("Enter the Customer Name: ");
		tell.setCustomerName(sc.nextLine());

		System.out.print("Enter the PhoneNo : ");
		tell.setPhoneNo(sc.nextLine());

		System.out.print("Enter the number of calls: ");
		tell.setCalls(sc.nextInt());

		System.out.print("Enter the Duration of calls: ");                                                   
		tell.setDuration(sc.nextInt());

		System.out.println("Total Bill amount: $" + tell.calBil());
	}

}

