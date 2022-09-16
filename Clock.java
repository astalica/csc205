package Lab03B;

import java.util.*; //To use the Calendar class
import java.text.*;

public class Clock implements IClock
{
    // This clock stores the current time in hours, minutes and
    // seconds
    private int second; 
    private int minute;
    private int hour;
    
    public Clock()
    {
	  // The clock gets current time from Java’s Calendar class
        Calendar rightNow = Calendar.getInstance();
        second = rightNow.get(Calendar.SECOND);
        minute = rightNow.get(Calendar.MINUTE);
        hour   = rightNow .get(Calendar.HOUR_OF_DAY);
    }
    // Write the getHour, getMinute and getSecond methods (i.e., write
    // the accessor methods)

	@Override
	public int getHour() {
		
		return hour;
	}

	@Override
	public int getMinute() {
		
		return minute;
	}

	@Override
	public int getSecond() {
		
		return second;
	}

	
	public void tick() {		  //method to tick the "clock" ahead by 1 second
								            //first checks to see if second is <= 58
		if(second<=58) {		    //if it is, we can second++ with no problem
			second++;			        //if not, which means second=59, we have to reset
		}						            //seconds to 0, and then repeat the same logic 
		else {					        //with minute and then hour. The end result is
			second = 0;			      //a properly updated clock
			if(minute<=58) {
				minute++;
			}
			else {
				minute = 0;
				if(hour<=22) {
					hour++;
				}
				else {
					hour = 0;
				}
			}
		}
		
	}

	@Override
	public void tickAhead(int numSecs) {    //method to tick ahead the "clock" by a 
										                      //certain number of seconds. this is done	
		int i = 1;						                //by using the tick() method written above
										                      //in a do while loop. It establishes an int
		do {							                    //i that =1. it then performs the tick()
			tick();						                  // method and adds 1 to i as long as i<=numSecs
			i++;						                    //the end result is a properly updated clock that
		}while(i<=numSecs);				            //is ticked the number of times that the user specifies
		
	}
		
		
}

    //Write the skeleton of the tick() and tickAhead() methods
    

