import java.util.*;

public class Question1 {

  //This function let's me check if an input is numeric.
  public static boolean isNumeric(String strNum) {

    try {

        double d = Double.parseDouble(strNum);

    } 
    catch (NumberFormatException | NullPointerException nfe) {

        return false;
    }

    return true;

  }

  public static void main(String args[]) {

    String bar = "\n*******************************************************";
    String menuHeader = "\n                        Menu                           ";
    String option1 = "\n1)      Calculate earnings at $10.00/hr";
    String option2 = "\n2)      Calculate earnings at $.10 doubled each hour";
    String option3 = "\n3)      Exit";
    String option4 = "\n4)      View this menu again.";
    String menu = bar + menuHeader + bar + option1 + option2 + option3 + option4;

    Scanner scan = new Scanner(System.in);
    boolean runningProgram = true;
    boolean runningCalculation;
    String hoursWorked;
    double earnings;
    String input; 

    while (runningProgram) {

      runningCalculation = true;

      System.out.println(menu);

      System.out.println("\n\nType your menu selection.\r");

      input = scan.next();

      if (!isNumeric(input)) {

        System.out.println("\n\nThat's even a number!\nRemember, your options are 1-3, found above.\nTry again!\n\n");

      }

      else if (Integer.parseInt(input) > 4 || Integer.parseInt(input) < 1) {

        System.out.println("\n\nThat's not on the menu.\nRemember, your options are 1-3, found above.\nTry again!\n\n");

      }

      else if (
        (Integer.parseInt(input) == 1) ||
        (Integer.parseInt(input) == 2)
      ) {

        while(runningCalculation) {

          System.out.println("How many hours (please enter a number)? You can also enter NEVERMIND to return to the menu.");

          hoursWorked = scan.next();

          if (hoursWorked.equals("NEVERMIND")) {

            runningCalculation = false;

          }

          else if (!isNumeric(hoursWorked)) {

            System.out.println("Invalid, not a number. Please type a number this time.");

          }

          else {

            if (Integer.parseInt(input) == 1) {

              earnings = Double.parseDouble(hoursWorked) * 10;

            }

            else {

              earnings = 0;
              double multiplier = .10;
              int h = 0;

              while (h <  Double.parseDouble(hoursWorked)) {

                earnings += multiplier;

                multiplier *= 2;

                h++;

              }
  
            }

            System.out.printf("\nYou will earn $%.2f", earnings);

            System.out.println("\n\nInformative! Wanna go again " + "(" + "with calculation setting #" + input + ")" + "?");

          }

        }

      }

      else if (Integer.parseInt(input) == 4) {

        continue;

      }

      else {

        System.out.println("\nSee ya later!" + bar);
        runningProgram = false;

      }

    }
    
  }

}