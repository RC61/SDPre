public class Objective6Lab3 {
  public static void main(String[] args ) {
    int counter =1;
    String numType = "";

    while ( counter <= 20 ){

      if ( counter % 2 == 0 ) {
        numType = "Even";
      }
      else if ( counter % 2 == 1 ) {
        numType = "Odd";
      }
      System.out.println( counter + " is " + numType );
      counter += 1;
    }
  }
}
