import java.util.Scanner;

public class BMICategories {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    double m, kg, bmi, lbs, inches, feet, height;

    System.out.print( "Your height in feet: " );
		feet = keyboard.nextDouble();

		System.out.print( "You are " + feet + " feet and how many inches? " );
		inches = keyboard.nextDouble();

		System.out.print( "Your weight in lbs: " );
		lbs = keyboard.nextDouble();

		height = (feet*12) + inches;
/*  USE ME TO CHECK IF HEIGHT CONVERSION IS DONE CORRECTLY
		System.out.print( height );
*/
		bmi = (lbs / (height*height)) * 703; //CDC approved BMI formula

		System.out.println( "Your BMI is " + bmi );

  /*  System.out.print( "Enter your BMI: " );
    bmi = keyboard.nextDouble();
*/
    System.out.print( "BMI category: " );
    if ( bmi < 15.0 ) {
      System.out.println( "very severely underweight" );
    }
    else if ( bmi <= 16.0 ) {
      System.out.println( "severely underweight" );
    }
    else if ( bmi <= 18.5 ) {
      System.out.println( "underweight" );
    }
    else if ( bmi < 25.0 ) {
      System.out.println( "normal weight" );
    }
    else if ( bmi < 30.0 ) {
      System.out.println( "overweight" );
    }
    else if ( bmi < 35.0 ) {
      System.out.println( "moderately obese" );
    }
    else if (bmi < 40.0 ) {
      System.out.println( "severely obese" );
    }
    else {
      System.out.println( "very severely/\"morbidly\" obese" );
    }
  }
}

// Study drill #1 -- I do see how the if statement "breaks rank"
