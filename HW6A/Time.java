package time;

public class Time {

    private int hr;
    private int min;
    private int sec;

    private final String TIME_STRING_FORMAT = "%02d:%02d:%02d";

    public Time(int hr, int min, int sec) {

        this.hr = hr; 
        this.min = min; 
        this.sec = sec; 

    }

    public Time() { 

        this.hr = 0; 
        this.min = 0; 
        this.sec = 0; 

    }

    public void tick() {

        if (this.hr == 24) { this.hr = 0; this.min = 0; }

        if (this.sec < 59) { this.sec ++; }

        else { 

            this.sec = 0;

            if (this.min < 59) { this.min ++; }

            else if (this.hr < 24) { this.min = 0; this.hr ++; }

            else { this.min = 0; this.hr = 0; }

        }

    }

    public String getTime() {

        return String.format(this.TIME_STRING_FORMAT, this.hr, this.min, this.sec);

    }

}