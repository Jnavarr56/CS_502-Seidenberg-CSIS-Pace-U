# Assignment #1

### 1-[20 points] 

Write a program to calculate the area of a circle ( 3.1425 x raduius x radius ).  The program will output the area of the circle based on a radius value initialized in the program.

### 2-[80 points]

Write a program that reads an integer value between 0 and 100 (inclusive), representing the amount of a purchase in cents.  Produce an error message if the input value is not in range.  If the input is valid, determine the amount of change that would be received from one dollar, and print the number of quarters, dimes, nickels, and pennies that should be returned.  Maximize the coins with the highest value.
Follow the format below.


OUTPUT:
	Your change of 64 cents is given as:
	  2 Quarters
	  1 Dimes
	  0 Nickels
	  4 Pennies

HINT:  64 / 25 equals 2, and 64 % 25 equals 14

Use the following lines of code to read an integer from the user.  The Scanner object will be used.
Don't forget to import the java.util.Scanner package. 

```
import java.util.Scanner;

public static void main(String[] args) {

   // Declare a data type Scanner
   
	int number;
	Scanner scan = new Scanner (System.in);

	System.out.println("Input a number: ");
        number = scan.nextInt();

   // .....program logic goes here .....

} // end main
```