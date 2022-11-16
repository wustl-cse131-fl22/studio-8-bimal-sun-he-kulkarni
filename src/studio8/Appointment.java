package studio8;

import java.util.LinkedList;
import java.util.Objects;

public class Appointment {
	private Date date;
	private Time time;
	private String subject;

	public Appointment(Date date, Time time, String subject) {
		this.date= date;
		this.time= time;
		this.subject= subject;

	}
	public String toString() {
		return date.toString()+time.toString()+":"+subject;
	}

	@Override
	public int hashCode() {
		return Objects.hash(date, subject, time);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		return Objects.equals(date, other.date) && Objects.equals(subject, other.subject)
				&& Objects.equals(time, other.time);
	}
	public static void main(String[] args) {
		Time time1 = new Time(12,30,false);
		Time time2 = new Time(9,30,true);
		Time time3 = new Time(11,30,false);
		Time time4 = new Time(12,55,false);
		Time time5 = new Time(1,30,true);
		Date date1 = new Date(1,2,2003,false);
		Date date2 = new Date(1,3,2003,false);
		Date date3 = new Date(1,5,2013,true);
		Date date4 = new Date(1,7,2005,false);
		Date date5 = new Date(1,10,2033,true);
		Appointment a = new Appointment(date1,time1,"hair");
		Appointment b= new Appointment(date2,time2,"food");
		Appointment c = new Appointment(date3,time3,"sports");
		LinkedList<Appointment> calendar = new LinkedList<Appointment>();
		calendar.add(a);
		calendar.add(b);
		calendar.add(c);

		System.out.println(calendar);


	}}
