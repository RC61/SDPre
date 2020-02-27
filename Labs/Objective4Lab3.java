import java.util.Scanner;

public class Objective4Lab3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int userNum;

    System.out.println("Please enter a number: ");
    userNum = scanner.nextInt();

    if( userNum >= 0 ) {
      System.out.println("Positive");
    }
    else {
      System.out.println("Negative");
    }

    scanner.close();
  }
}
