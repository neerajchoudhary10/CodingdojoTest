package main.java.codingdojo;

public class LeapYear {
	/**
	 * method is checking given year is leap year or not
	 * 
	 * @param year
	 * @return
	 */
	public boolean isLeapYear(int year) {
		if (year % 4000 != 0 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
			return true;
		} else if ((year % 100 == 0 && year % 400 != 0) || year % 4 != 0) {
			return false;
		}
		return false;
	}

}
