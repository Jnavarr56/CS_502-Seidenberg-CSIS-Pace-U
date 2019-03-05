package militaryTime;

public class Time {

    // Making the instance variables private [ENCAPSULATION].
    private int hour;
    private int minute;
    private int second;

    // Methods will be public since we need to use them directy 
    // in another class [INTERFACE].


    // Java does not have optional parameters, so in order to
    // design an object so that it can set default values to
    // instance variables if there are no parameters, but also
    // set values for instance values when there ARE parameters
    // we need to have 2 constructors. 
    public Time(int hour, int minute, int second) {

        this.hour = hour;
        this.minute = minute;
        this.second = second;

    }
    public Time() {
        
        hour = 0;
        minute = 0;
        second = 0;

    }

    public void printTime() {

        // The Sting.format() method allows us to create a string by substituting
        // in variable values for "format specifiers" in a specific order.
        // %d is the format specifier for an integer, so we simply pass in
        // "%d:%d:%d" for the first parameter, and then hour, minute, second
        // and the method will produce a version of the string that is 
        // equivalent to (hour + ":" + minute + ":" + second).
        System.out.println(String.format("%d:%d:%d", hour, minute, second));

    }

    public void Tick() {

        // Reset clock to 0 hour and 0 minute if we passed a 24 hour cycle.
        if (hour == 24) { hour = 0; minute = 0; }


        // If the current second is less than 59, just increase the second.-------------
        if (second < 59) { second ++; }

        // Otherwise, continue with the logic needed to increase the time.--------------
        // Everytime adding a second would increase a unit (hr, sec, min) --------------
        // we must set the previous unit(s) to 0 before increasing the next unit. ------
        //  Ex: 
        //      If seconds is currently 59 adding 1 to it will make seconds 
        //      0 and will add 1 to the minutes. 
        //
        //      If seconds is currently 59 and minutes is currently 59, we will
        //      make minutes 0 and seconds 0 and increase hour by 1.
        //      
        else { 

            second = 0;

            if (minute < 59) { minute ++; }

            else if (hour < 24) { minute = 0; hour ++; }

            else { minute = 0; hour = 0; }

        }

    }

}