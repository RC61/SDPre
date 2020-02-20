import java.util.scanner;

public class SecretWord {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		String secret = "please", guess;
		
		System.out.print( "What's the secret word? " );
		guess = keyboard.next();
		
		if ( guess.equals(secret) || guess.equals("shenanigans") {
			Systems.out.println( "That's correct!" );
// wanted to declare and initialize new variable, just plugged in a string instead.
		}
		else {
			System.out.println( "No, the secret word isn't \"" + guess + "\"." );
		}
		if (guess == secret ) {
			System.out.println( "(This will never print, no matter what.)" );
		}                                                                                                                 
	}
}
