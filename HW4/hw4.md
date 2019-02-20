# Assignment #4

### 1) [50 points] Write a program that plays the Hi-Lo guessing game with numbers.  The program should pick a random number between 0 and 99 (inclusive), then repeatedly prompt the user to guess the number. On each guess, report to the user that he or she is correct or that the guess is high or low.  Continue accepting guesses until the user guesses correctly or chooses to quit with -1 value.  Count the number of guesses and report that value when the user guesses correctly.  At the end of each game (by quitting or a correct guess), prompt to determine whether the user wants to play again.  Continue playing games until the user chooses to stop (with -1).

```
    import java.util.* ;

   /***  in your progam ***/
     
     Random  myRandomNumber = new Random();
     int myTwoDigitNumber = Math.abs( myRandomNumber.nextInt() % 100 );
```

### 2) [50 points] Design and implement a program that simulates a simple slot machine in which three numbers between 0 and 9 (inclusively) are randomly selected and printed side by side.  Print an appropriate statement if all three of the numbers are the same, or if any of the two numbers are the same.  Continue playing until the user chooses to stop with -1 value.  Prompt the user to play on each iteration for a new set of three numbers.  Value of 1 means play or generate a new set of three numbers or -1 to quit.

```
    import java.util.* ;

   /***  in your progam ***/
     
     Random  myRandomNumber = new Random();
     int myOneDigitNumber = Math.abs( myRandomNumber.nextInt() % 10 );
```
