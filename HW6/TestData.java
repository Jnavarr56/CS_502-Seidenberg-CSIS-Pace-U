package timeTest;

import java.util.ArrayList;

public class TestData {

    private static ArrayList<TestData> ALL_TESTDATA = new ArrayList<TestData>();
    private static int idCount = 0;
    public static final String TEST_HEADER_FORMAT = new String(

        "=============== TEST NUMBER: %d ==============="
        
    );
    public static final String INPUT_STRING_FORMAT = new String(

        "\n\t* Input Data:" +
        "\n\t--------------------------" + 
        "\n\t  - Hour = %d" + 
        "\n\t  - Minute = %d" +
        "\n\t  - Second = %d" +
        "\n\t  - Start Time: %s" +
        "\n\t  - Number of Ticks: %s" +
        "\n\t  - Expected Output: %s"
        
    );
    public static final String TIME_STRING_FORMAT = "%d:%d:%d";

    public static final TestData[] testDataset = { 

        new TestData(new int[] {6, 50, 0, 60, 10}, "06:51:00"),
        new TestData(new int[] {0, 55, 10, 60, 10}, "00:56:10"),
        new TestData(new int[] {12, 59, 53, 60, 10}, "13:00:53"),
        new TestData(new int[] {23, 59, 30, 60, 10}, "00:00:30"),
        new TestData(new int[] {2, 01, 22, 60, 10}, "02:02:22"),
    
    };

    public final int id = ++ idCount;

    private Test test;

    private int[] testInput;
    private String testExpectedOutput;

    private int testHr;
    private int testMin;
    private int testSec;
    private int testNumTicks;

    private int gridRowLen;
    private String testHeader;
    private String testFooter;
    private String testFormattedInput;
    private String timeStr;

    public TestData(int[] testInput, String testExpectedOutput) {

        this.testInput = testInput;
        this.testExpectedOutput = testExpectedOutput;

        testHr = testInput[0];
        testMin = testInput[1];
        testSec = testInput[2];
        testNumTicks = testInput[3];
        gridRowLen = testInput[4];

        timeStr = String.format(
            
            TIME_STRING_FORMAT, 

            testHr, 
            testMin, 
            testSec

        ); 

        testFormattedInput = String.format(

            INPUT_STRING_FORMAT,

            testHr,
            testMin, 
            testSec,
            timeStr,
            testNumTicks + " secs",
            testExpectedOutput
        
        );

        testHeader = String.format(TEST_HEADER_FORMAT,  id);
        testFooter = "\n" + "=".repeat(testHeader.length());

        ALL_TESTDATA.add(this);

    }

    public int getTestHr() { return testHr; }

    public int getTestMin() { return testMin; }

    public int getTestSec() { return testSec; }

    public int getTestNumTicks() { return testNumTicks; }

    public String getExpectedOutput() { return testExpectedOutput; }

    public int getGridRowLen() { return gridRowLen; }

    public String getTestHeaderAndPrint() { 

        System.out.println(testHeader);

        return testHeader;
    
    }

    public String getTestFooterAndPrint() { 

        System.out.println(testFooter);

        return testFooter;
    
    }

    public String getTestFormattedInputAndPrint() { 

        System.out.println(testFormattedInput);
        
        return testFormattedInput; 

    }

    public static ArrayList<TestData> allTestData() { return ALL_TESTDATA; }

    public void attachToTest(Test test) { this.test = test; }

    public Test belongsToTest(Test test) { return test; }

    public static String generateDefaultTestDataTable() { 

        String title =      "\n=======================TEST DATASET=====================\n";
        String header1 =    "|          |        Inputs        |                    |\n";
        String bar1 =       "|----------|----------------------|--------------------|\n";
        String header2 =    "|    ID    |  Hr  |  Min  |  Sec  |  Expected Outcome  |\n";
        String bar2 =       "|----------|------|-------|-------|--------------------|\n";
        String rowFormat =  "|  %02d      |  %02d  |   %02d  |  %02d   |      %s      |\n";
        String table = title + header1 + bar1 + header2 + bar2;

        for (TestData row : testDataset) {

            table += String.format(
                
                rowFormat, 
                
                row.id, 
                row.getTestHr(),
                row.getTestMin(),
                row.getTestSec(),
                row.getExpectedOutput()

            );

        }

        table +=  "========================================================\n\n";

        return table;
    
    }

}