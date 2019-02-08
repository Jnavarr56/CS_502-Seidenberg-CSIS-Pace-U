//QUESTION 1

import java.util.Scanner; 

class GetEvenFactorialSum {

  public static boolean isNumeric(String strNum) {

    try {
        double d = Double.parseDouble(strNum);

    } 
    catch (NumberFormatException | NullPointerException nfe) {

        return false;
    }

    return true;

  }

  public static void main(String[] args) {

    String input, bar = "==========================";
    String dismissalText = "\nSee you later!\n\n" + bar;

    System.out.println(bar);

    System.out.println("Enter an integer that is greater or equal to 2");
    System.out.println("and hit enter. I will calculate the sum of all ");
    System.out.println("of the EVEN integers between 2 and that number.");
    System.out.println("");
    System.out.println("You can also type STOP to end this program.");
     
    input = new Scanner(System.in).next();

    if (input.equals("STOP")) { 

      System.out.println(dismissalText);

      return; 
    
    }

    while (!isNumeric(input) || Integer.parseInt(input) < 2) {

      System.out.println("That's not a valid input. Please try again or type STOP to end this program.");

      input = new Scanner(System.in).next();

      if (input.equals("STOP")) { 

        System.out.println(dismissalText);
        
        return; 

      }

    }

    int total = 0, old;

    System.out.println("\nStarting Total: " + total + "\n");

    for(int i = 2; i < Integer.parseInt(input) + 1; i++) {

      if (i % 2 == 0) { 

        old = total;

        total += i; 

        System.out.println("\nAdding: " + i + " to Total: " + old + " for New Total: " + total + "\n");

        
      }

      else {

        System.out.println("(skipping odd number: " + i + ")");

      }

    }

    System.out.println("\n TOTAL SUM: " + total);

    System.out.println(bar);

  }

  
}