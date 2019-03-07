import java.util.*;
import timeTest.*;
import militaryTime.*;

class Main {
    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);

        boolean validMenuSelection = false;
        char menuSelection;
        

        System.out.println(
            "=======================================" +
            "\nHey, Welcome to the Time Object Tester!\n" +
            "---------------------------------------" +
            "\n\n* This program consists of 4 classes:\n" +
            "*****************************************\n" +
            "    1) Main.java (just the main program class)\n" +
            "    2) TestData.java (to hold the input data for tests, belongs to the Test.java class.)\n" +
            "    3) Test.java (to join the TestData and Time classes.)\n" +
            "    4) Time.java (the time object itself.)\n\n"
            
        );

        while (!validMenuSelection)  {

            System.out.println(
                "* Your options: \n" +
                "*****************************************\n" +
                "    A: Run tests using the default dataset (found in TestData.java)\n" +
                "    B: View the default dataset.\n" +
                "    C: Run your own test, with the option to add it to the default dataset.\n" +
                "    C: View the test log.\n" +
                "    D: Write the test log to a text file.\n" +
                "    E: Quit.\n"
            );
            
            menuSelection = scan.next().charAt(0);

            if ( 
                (Character.toLowerCase(menuSelection)  == 'a')
                ||
                (Character.toLowerCase(menuSelection)  == 'b')
                ||
                (Character.toLowerCase(menuSelection)  == 'c')
                ||
                (Character.toLowerCase(menuSelection)  == 'd')
                ||
                (Character.toLowerCase(menuSelection) == 'e')
                ||
                (Character.toLowerCase(menuSelection) == 'e')
                ||
                (Character.toLowerCase(menuSelection) == 'g')
            ) {

                validMenuSelection = true;

                if (Character.toLowerCase(menuSelection) == 'a') {

                    runDefaultTests();

                    validMenuSelection = false;

                }

                else if (Character.toLowerCase(menuSelection) == 'e') {

                    System.out.println(
                        "---------------------------------------\n" +
                        "Bye, see you later!\n" +
                        "=======================================\n"
                    );

                }

            }

            else { 
                
                System.out.println(
                    
                     "\n " + Character.toString(menuSelection) +
                     " is Invalid Input!\n------------------"
                    
                ); 
            }
        


        }


    }
    
    public static void runTest(TestData testData) {

        Time time;
        Test test;

        test = new Test();
        test.attachTestData(testData);
        

        time = new Time(
            test.testData().getTestHr(), 
            test.testData().getTestMin(), 
            test.testData().getTestSec()
        );
        time.attachTest(test);
           
        time.test().run();

    }

    public static void runTestLoop(boolean test) {

        int testNumber = 0;

        if (test) {
            
            TestData[] testDataset = TestData.testDataset;

            while (testNumber < testDataset.length) {
    
                runTest(testDataset[testNumber]);
    
                testNumber ++;
    
            }

        }
        else {

            TestData[] testDataset = { new TestData(new int[] {3, 50, 0, 60, 10}, "03:51:00") };

            while (testNumber < testDataset.length) {
    
                runTest(testDataset[testNumber]);
    
                testNumber ++;
    
            }

        }

        System.out.println("* Done!");

        Test.writeOption();

    }

    private static void delay(int delay) {

        try { Thread.sleep(delay); } 

        catch (Exception e) { System.out.println(e); }

    }

    private static void generatePeriods(int period, int delay) {

        int i = 0;

        while (i < period) {

            System.out.print(".");

            delay(delay);

            i ++;

        }

        System.out.println("\n");

    }

    private static void runDefaultTests() {

        System.out.print("\npreparing default tests");

        generatePeriods(100, 20);

        runTestLoop(true);

    }

}