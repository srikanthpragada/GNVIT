package oop;

class Circle {
	private int x,y,radius;

	public Circle(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public double getArea() {
		return  Math.PI * this.radius * this.radius; 
    }
	
	public double getCircum() {
		return  2 * Math.PI * radius; 
    }
	
	public int getRadius() {
		return radius; 
	}
}
public class TestCircle {

	public static void main(String[] args) {
		 Circle c = new Circle(10,20,15);
		 System.out.printf("Area = %.2f",c.getArea());
		 
	}

}
