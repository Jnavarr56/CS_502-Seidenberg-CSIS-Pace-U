package timeTest;

import militaryTime.*;
import java.util.*;
import java.io.*;

public class Test {

    private static ArrayList<Test> ALL_TESTS = new ArrayList<Test>();
    private static int idCount = 0;
    public static final String COMPARISON_STR_FORMAT = new String(
        "\n\t* Results:" +
        "\n\t--------------------------" +
        "\n\tExpected Output: %s" +
        "\n\tActual Output: %s" +
        "\n\tPassed?: %s"

    );
    private static final int DELAY = 1000;

    public final int id = ++ idCount; 

    private Time time;
    private TestData testData;

    private String createdAt = (new Date()).toString();
    private String runAt;

    private boolean status;
    
    
    private String resultsStr;
    private static String testStr = "";



    public Test() {  ALL_TESTS.add(this); }

    public void run() {

        runAt = (new Date()).toString();

        testStr += "\n" + testData.getTestHeaderAndPrint();
        testStr += "\n" + testData.getTestFormattedInputAndPrint();
        testStr += "\n" + time.tickMultipleTimesAndPrint(

            time.test().testData().getTestNumTicks(), 
            time.test().testData().getGridRowLen()

        );

        status = performEvaluationAndPrint(true);

        testStr += "\n" + resultsStr;
        testStr += ("\n\tRun at: " + runAt);
        testStr += "\n" + time.test().testData().getTestFooterAndPrint();

        delay(DELAY);

    }

    private static void delay(int delay) {

        try { Thread.sleep(delay); } 

        catch (Exception e) { System.out.println(e); }

    }

    private boolean performEvaluationAndPrint(boolean shouldPrint) {

        String expected = testData.getExpectedOutput();
        String actual = time.returnTime();

        boolean status = actual.equals(expected);

        String results = String.format(

            COMPARISON_STR_FORMAT,

            expected,
            actual,
            Boolean.toString(status).toUpperCase()

        ); 

        resultsStr = results;

        if (shouldPrint) {

            System.out.println(results);

        }
                    
        return status;

    }

    public String getTestStr()  { return testStr; }

    private static void generatePeriods(int period, int delay) {

        int i = 0;

        while (i < period) {

            System.out.print(".");

            delay(delay);

            i ++;

        }

        System.out.println("\n");

    }

    public static void writeResults(String filename)  {

        filename = "./results_logs/" + filename + " - results.txt";

        try  {

            File directory = new File("./results_logs/");

            if (!directory.exists()){ directory.mkdir(); }

            FileWriter fileWriter = new FileWriter(filename);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.print(testStr);
            printWriter.close();

            System.out.print("\nwriting to file");
            generatePeriods(100, 20);
            System.out.println("* Done writing results to \"" + filename + "\"!\n");

        }

        catch(IOException e) {

            System.out.println(e);

        }

    }

    public static String writeOption()  { 

        boolean validSelection = false, invalidInput = false;
        String filename;
        char menuSelection;

        Scanner scan = new Scanner(System.in);

        System.out.print("* Would you like to write these results to a text file? [Yy/Nn]: ");

        while (!validSelection) {

            if (invalidInput) {

                System.out.print("\nInvalid input! Must be [Yy/Nn]: ");

            }

            menuSelection = scan.next().charAt(0);

            if (
                (Character.toLowerCase(menuSelection)  == 'y')
                ||
                (Character.toLowerCase(menuSelection)  == 'n')
            ) {

                invalidInput = false;
                validSelection = true;

                if (Character.toLowerCase(menuSelection)  == 'y') {

                    System.out.print("\nEnter your txt filename without the extension (will overwrite if already exists or create if it doesn't): ");

                    filename = scan.next();
    
                    writeResults(filename);

                }

                else {

                    System.out.println("* Returning to Options Screen");

                }



            }

            else { invalidInput = true; }

        }
        
        return testStr; 
    }

    public static ArrayList<Test> allTests() { return ALL_TESTS; }

    public void attachTestData(TestData testData) { this.testData = testData; }

    public TestData testData() { return testData; }
    
    public void attachToTime(Time time) { this.time = time; } 

    public Time belongsToTime() { return time; }

}