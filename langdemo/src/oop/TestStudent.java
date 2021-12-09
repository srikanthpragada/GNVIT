package oop;

class Student {
	private int admno, course;
	private String name;
	private int feepaid;

	public Student(int admno, String name) {
		this.admno = admno;
		this.course = 1; // Java
		this.name = name;
	}

	public Student(int admno, String name, int course) {
		this(admno, name);
		this.course = course;
	}

	public Student(int admno, String name, int course, int feepaid) {
		this(admno, name, course); // Call another constructor
		this.feepaid = feepaid;
	}

	public String getCourseName() {
		return this.course == 1 ? "Java" : "Python";
	}

	public int getCourse() {
		return this.course;
	}

	public int getTotalFee() {
		return this.course == 1 ? 10000 : 5000;
	}

	public void print() {
		System.out.println(this.admno);
		System.out.println(this.name);
		System.out.println(this.course);

	}

	public void payment(int amount) {
		this.feepaid += amount;
	}

	public int getFeepaid() {
		return this.feepaid;
	}

	public int getDue() {
		return this.getTotalFee() - this.feepaid;
	}
}

public class TestStudent {

	public static void main(String[] args) {
		Student s1 = new Student(1, "Bill", 1);
		s1.payment(3000);
		s1.payment(3000);
		System.out.println(s1.getTotalFee());
		System.out.println(s1.getCourseName());
		System.out.println(s1.getFeepaid());
		Student s2 = new Student(2, "Jack", 2, 5000);
		
//		Student [] a = new Student[10];
//		a[0].print(); 
	}

}
