import militaryTime.Time;

class Main {

    public static void main(String args[]) {

        Time testTimeObj;
        int t = 0, i;

        int[][] testData = {
            {4, 20, 0},
            {6, 50, 0},
            {23, 59, 30},
            {0, 55, 10},
            {12, 59, 53},
            {24, 0, 0},
        };

        String[] expectedTestResults = {
            "04:21:00",
            "06:51:00",
            "00:00:30",
            "00:56:10",
            "13:00:53",
            "00:01:00",
        };

        while (t < testData.length) {

            testTimeObj = new Time(testData[t][0], testData[t][1], testData[t][2]);

            System.out.println("TEST NUMBER: " + (t + 1) + "------------------------------");

            System.out.println("\nTest Data: ");
            System.out.println("  - Hour = " + testData[t][0]);
            System.out.println("  - Minute = " + testData[t][1]);
            System.out.println("  - Second = " + testData[t][2]);

            System.out.println("\nTicking: ");

            i = 0;

            while (i < 60) {

                testTimeObj.tick();

                i ++;

                System.out.print(

                    String.format("%02d", i) + 
                    " " + 
                    (i == 60 ? "times" : "") + 
                    (i % 15 == 0 ? "\n" : "")

                );

            }

            System.out.println("\nExpected: " + expectedTestResults[t]);

            System.out.println("Outcome:  " + testTimeObj.returnTime() + "\n");

            System.out.println("Passed: " + (expectedTestResults[t].equals(testTimeObj.returnTime()) ? "TRUE" : "FALSE"));

            System.out.println("--------------------------------------------");

            t ++;

        }

    } 

}