import java.util.*;

public class Question2 {

    public static double method1(int hours) {

        return hours * 10;

    }

    public static double method2(int hours) {

        double earnings = 0, multiplier = .10;
        int h = 0;

        while (h < hours) {

          earnings += multiplier;

          multiplier *= 2;

          h++;

        }

        return earnings;

    }

    public static void main(String args[]) {


        double method1Earnings = 0, method2Earnings = 0;
        String cellSpace1, cellSpace2, cellSpace3, cellSpace4;
        String formattedVal1, formattedVal2;
        int hour = 0;


        System.out.println("Hour:   |     method 1:    |   method2:");
        System.out.println("=======================================");

        
        //method1Earnings > method2Earnings7
        while(method2Earnings <= method1Earnings) {

            method1Earnings = method1(hour);
            method2Earnings = method2(hour);

            formattedVal1 = String.format("$%.2f", method1Earnings);
            formattedVal2 = String.format("$%.2f", method2Earnings);

            cellSpace1 = " ".repeat(7 - Integer.toString(hour).length());
            cellSpace2 = " ".repeat((18 - formattedVal1.length())/2);
            cellSpace3 = ((cellSpace1.length() * 2) +  formattedVal1.length()) != 18 ? cellSpace2 +  " " : cellSpace2;
            cellSpace4 = " ".repeat(11 - formattedVal2.length());

            formattedVal1 = cellSpace2 + formattedVal1 + cellSpace3;
            formattedVal2 = cellSpace4 + formattedVal2;

            System.out.printf("%d %s|%s|%s\n---------------------------------------\n", 
                hour, cellSpace1, 
                formattedVal1, 
                formattedVal2
            );

            hour++;
    
        }

        System.out.printf("\nAT HOUR %d METHOD 2 IS MORE PROFITABLE THAN METHOD 1.\n", hour - 1);
        System.out.printf("\nIT IS MORE PROFITABLE BY $%.2f\n\n\n\n", method2Earnings - method1Earnings);

    }
}


