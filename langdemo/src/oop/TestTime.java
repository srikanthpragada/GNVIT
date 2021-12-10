package oop;

class Time  {
	private int h, m, s;
	
	public Time(int h, int m, int s) {
		this.h = h;
		this.m = m;
		this.s = s;
	}
	
	public int totalSeconds() {
		return this.h * 3600 + this.m * 60 + this.s;
	}
	
	public boolean isEqual(Time other) {
		return  this.totalSeconds() == other.totalSeconds();
	}
}
public class TestTime {

	public static void main(String[] args) {
		Time t1 = new Time(16,10,10);
		Time t2 = new Time(12,50,50);
		Time t3 = new Time(12,50,50);
		
		System.out.println(t1.totalSeconds());
		System.out.println(t2.totalSeconds());
		System.out.println(t1.isEqual(t2));
		System.out.println(t2.isEqual(t3));

	}

}
