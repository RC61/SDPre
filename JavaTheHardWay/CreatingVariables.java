public class CreatingVariables {
	public static void main( String[] args ) {
		int x, y, age, extraInt;
		double seconds, e, checking, extraDouble;
		String firstName, lastName, title, extraString1, extraString2;

		x = 10;
		y = 400;
		age = 39;
    extraInt = 1;

		seconds = 4.71;
		e = 2.7182818184523536;
		checking = 1.89;
    extraDouble = 1.12;

		firstName = "Graham";
		lastName = "Mitchell";
		title = "Mr.";
    extraString1 = "Ello";
    extraString2 = "Gov'na";

		System.out.println( "The variable x contains " + x );
		System.out.println( "The value " + y + " is stored in the variable y." );
		System.out.println( "The experiment took " + seconds + "seconds." );
		System.out.println( "A favorite irrational # is Euler's number:" + e );
		System.out.println( "Hopefully you have more than $" + checking + "!" );
		System.out.println( "My name's " + title + " " + firstName + lastName );
    System.out.println( "Here are two extra variables, " + extraInt + "&" + extraDouble );
    System.out.println( "Here are the other two, " + extraString1 + " " + extraString2 );
	}
}
