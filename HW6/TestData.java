package timeTest;

public class TestData {
    
    private int[] testInput;
    private String testExpectedOutput;

    private int testHour;
    private int testMinute;
    private int testSecond;
    private int testNumTicks;

    private int testNumber;
    private int displayRowLength;
    private String testHeader;
    private String testFooter;
    private String testFormattedInput;

    private static final String TEST_HEADER_FORMAT = new String(

        "=============== TEST NUMBER: %d ==============="
        
    );
    private static final String INPUT_STRING_FORMAT = new String(

        "\n\tInput Data:" +
        "\n\t--------------------------" + 
        "\n\t  - Hour = %d" + 
        "\n\t  - Minute = %d" +
        "\n\t  - Second = %d" +
        "\n\t  - Start Time: %s" +
        "\n\t  - Number of Ticks: %s" +
        "\n\t  - Expected Output: %s"
        
    );
    private static final String TIME_STRING_FORMAT = "%d:%d:%d";



    public TestData(int[] testInput, String testExpectedOutput) {

        this.testInput = testInput;
        this.testExpectedOutput = testExpectedOutput;

        setTestInputNumsFromArr(testInput);
        setTestFormattedInputFromSelf();

    }

    private void setTestFormattedInputFromSelf() {
        
        testFormattedInput = String.format(

            INPUT_STRING_FORMAT,

            testHour,
            testMinute, 
            testSecond,
            buildTimeString(),
            testNumTicks + " secs",
            testExpectedOutput
        
        );

    }

    private void setTestInputNumsFromArr(int[] testInput) {

        testHour = testInput[0];
        testMinute = testInput[1];
        testSecond = testInput[2];
        testNumTicks = testInput[3];
        displayRowLength = testInput[4];

    }

    public void setTestNumberHeaderFooter(int testNumber) {  
        
        this.testNumber = testNumber; 

        testHeader = String.format(TEST_HEADER_FORMAT,  ++this.testNumber);

        testFooter = "\n" + "=".repeat(testHeader.length());
    
    }

    public int getTestHour() { return testHour; }

    public int getTestMinute() { return testMinute; }

    public int getTestSecond() { return testSecond; }

    public int getTestNumTicks() { return testNumTicks; }

    public int getDisplayRowLength() { return displayRowLength; }

    public String getExpectedOutput() { return testExpectedOutput; }

    public void printTestHeader() { System.out.println(testHeader); }

    public void printTestFooter() { System.out.println(testFooter); }

    public void printTestFormattedInput() { System.out.println(testFormattedInput); }

    private String buildTimeString() { 
        
        return String.format(
            
            TIME_STRING_FORMAT, 

            testHour, 
            testMinute, 
            testSecond

        ); 
            
    }

}