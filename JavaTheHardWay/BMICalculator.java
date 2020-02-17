import java.util.Scanner;

public class BMICalculator {
	public static void main( String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double m, kg, bmi, lbs, inches, feet, height; //added lbs and inch


		System.out.print( "Your height in feet: " );
		feet = keyboard.nextDouble();

		System.out.print( "You are " + feet + " feet and how many inches? " );
		inches = keyboard.nextDouble();

		System.out.print( "Your weight in lbs: " );
		lbs = keyboard.nextDouble();

		height = (feet*12) + inches;
/*
		System.out.print( height );
*/
		bmi = (lbs / (height*height)) * 703; //CDC approved BMI formula

		System.out.println( "Your BMI is " + bmi );


	}
}
