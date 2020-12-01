import java.util.*;
import java.time.*;
@SuppressWarnings("serial")
class IllegalDayException extends IllegalArgumentException {
	String message;
	public IllegalDayException(String message) {
		this.message = message;
	}
	public String toString() {
		return this.message;
	}
}

class Meeting {
	Date date;
	LocalTime startTime;
	String location;
	@SuppressWarnings("deprecation")
	public Meeting(Date date , LocalTime startTime , String location) {
		if(date.getDay() == 5) throw new IllegalDayException("Cannot hold a meeting on a Friday");
		this.date = date;
		this.startTime = startTime;
		this.location = location;
	}
}

public class Driver {
	
	public static void main(String[] args) {
		try {
			Date date = new Date();
			LocalTime startTime = LocalTime.now();
			Meeting meet = new Meeting(date,startTime,"Chandigarh");
			System.out.println(meet);
		}
		catch(IllegalDayException ex) {
			System.out.println(ex);
		}
		catch(IllegalArgumentException ex) {
			System.out.println(ex);
		}
	}
}

