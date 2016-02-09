import java.util.Scanner;

/*
 * This program calculates you BMI based on your
 * weight in pounds and height in inches.
 * 
 * @author		Obosa Osagie-Amayo
 * Source File:		BMICalculator.java
 */

public class BMICalculator {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int weight, heightFeet, heightInches, heightTotal;
		double height2, bmi;
		
		System.out.printf("How much do you weigh?\n%s", "Pounds: ");
		weight = in.nextInt();
		
		System.out.printf("\nHow tall are you?\n%s", "Feet: ");
		heightFeet = in.nextInt();
		System.out.print("Inches: ");
		heightInches = in.nextInt();
		heightTotal = (heightFeet * 12 + heightInches);
		height2 = (heightTotal * heightTotal);

		// BMI calculation
		bmi = ((weight / height2) * 703);
		System.out.printf("\nYour BMI is: %.2f\n", bmi);

		if (bmi > 18.5 && bmi < 25.0) {
			System.out.print("You have a healthy BMI!\n\n");
		} else {
			System.out.print("You have an uhealthy BMI!\n\n");
		}
		
		System.out.printf("BMI%23s\n<%.1f%20s\n%.1f-%.1f%18s\n%d-%.1f%17s\n"
				+ "%d-%.1f%12s\n>%d%25s\n","Weight Range", 18.5,
				"Underweight", 18.5, 24.9, "Normal Weight", 25, 29.9,
				"Overweight", 30, 39.9, "Obese", 40, "Morbidly Obese");
		
		in.close();
		
	}
	
}
