import java.io.FileNotFoundException;
import java.io.*; 
import java.nio.file.*;
import java.util.*;

import test.TestData;
import time.Time;

public class Main {

    public static void main(String args[]) {

        TestData testDataObj;
        Time timeObj;
        
        ArrayList<String> validLines = new ArrayList<>();
 
        try ( Scanner scan = new Scanner(new FileReader("dataset.txt")) ) {

            String line;

            int testNum = 1;

            while (scan.hasNext()) {

                line = scan.nextLine();

                if ( !(line.length() == 0 || line.charAt(0) == '#') ) {

                    testDataObj = new TestData(line);

                    System.out.println("TEST NUMBER: " + testNum);

                    timeObj = new Time(
                        testDataObj.getTestHr(), 
                        testDataObj.getTestMin(), 
                        testDataObj.getTestSec()
                    );

                    //System.out.println(timeObj.getTime());

                    int tickNum = 0;

                    while (tickNum < testDataObj.getNumTestTicks()) {

                        timeObj.tick();

                        tickNum++;

                    }

                    System.out.println("ACTUAL OUTPUT: " + timeObj.getTime());
                    System.out.println("EXPECTED OUTPUT: " + testDataObj.getExpectedOutputStr());

                    testNum++;

                }

            }

        }

        catch(FileNotFoundException e) {

            System.out.println(e);

        }

        
        

    }

    

    


}

