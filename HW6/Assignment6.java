import timeTest.*;
import militaryTime.*;

class Main {
    public static void main(String args[]) {

        Time timeObj;
        TestData currentTestObj;

        TestData[] testDataset = { 
            
            new TestData(new int[] {4, 20, 0, 60, 10}, "04:21:00"),
            new TestData(new int[] {6, 50, 0, 60, 10}, "06:51:00"),
            new TestData(new int[] {0, 55, 10, 60, 10}, "00:56:10"),
            new TestData(new int[] {12, 59, 53, 60, 10}, "13:00:53"),
            new TestData(new int[] {23, 59, 30, 60, 10}, "00:00:30"),
            new TestData(new int[] {2, 01, 22, 60, 10}, "02:02:22"),
        
        };
        
        int testNumber = 0;

        while (testNumber < testDataset.length) {

            currentTestObj = testDataset[testNumber];

            currentTestObj.setTestNumberHeaderFooter(testNumber);

            currentTestObj.printTestHeader();
            currentTestObj.printTestFormattedInput();


            timeObj = new Time(

                currentTestObj.getTestHour(), 
                currentTestObj.getTestMinute(), 
                currentTestObj.getTestSecond()
                
            );

            timeObj.tickMultipleTimesAndPrint(

                currentTestObj.getTestNumTicks(), 
                currentTestObj.getDisplayRowLength()

            );

            printInputExpectedComparison(
                timeObj, 
                currentTestObj.getExpectedOutput()
            );

            currentTestObj.printTestFooter();

            delay(1000);

            testNumber ++;

        }

    } 

    private static void delay(int delay) {

        try { Thread.sleep(delay); } 
        catch (Exception e) { System.out.println(e); }

    }

    private static void printInputExpectedComparison(Time timeObj, String expectedOutcome) {

        String timeFromObj = timeObj.returnTime(), comparisonStr;
        
        comparisonStr = String.format(

            "\n\tExpected Output: %s" +
            "\n\tActual Output: %s" +
            "\n\tPassed?: %s",

            expectedOutcome,
            timeFromObj,
            (expectedOutcome.equals(timeFromObj) ? "TRUE" : "FALSE")
        
        );

        System.out.println(comparisonStr);

    }

}