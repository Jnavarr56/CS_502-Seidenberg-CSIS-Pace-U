import java.io.*; 
import java.util.*;
import java.nio.file.*;

import time.Time;
import test.TestData;

public class Main {

    public static void main(String args[]) {

        System.out.print("\nloading Jorge's Homework 6");
        generateLoadingChar(100, 20, '.');

        System.out.println(
            "=========================================" + "\n" +
            " Hey, Welcome to the Time Object Tester!" + "\n" +
            "-----------------------------------------" + "\n\n" +
            "This program uses the dataset.txt file" + "\n" +
            "in this directory as a dataset to run" + "\n" +
            "tests for the Time.java class. You can" + "\n" +
            "look in dataset.txt for the format to" + "\n" +
            "add or remove test data rows of your own!" + "\n\n" +
            "The TestData class is used to group" + "\n" +
            "together data from the rows in a single" + "\n" + 
            "object that is easy to access:" + "\n" +
            "  * hour\n" +
            "  * minute\n" +
            "  * second\n" +
            "  * number of ticks to run in the test\n" +
            "  * expected output string (format hh:mm:ss)\n\n" +
            "The results will be printed to the" + "\n" +
            "command line and writted to a results.txt" + "\n" +
            "file in this directory."
        );

        String confirmation;
        boolean validInput = false;
        Scanner scan = new Scanner(System.in);

        while (!validInput) {

            System.out.print("\nReady? [Yy/Nn]: ");

            confirmation = scan.next();

            validInput = confirmation.equals("y") || confirmation.equals("n") ? true : false;

            if ( confirmation.equals("y") )  {

                runTests();

            }

            else if ( confirmation.equals("n") ) {

                System.out.println(
                    "\nBye!\n"+
                    "=========================================" + "\n"
                );

            }

        }

    }

    private static void runTests() {

        System.out.print("\nloading test data");
        generateLoadingChar(100, 20, '.');

        TestData testDataObj;
        Time timeObj;
        
        ArrayList<String> validLines = new ArrayList<>();
 
        try ( Scanner scan = new Scanner(new FileReader("dataset.txt")) ) {

            String line;
            String output = generateTableHeader();
            String row;

            System.out.println(output);
            
            int testNum = 1;

            while (scan.hasNext()) {

                line = scan.nextLine();

                if ( !(line.length() == 0 || line.charAt(0) == '#') ) {

                    testDataObj = new TestData(line);

                    timeObj = new Time(
                        testDataObj.getTestHr(), 
                        testDataObj.getTestMin(), 
                        testDataObj.getTestSec()
                    );

                    int tickNum = 0;

                    while (tickNum < testDataObj.getNumTestTicks()) {

                        timeObj.tick();

                        tickNum++;

                    }

                    row = generateRow(testNum, testDataObj, timeObj);

                    delay(250);
                    System.out.println(row);

                    output += row;

                    testNum++;

                }

            }

        }

        catch(FileNotFoundException e) {

            System.out.println(e);

        }

        System.out.println(
            "\nDone!\n"+
            "=========================================" + "\n"
        );

    }

    private static void delay(int delay) {

        try { Thread.sleep(delay); } 

        catch (Exception e) { System.out.println(e); }

    }

    private static void generateLoadingChar(int num, int delay, char type) {

        int i = 0;

        while (i < num) {

            System.out.print(type);

            delay(delay);

            i ++;

        }

        System.out.println("\n");

    }

    private static String generateTableHeader() {

        String title =    "\n|================================================TESTS================================================|\n";
        String header1 =    "|       |        Inputs        |                                     |                    |           |\n";
        String bar1 =       "|-------|------|-------|-------|-------------------|-----------------|--------------------|-----------|\n";
        String header2 =    "|   #   |  Hr  |  Min  |  Sec  |  Formatted Input  | # Ticks to Test |  Expected Outcome  |  Passed?  |";

        return title + header1 + bar1 + header2;

    }

    private static String generateRow(int testNum, TestData testDataObj, Time timeObj) {

        String rowFormat =  "|  %02d   |  %02d  |   %02d  |  %02d   |      %s     |    %02d secs      |      %s      |   %B    |";
        String bar =       "|-------|------|-------|-------|-------------------|-----------------|--------------------|-----------|";

        rowFormat = bar + "\n" + rowFormat;

        return String.format(
            rowFormat,
            testNum,
            testDataObj.getTestHr(),
            testDataObj.getTestMin(),
            testDataObj.getTestSec(),
            testDataObj.getFormattedInputStr(),
            testDataObj.getNumTestTicks(),
            testDataObj.getExpectedOutputStr(),
            testDataObj.getExpectedOutputStr().equals(timeObj.getTime())
        );

    }


}


