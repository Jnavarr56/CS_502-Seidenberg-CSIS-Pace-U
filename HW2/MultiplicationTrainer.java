//QUESTION 2

import java.util.* ;


class MultiplicationTrainer {

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

    System.out.println("Hi, welcome to the multiplcation");
    System.out.println("trainer. I will give you a multiplication");
    System.out.println("question. Type your answer and I will see");
    System.out.println("if you're correct.");
    System.out.println("\n\nEnter anything but STOP to start.");
    System.out.println("You can hit STOP at anytime to quit.");

    String proceed = new Scanner(System.in).next();

    if (proceed.equals("STOP")) {

      System.out.println(dismissalText);

      return;
    }

    boolean endless = true;

    while (endless) { 

      Random  myRandomNumber = new Random();
      int a = Math.abs( myRandomNumber.nextInt() % 10 ), 
          b = Math.abs( myRandomNumber.nextInt() % 10 ),
          ans = a * b;

      System.out.println("\n\nWhat is " + a + " times " + b + "?");

      System.out.println("\nType your answer and hit enter.");

      input = new Scanner(System.in).next();

      while (!isNumeric(input) || Integer.parseInt(input) != ans) {

        if (input.equals("STOP")) {

          System.out.println(dismissalText);

          return;
        }

        else if (!isNumeric(input)) {

          System.out.println("That's not a number! Try again or hit STOP to quit.");

        }

        else if (Integer.parseInt(input) != ans) {

          System.out.println("No, please try again.");

        }

        input = new Scanner(System.in).next();
      }


      System.out.println("\nVery good!\n");

      System.out.println("Enter anything to go again or STOP to quit.");

      input = new Scanner(System.in).next();

      if (input.equals("STOP")) {

        System.out.println(dismissalText);

        endless = false;

      }

    }


    System.out.println(bar);

  }
}