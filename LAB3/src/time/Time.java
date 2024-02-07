package time;



public class Time {

	private int hour;
	private int minute;
	private int second;
	
	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public String toUniversal() {
		
		String s = "";
		int uniHour = hour % 24;
		
		if (uniHour < 10) {
			s += "0" + uniHour + ":";
		}
		
		else {
			s += uniHour + ":";
		}
		
		if (minute < 10) {
			s += "0" + minute + ":";
		}
		
		else {
			s += minute + ":";
		}
	
		
		if (second < 10) {
			s += "0" + second;
		}
		
		else {
			s += this.second;
		}
		
		return s;
	}
	
	
	
	public String toStandard() {
		
		String s = "", period = (hour <= 12) ? "AM" : "PM";
		int stnHour = hour % 12;
		
		if (stnHour < 10) {
			s += "0" + stnHour + ":";
		}
		
		else {
			s += stnHour + ":";
		}
		
		if (minute < 10) {
			s += "0" + minute + ":";
		}
		
		else {
			s += minute + ":";
		}
	
		
		if (second < 10) {
			s += "0" + second;
		}
		
		else {
			s += this.second;
		}
		
		return s + " " + period;	
	}
	
	
	
	
	public Time add(Time otherTime) {
		
		int fullSecondOwn = hour * 3600 + minute * 60 + second;
		int fullSecondOther = otherTime.hour * 3600 + otherTime.minute * 60 + otherTime.second;
		int fullSecond = fullSecondOwn + fullSecondOther;
		
		int newHour = fullSecond / 3600;
		fullSecond %= 3600;
		
		int newMinute = fullSecond / 60;
		int newSecond = fullSecond % 60;
		
		
		return new Time(newHour, newMinute, newSecond);
	}
	
}