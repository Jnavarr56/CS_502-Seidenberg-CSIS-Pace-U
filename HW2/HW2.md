# Assignment #2



### 1) [40 points] Design and implement an application that reads an integer value and prints out the sum of all EVEN integers between 2 and its input value, inclusive. Print an error message if the input value is less than 2.  Prompt accordingly.

### 2) [60 points] Computers are playing an increasing role in education.  Write a program that will help elementary school children learn multiplication.  Use the Random class in the java.util package to produce two positive one-digit integers.  

##The format to generating this number is as follows:

```
    import java.util.* ;

   /***  in your program ***/
     
     Random  myRandomNumber = new Random();
     int myOneDigitNumber = Math.abs( myRandomNumber.nextInt() % 10 );
```

### The Math class in the java.lang package is also used to convert the number to an absolute value.  The modulus is used to get a single digit number.

### Use this one digit number produced to type the question as follows:

     How much is 6 times 7?

### The student then types the answer.  Your program checks the student's answer.  If it is correct, print "Very Good!" and then ask another multiplication question.  If the answer
### is wrong, print "No.  Please try again." and then let the student try the same question again ### repeatedly until the student finally gets it right.  Enter a -1 to exit program.