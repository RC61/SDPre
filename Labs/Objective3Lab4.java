import java.util.Scanner;

public class Objective3Lab4 {
  public static void main(String[] args) {
    String firstName, lastName;
    int age;

    Scanner input = new Scanner(System.in);

    System.out.print("What is your first name? ");
    firstName = input.next();
    System.out.println("Ok, " + firstName + ". What is your last name?");
    lastName = input.next();
    System.out.println("Interesting. How old are you " + firstName + " " + lastName + "?");
    age = input.nextInt();

    System.out.println( "First Name: " + firstName + ", Last Name: " + lastName + ", Age: " + age);


    input.close();
  }
}
