//Import scanner to get input from user.
import java.util.Scanner; 


class CalculateChange {

  public static void main(String[] args) {

    System.out.println("==================================");

    System.out.println("Hi, I'll give you the exact change"); 
    System.out.println("you need after paying a dollar to"); 
    System.out.println("to an item with a price that you "); 
    System.out.println("that you enter in cents."); 

    System.out.println("");
    System.out.println("");

    System.out.println("The maximum can be 100 and the ");
    System.out.println("minimum is 0.");

    System.out.println("");
    System.out.println("");

    //Going to hold cost as a string so that we can detect
    //if user wants to end program.
    String cost;

    System.out.println("Type the cost and hit enter.");

    //Use .next() instead of .nextInt() since we want a string.
    cost = new Scanner(System.in).next();

    //Using Integer.parseInt() to convert string to a numeric value we can
    //do some math with.

    if (Integer.parseInt(cost) == 100) {

      System.out.println("No change for you!");

    }

    //Keep feeding user the prompt if number is not in range.

    while (Integer.parseInt(cost) < 0 || Integer.parseInt(cost) > 100) {

      System.out.println("Sorry, that not in range.");
      System.out.println("Please type the cost again or");
      System.out.println("or enter STOP to quit.");

      cost = new Scanner(System.in).next();

      if (cost.equals("STOP")) { 

        return; //<-- Kill program if user types STOP.

      }

    }

    System.out.println("");

    System.out.println("calculating.....");

    System.out.println("");

    int leftover = Integer.parseInt(cost);

    if (leftover >= 25) {

      int numQuarters = leftover / 25;

      System.out.println(String.format("%d Quarters", numQuarters));

      leftover = leftover - (numQuarters * 25);

    }

    if (leftover >= 10) {

      int numDimes = leftover / 10;

      System.out.println(String.format("%d Dimes", numDimes));

      leftover = leftover - (numDimes * 10);

    }

    if (leftover >= 5) {

      int numNickels = leftover / 5;

      System.out.println(String.format("%d Nickels", numNickels));

      leftover = leftover - (numNickels * 5);

    }

    if (leftover >= 1) {

      int numPennies = leftover / 1;

      System.out.println(String.format("%d Pennies", numPennies));

      leftover = leftover - (numPennies * 1);

    }

    System.out.println("");

    System.out.println("Done!");

    System.out.println("");

    System.out.println("==================================");

  }
}



