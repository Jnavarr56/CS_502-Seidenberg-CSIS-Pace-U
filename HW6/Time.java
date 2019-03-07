package militaryTime;

public class Time {

    private int hr;
    private int min;
    private int sec;

    private static final String TIME_STRING_FORMAT = "%02d:%02d:%02d";
    private static final String TICK_HEADER = new String(
        
        "\n\tInitiating Ticks:" +
        "\n\t--------------------------"

    );
    private static final String TICK_CELL_FORMAT = "%s%02d%s";
    private static final String COL_LEN_ERROR_MSG = new String(

        "\t(Column length greater than\n" +
        "\ttotal times, defaulting to\n" +
        "\tcol length of 1.)"

    );
    private static final int DELAY_BASE = 1000;



    public Time(int hr, int min, int sec) {

        this.hr = hr;
        this.min = min;
        this.sec = sec;

    }
    public Time() { hr = 0; min = 0; sec = 0; }

    public String returnTime() { return String.format(TIME_STRING_FORMAT, hr, min, sec); }

    public void printTime() { System.out.println(returnTime()); }

    public void tick() {

        if (hr == 24) { hr = 0; min = 0; }

        if (sec < 59) { sec ++; }

        else { 

            sec = 0;

            if (min < 59) { min ++; }

            else if (hr < 24) { min = 0; hr ++; }

            else { min = 0; hr = 0; }

        }

    }

    private void tickLoop(
                            int times, 
                            boolean shouldPrint, 
                            int displayRowLength, 
                            int delay
                                        ) {
        
        if (shouldPrint) {

            System.out.println(TICK_HEADER);

            if (displayRowLength > times) {

                displayRowLength = 1;

                System.out.println(COL_LEN_ERROR_MSG);

            }

        }

        int i = 0;

        while (i < times) { 

            tick(); 
            
            if (shouldPrint) { 

                System.out.print(formatTickCell(i, displayRowLength)); 

                delay(delay);
        
            }

            i ++;
            
        }

    }

    public void tickMultipleTimesAndPrint(int times, int displayRowLength) { 
    
        tickLoop(times, true, displayRowLength, DELAY_BASE/times); 

    }
    public void tickMultipleTimes(int times) {  tickLoop(times, false, 0, 0); }

    private String formatTickCell(int i, int displayRowLength) {

        return String.format(
            
            TICK_CELL_FORMAT,

            i == 0 ? "\t" : "",
            ++ i, 
            i % displayRowLength == 0 ? "\n\t" : " "

        );

    }

    private void delay(int delay) {

        try { Thread.sleep(delay); } 

        catch (Exception e) { System.out.println(e); }

    }

}