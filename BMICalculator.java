import java.util.Scanner;

/*
 * This program calculates you BMI based on your
 * weight in pounds and height in inches.
 * 
 * @author			Obosa Osagie-Amayo
 * Source File:		BMICalculator.java
 */

public class BMICalculator {

	static Scanner in = new Scanner(System.in);
	static double weight, heightFeet, heightInches, heightCalc, heightTotal,
					bmi;

	public static void main(String[] args) {
		
		System.out.printf("How much do you weigh?\nPounds: ");
		weight = in.nextInt();
		
		System.out.printf("\nHow tall are you?\nFeet: ");
		heightFeet = in.nextInt();
		System.out.print("Inches: ");
		heightInches = in.nextInt();
		
		BMICalculator.bmiCalc();

		System.out.printf(
				"BMI%23s\n" +
				"---	      ------------\n" +
				"<%.1f%20s\n" +
				"%.1f-%.1f%18s\n" +
				"%d-%.1f%17s\n" +
				"%d-%.1f%12s\n" +
				">%d%25s\n",
				"Weight Range", 18.5,
				"Underweight", 18.5, 24.9,
				"Normal Weight", 25, 29.9,
				"Overweight", 30, 39.9,
				"Obese", 40,
				"Morbidly Obese");

	}
	
	static void bmiCalc() {
		
		//Height Conversion
		heightCalc = heightFeet * 12 + heightInches;
		heightTotal = heightCalc * heightCalc;
		
		//BMI Calculation
		bmi = ((weight / heightTotal) * 703);
	
		System.out.printf("\nYour BMI is: %.2f\n", bmi);
		if (bmi > 18.5 && bmi < 25.0)
			System.out.print("You have a healthy BMI!\n\n");
		else
			System.out.print("You have an uhealthy BMI!\n\n");
	}
	
}
