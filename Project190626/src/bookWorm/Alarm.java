package bookWorm;

public class Alarm {
	
	String textAlarm;
	int hour, minute, leftTime;
	
	public void setTextAlarm(String textAlarm) {
		this.textAlarm = textAlarm;
	}
	public String getTextAlarm() {
		return textAlarm;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getHour() {
		return hour;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}
	public int getMinute() {
		return minute;
	}

	public void setLeftTime(int leftTime) {
		this.leftTime = leftTime;
	}
	public int getLeftTime() {
		return leftTime;
	}
	
}
