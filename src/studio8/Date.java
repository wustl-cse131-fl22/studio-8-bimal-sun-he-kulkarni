package studio8;

import java.util.LinkedList;
import java.util.Objects;

public class Date {
	int month;
	int day;
	int year;
	boolean isHoliday;
	/**
	 * 
	 * @param month
	 * @param day
	 * @param year
	 * @param isHoliday
	 */
	public Date(int month,int day,int year,boolean isHoliday ) {
		this.month= month;
		this.day= day;
		this.year= year;
		this.isHoliday=isHoliday;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public boolean isHoliday() {
		return isHoliday;
	}
	public void setHoliday(boolean isHoliday) {
		this.isHoliday = isHoliday;
	}
	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && month == other.month && year == other.year;
	}
	public String toString() {
		return month+ " "+day+","+year;
	}

	public static void main(String[] args) {
		Date date1 = new Date(1,2,2003,false);
		Date date2 = new Date(1,3,2003,false);
		Date date3 = new Date(1,5,2013,true);
		Date date4 = new Date(1,7,2005,false);
		Date date5 = new Date(1,10,2033,true);
		LinkedList<Date> list = new LinkedList<Date>();
		list.add(date1);
		list.add(date2);
		list.add(date3);
		list.add(date4);
		list.add(date5);
		list.add(date5);
		System.out.println(list);
	}

}
