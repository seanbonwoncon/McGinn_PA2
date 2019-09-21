package mcGinn_p2;
import java.util.Scanner;

public class assignment2_problem2_BMI {
	public static void main(String[] args) {
	Scanner scnr = new Scanner(System.in);
	
	double weight;
	double height;
	double bmi = 0;
	int formula;
	
	System.out.println("please type \"1\" to use pounds and inches or type \"2\" to use Kilograms and meters: ");
	formula = scnr.nextInt();
	
		if (formula == 1) {
			
			System.out.println("please enter hieght in inches: ");
			height = scnr.nextInt();

			System.out.println("please enter weight in pounds: ");
			weight = scnr.nextInt();
			
			bmi = (703 * weight) / (height * height);
		}
		
		if (formula == 2) {
			
			System.out.println("please enter hieght in meters: ");
			height = scnr.nextInt();

			System.out.println("please enter weight in Kilograms: ");
			weight = scnr.nextInt();
			
			bmi = weight / (height * height);	
		}
		
	System.out.println("Your BMI is " + bmi);
	System.out.println("");
	System.out.println("BMI Categories:");
	System.out.println("Underweight = <18.5");
	System.out.println("Normal weight = 18.5–24.9");
	System.out.println("Overweight = 25–29.9 ");
	System.out.println("Obesity = BMI of 30 or greater");
	}
}
