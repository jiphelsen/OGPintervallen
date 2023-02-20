package time;
/*
 * Each instance of this class represents a time of day.
 * @invar | 0 <= getHours() && getHours()  <= 23
 * @invar | 0 <= getMinutes() && getMinutes() <= 59
 * */
public class TimeOfDay {
	/*
	 * @invar |  0 <= hours && hours <= 23
	 * @invar | 0 <= minutes && minutes <= 59
	 * */
	private int hours;
	private int minutes;
	
	// getters
	int getHours() {
		return this.hours;
	}
	int getMinutes() {
		return this.minutes;
	}
	
	// setters 
	/*
	 * Sets this instance's hours to the given hours.
	 * @throws | 0 > hours || hours > 23
	 * @mutates | this
	 * @post | getHours() == hours
	 * */
	void setHours(int hours) {
		boolean invalidHours = 0 > hours || hours > 23;
		if(invalidHours)
			throw new IllegalArgumentException("Illegal `hours` argument");
		this.hours = hours;
	}
	/*
	 * Sets this instance's minutes to the given minutes.
	 * @throws | 0 > minutes || minutes > 59
	 * @mutates | this
	 * @post | getMinutes() == mintes
	 * */
	void setMinutes(int minutes) {
		boolean invalidMinutes =  0 > minutes || minutes > 59;
		if(invalidMinutes)
			throw new IllegalArgumentException("Illegal `minutes` argument");
		this.minutes = minutes;
	}
	
	// constructor	
	/*
	 * Intializes  time of day object.
	 * @throws | 0 > hours || hours > 23
	 * @throws | 0 > minutes || minutes > 59
	 * @post| getHours() == hours
	 * @post| getMinutes() == minutes
	 * */
	TimeOfDay(int hours,int minutes){
		boolean invalidHours = 0 > hours || hours > 23;
		boolean invalidMinutes =  0 > minutes || minutes > 59;
		if(invalidHours)
			throw new IllegalArgumentException("Illegal `hours` argument");
		if(invalidMinutes)
			throw new IllegalArgumentException("Illegal `minutes` argument");
		this.hours = hours;
		this.minutes = minutes;
	}
	
}
