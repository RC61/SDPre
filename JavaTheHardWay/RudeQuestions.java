import java.util.Scanner;

public class RudeQuestions {
	public static void main( String[] args) {
		String name;
		int age, confused;
		double weight, income;

		Scanner keyboard = new Scanner(System.in);

		System.out.print( "Hello. What is your name? " );
		name = keyboard.next();

		System.out.print( "Hi, "+ name + "! How old are you? " );
		age = keyboard.nextInt();

		System.out.println( "So you're " + age + ", eh? That's not very old. " );
		System.out.print(" How much do you weigh, " + name + "? " );
		weight = keyboard.nextDouble();

		System.out.println( weight + "! Better keep that quiet!!" );
		System.out.print( "OK, what's your income, " + name + "? " );
		income = keyboard.nextDouble();

		System.out.print( "Hopefully that is, " + income + "per hour " );
		System.out.println( " and not per year! " );

		System.out.print( "Last question. How many times will you become confused while studying Java?" );
		confused = keyboard.nextInt();
		System.out.println( "Only " + confused + " times?!? That's not too bad! ");

		System.out.print( "Well, thanks for answering my rude questions, " );
		System.out.println( name + "." );

/*
1) The program functions normally when I enter an integer instead of double
2) The program fucntions normally when I enter a String instead of an int
3) Entering a combination of String & ints stops the program cold
4) new variable is "confused"
*/
	}
}
