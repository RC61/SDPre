import java.util.Scanner;

public class Objective3Lab3 {
  public static void main(String[] args) {
    int birthYear, age, currentYear;

    birthYear = 0;

    Scanner input = new Scanner(System.in);
    System.out.println("How old are you?");

    age = input.nextInt();

    currentYear = 2020;

    birthYear = currentYear - age ;

    System.out.println("You were *probably* born in " + birthYear);
    input.close();

// This program isn't very accurate, I want to revist later.

  }
}
