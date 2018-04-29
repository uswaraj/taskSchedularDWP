/**
* Author : Swaraj Udakhe
* Date   : 28-March-2018
* Desc	 : Time program to display time using two constructors, 
* 			one default and another with parameterized constructor 
*/

package dateAndTime;

import java.time.OffsetTime;
import java.util.Calendar;

class Test {
	public static void main(String[] args) {
		// Time t1 = new Time(01, 20, 145);
		Time t1 = new Time();
		// OffsetTime o = OffsetTime.now();
		Time t2 = new Time(25, 235, 100);

		Time.showTime(t1, t2);
	}
}

public class Time {

	private int hh;
	private int mm;
	private int ss;

	public int getHh() {
		return hh;
	}

	public void setHh(int hh) {
		this.hh = hh;
	}

	public int getMm() {
		return mm;
	}

	public void setMm(int mm) {
		this.mm = mm;
	}

	public int getSs() {
		return ss;
	}

	public void setSs(int ss) {
		this.ss = ss;
	}

	public Time() {
		/*
		 * int hour = 0; int min = 0; int sec = 0;
		 */
		this.hh = 0;
		this.mm = 0;
		this.ss = 0;

	}

	public Time(int hh, int mm, int ss) {

		int tempMM = 0, tempHH = 0;

		if (ss > 59) {

			tempMM = ss / 60;
			ss = ss % 60;
		}
		mm = mm + tempMM;

		if (mm > 59) {

			tempHH = mm / 60;
			mm = mm % 60;
		}

		hh = hh + tempHH;
		if (hh > 23) {

			hh = hh % 24;
		}

		this.hh = hh;
		this.mm = mm;
		this.ss = ss;
	}

	public static void showTime(Time t1, Time t2) {
		Time t3 = new Time();

		t3.setHh(t1.getHh() + t2.getHh());
		t3.setMm(t1.getMm() + t2.getMm());
		t3.setSs(t1.getSs() + t2.getSs());

		System.out.println("Current Time " + t3.getHh() + ":" + t3.getMm() + ":" + t3.getSs());
	}

}
