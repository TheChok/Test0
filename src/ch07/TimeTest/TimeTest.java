package ch07.TimeTest;

public class TimeTest {

	public static void main(String[] args) {
		
		Time t = new Time();
		//	t.hour = 100;
		t.setHour(21);
		System.out.println(t.getHour());
		t.setHour(100);
		System.out.println(t.getHour());
		

	}

}

class Time {
	private int hour, minute, second; // hour 는 0 ~ 23의 값을 가져야 함.
	
	public void setHour(int hour) {
		if(isNotVaildHour(hour)) return;
		
		this.hour = hour;
	}
	// 매개변수로 넘겨진 hour가 유효한지 알려주는 메서드
	private boolean isNotVaildHour(int hour) {
		return hour < 0 || hour > 23;
	}
	
	public int getHour() {	return hour;	}
}


