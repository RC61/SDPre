import java.util.Scanner;

public class SafeSquareRoot {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    double x, y;
    String ready, answer;

    answer = "YES";




    System.out.print("Are you ready?!?");
    ready = keyboard.next();
    while( !answer.equals(ready)) {
      System.out.println("Yeah that isn't the answer i'm looking for.");
      System.out.print("\nOK, let's try again. Are you ready?!");
      ready = keyboard.next();
    }

    System.out.println("Great to hear that! Let's get started.");

    System.out.print("Give me a number, and I'll find it's square root.");
    System.out.print("(No negatives, please.) ");
    x = keyboard.nextDouble();

    while ( x < 0 ) {
      System.out.println("I won't take the square root of a negative.");
      System.out.print("\nNew number: ");
      x = keyboard.nextDouble();
    }

    y = Math.sqrt(x);

    System.out.println("The square root of "+x+" is "+y);
  }
}
