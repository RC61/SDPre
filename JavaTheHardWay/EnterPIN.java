import java.util.Scanner;

public class EnterPIN {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    int pin, entry;
    String typedPassword, entry2;

    pin = 12345;
    typedPassword = "DUMBpassword";

    System.out.println("WELCOME TO THE BANK OF JAVA");

    System.out.println("ENTER YOUR PASSWORD: ");
    entry2 = keyboard.next();

    while ( !entry2.equals(typedPassword)) {
      System.out.println("/nINCORRECT PASSWORD. TRY AGAIN.");
      System.out.print("ENTER YOUR PASSWORD: ");
    }

    System.out.println("\nPASSWORD ACCEPTED.");


    System.out.print("ENTER YOUR PIN: ");
    entry = keyboard.nextInt();

    while ( entry != pin ) {
      System.out.println("\nINCORRECT PIN. TRY AGAIN.");
      System.out.print("ENTER YOUR PIN: ");
      entry = keyboard.nextInt();
    }

    System.out.println("\nPIN ACCEPTED. YOUR ACCOUNT BALANCE IS 425.17");
  }
}
