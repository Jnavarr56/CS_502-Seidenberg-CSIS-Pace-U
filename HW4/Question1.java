// 1) Let's import with the asterisk so
// we get the Scanner class (to get user keyboard input)
// and the Random class (to generate random numbers).
import java.util.*;

public class Question1 {

    // 2) Here, I define a function that will let me 
    // check if a string is reprentative of a number.
    // How? Attempt to convert the string to a Double
    // and if that produces an error, return false. 
    // If it is sucessful, then return true! 
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

        // 3) DEFINE VARIABLES WE PLAN ON USING------------------------------|
        // 3.A Initialize an integer variable to hold count of guesses, and also one to hold our random numbers.
        int guessesTotal, guessesHigh, guessesLow, randomNumber; 

        // 3.B Initialize a Random class object that we can use over and over again to generate random numbers.
        Random RandomNumberGenerator = new Random();

        // 3.C Initialize a Scanner class object that we can use over and over again to get user keyboard input.
        Scanner scan = new Scanner(System.in);

        // 3.D Create boolean variables that act as switches to control while loops.
        boolean gameProgramRunning = true, currentGameRunning;

        // 3.E Create text strings.
        String gamePrompt = "Hey, welcome to GuessTheNumber!\nI've picked a number between 0 and 99. Take a guess and press enter.\nEnter -1 to quit the current game!\n\n";
        String wrongGuess = "Ah, sorry, wrong guess! You guessed too ";
        String correctGuess = "Woo, good job! You guessed correctly.";
        String goodbye = "Sorry to see you go!\n";
        String bar = "============================\n";

        // 3.F Initialize String variable to hold user input.
        String userInput;

        System.out.println(bar + gamePrompt); //<-- 7) Prompt the user by printing stuff out.

        // 4) DEFINE LOOPS WE PLAN ON USING----------------------------------|
        // 4.A This while loop effectively runs the whole progam. 
        while (gameProgramRunning) {

            currentGameRunning = true; 

            //<-- 5) Set our guesses count to 0. 
            guessesTotal = 0; 
            guessesLow = 0; 
            guessesHigh = 0;

            randomNumber = Math.abs( RandomNumberGenerator.nextInt() % 100 ); //<- 6) Generate a random number for user to guess.

            // 4.B This loop runs the "current game".
            while (currentGameRunning) {

                userInput = scan.next();

                if (userInput.equals("-1")) { // Shut down both loops if the user types in -1.

                    System.out.println("Quitter! To start a new game, type anything but -1 and hit enter to start. Entering -1 will end the entire program.");
                    
                    currentGameRunning = false;

                    userInput = scan.next();

                    if (userInput.equals("-1")) {

                        gameProgramRunning = false;

                    }

                    else {

                        System.out.println("I've generated a new random number between 0 and 99 for you. Same rules as before. Let's go!");

                    }                       
                    
                }

                else if (!isNumeric(userInput)) { // Tell user if they typed in something non numeric.

                    System.out.println("That's not even a number! Guess again and hit enter. You can also enter -1 to quit.");

                }

                else if (Integer.parseInt(userInput) < 0 || Integer.parseInt(userInput) > 99)  { // Tell user if they typed in something out of range.

                    System.out.println("That's out of range!!! Remember, the number is between 0 and 99.  Guess again and hit enter. You can also enter -1 to quit.");

                }

                else  { // Proceed to do further checking if the input is valid.

                    if (Integer.parseInt(userInput) != randomNumber) {

                        guessesTotal ++;

                        if (Integer.parseInt(userInput) <  randomNumber) {

                            System.out.println(wrongGuess + "low.");

                            guessesLow ++;

                        }
                        
                        else {

                            System.out.println(wrongGuess + "high.");

                            guessesHigh ++;
                            
                        }

                        System.out.println("\nGuess again! Or, enter -1 to quit.");

                    }

                    else {

                        guessesTotal ++;

                        System.out.println(correctGuess);

                        System.out.println(
                            "You guessed for a total of " + guessesTotal + (guessesTotal > 1 ? " times. " : " time. " ) 
                            + 
                            guessesHigh + (guessesHigh > 1 ? " times too high, and ": " time too high, and " ) 
                            +
                            guessesLow + (guessesLow > 1 ? " times too low.": " time too low." ) 
                        );

                        System.out.println("\n\nWanna go again? Type anything but -1 and hit enter to go again. Entering -1 will end the program!");

                        userInput = scan.next();

                        if (userInput.equals("-1")) {

                            currentGameRunning = false;
                            gameProgramRunning = false;

                        }

                        else {

                            System.out.println("I've generated a new random number between 0 and 99 for you. Same rules as before. Let's go!");

                            currentGameRunning = false;

                        }

                    }

                }


            }

        }

        System.out.println(goodbye + bar);

    }

}

