package assignment2;
import java.util.Scanner;
public class Program2 {
	private double height;
	private double weight;

	public Program2(double height, double weight) {
		this.height = height;
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double calculateBMI() {
		return weight / (height * height);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your height in meters: ");
		double height = sc.nextDouble();
		System.out.print("Enter your weight in kilograms: ");
		double weight = sc.nextDouble();
		Program2 cal = new Program2(height, weight);
		double bmi = cal.calculateBMI();
		System.out.println("Your BMI is " + bmi );
	}
}

