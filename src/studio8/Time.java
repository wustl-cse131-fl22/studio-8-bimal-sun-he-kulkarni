package studio8;

import java.util.HashSet;
import java.util.Objects;

public class Time {

	@Override
	public int hashCode() {
		return Objects.hash(hour, minute);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && minute == other.minute;
	}
	int hour;
	int minute;
	boolean isMilitary;
	/**
	 * 
	 * @param hour
	 * @param minute
	 * @param isMilitary
	 */
	public Time(int hour, int minute, boolean isMilitary) {
		this.hour = hour;
		this.minute = minute;
		this.isMilitary = isMilitary;

	}
	
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public boolean isMilitary() {
		return isMilitary;
	}
	public void setMilitary(boolean isMilitary) {
		this.isMilitary = isMilitary;
	}
	public String toString() {
		
		if(isMilitary) {
			return hour+":"+minute;
			
		}
		else {
			if(hour==0) {
				return 12+":"+minute+" am.";
			}
			else if(hour== 12) {
				return 12+":"+minute+" pm.";
			}
			if(hour>=12) {
				return this.hour-12+":"+minute+" pm.";
			}
			else {
				return this.hour+":"+this.minute+"am";
			}
		}
	}
	public static void main(String[] args) {
		Time time1 = new Time(12,30,false);
		Time time2 = new Time(9,30,true);
		Time time3 = new Time(11,30,false);
		Time time4 = new Time(12,55,false);
		Time time5 = new Time(1,30,true);
		HashSet<Time> set = new HashSet<Time>();
		set.add(time1);
		set.add(time2);
		set.add(time3);
		set.add(time4);
		set.add(time5);
		set.add(time5);
		System.out.println(set);
		
	}

}