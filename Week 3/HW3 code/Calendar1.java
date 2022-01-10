import java.time.YearMonth;
/** 
 * Prints the calendars of all the years in the 20th century.
 */
public class Calendar1 {	
    // Starting the calendar on 1/1/1900
	static int dayOfMonth = 1;   
	static int month = 1;
	static int year = 1900;
	static int dayOfWeek = 2;     // 1.1.1900 was a Monday
	static int nDaysInMonth = 31; // Number of days in January
	
	/** 
	 * Prints the calendars of all the years in the 20th century. Also prints the  
	 * number of Sundays that occured on the first day of the month during this period.
	 */
	public static void main(String args[]) {
		// Advances the date and the day-of-the-week from 1/1/1900 till 31/12/1999, inclusive.
	    // Prints each date dd/mm/yyyy in a separate line. If the day is a Sunday, prints "Sunday".
	    // The following variable, used for debugging purposes, counts how many days were advanced so far.
	    int debugDaysCounter = 0; 
		int sundayTheFirst = 0;
	 	while (!(year > 1999 && dayOfMonth == 1 && month == 1)) {
			
			if (dayOfWeek == 1) {
				System.out.println(dayOfMonth + "/" + month + "/" + year + " Sunday");
				if (dayOfMonth == 1) {
					sundayTheFirst++;
				}
			} else {
				System.out.println(dayOfMonth + "/" + month + "/" + year);
			}
	 		advance();
	 		debugDaysCounter++;
        }

		String message1 = "During the 20th century, " + sundayTheFirst +
			" Sundays fell on the first day of the month";
		System.out.println(message1);
	 }
	
	 // Advances the date (day, month, year) and the day-of-the-week.
	 // If the month changes, sets the number of days in this month.
	 // Side effects: changes the static variables dayOfMonth, month, year, dayOfWeek, nDaysInMonth.
	 private static void advance() {
		//dayOfWeek
		if (dayOfWeek < 7) {
			dayOfWeek++;
		} else {
			dayOfWeek = 1;
		}

		int numOfDaysInMonth = nDaysInMonth(month, year);
		nDaysInMonth = numOfDaysInMonth;

		boolean isLastDayOfMonth = dayOfMonth == numOfDaysInMonth;

		//dayOfMonth
		if (dayOfMonth < numOfDaysInMonth) {
			dayOfMonth++; 
		} else {
			dayOfMonth = 1;
		}

		//year
		if (month == 12 && isLastDayOfMonth) {
			year += 1;
		}

		//month
		if (isLastDayOfMonth) {
			if (month < 12) {
				month++;
			} else {
				month = 1;
			}
		}
	} 
		 
    // Returns true if the given year is a leap year, false otherwise.
	private static boolean isLeapYear(int year) {
		boolean isLeapYear = true;
		int min = 31;
		int counter = 1;

		while (counter <= 12) {
			int monthLength = nDaysInMonth(counter, year);
			if (monthLength < min) {
				min = monthLength;
			}
			counter++;
		}

		if (min == 28) {
			isLeapYear = false;
		}

		return isLeapYear;
	}
	 
	// Returns the number of days in the given month and year.
	// April, June, September, and November have 30 days each.
	// February has 28 days in a common year, and 29 days in a leap year.
	// All the other months have 31 days.
	private static int nDaysInMonth(int month, int year) {
		YearMonth yearMonthObject = YearMonth.of(year, month);
		int monthLength = yearMonthObject.lengthOfMonth();
		return monthLength;
	}
}
