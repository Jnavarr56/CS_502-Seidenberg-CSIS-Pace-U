## Assignment #6

```
class Time {
	private  int  hour;
	private  int  minute;
	private  int  second;
		
	public Time( ) { }
	public Time(int  hr , int  min, int  sec) {  }
	public  void setTime(int  hr , int  min, int  sec) {  }
	public  void printTime( ) {  }
	public  void tick( ) {
	  // tick method defined
	}
}
```

#### The class Time defines a time object.  It represents time (military time) in 2400 hours.
```	
  10 AM = 10 hours, 0 minutes and 0 seconds
	4 PM = 16 hours, 0 minutes and 0 seconds
	7:26PM = 19 hours, 26 miunutes and 0 seconds
```
#### Assume 0 represents 00 in this case.

####1) Implement the two constructor:
```
    Time(): will set the instance variables to zero.
	Time(int  hr , int  min, int  sec): will set the time with	parameters passed in.
```
#### 2) Implement the setTime method to set the instance variables according to the values passed in.

#### 3) Implement the printTime method to print time in hours:minutes:seconds.
```
	e.g.  16:37:23
```
#### 4) Implement the tick( ) method that will increment the time object by one second. Remember that 60 seconds = 1 minute, 60 minutes = 1 hour, and the max hours is 24.

#### 5) Test the time object.  Increment the Time object by 60 seconds and print out the time.
#### Repeat question 5 for several different instances of the Time object.  Each instance should have a different starting time.
