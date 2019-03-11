package test;

import java.util.*;

public class TestData {

    private int testHr;
    private int testMin;
    private int testSec;

    private int numTestTicks;

    private String expectedOutputStr;

    public TestData(String line) {

        String[] sections = line.split(",");

        String[] input = sections[0].split(":");
        this.testHr = Integer.parseInt(input[0].trim());
        this.testMin = Integer.parseInt(input[1].trim());
        this.testSec = Integer.parseInt(input[2].trim());

        this.numTestTicks = Integer.parseInt(sections[1].trim());
        this.expectedOutputStr = sections[2].trim();

    }

    public int getTestHr() {

        return this.testHr;

    }

    public int getTestMin() {

        return this.testMin;
        
    }

    public int getTestSec() {

        return this.testSec;
        
    }

    public int getNumTestTicks() {

        return this.numTestTicks;
        
    }

    public String getExpectedOutputStr() {

        return this.expectedOutputStr;
        
    }

}