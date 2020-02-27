import java.util.Scanner;

public class Objective3Lab5 {
  public static void main(String[] args ){
    Double var1, var2;

    Scanner keyboard = new Scanner(System.in);

    System.out.print("Hey you! Yeah you! Type in a number: ");
    var1 = keyboard.nextDouble();
    System.out.print("Actually, I need you to give me another number. Go ahead, plug it in: ");
    var2 = keyboard.nextDouble();

    System.out.println( "The sum of " + var1 + " + " + var2 + " = " + (var1 + var2) );

    keyboard.close();
  }
}
