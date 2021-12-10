package oop;

class Product  {
	private String name;
	private int price, qoh;
	
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
		this.qoh = 0;
	}
	
	public void print() {
		System.out.println(this.name);
		System.out.println(this.price);
		System.out.println(this.qoh);
	}
	
	public void buy(int qty) {
		this.qoh += qty;
	}
	
	public void sell(int qty) {
		this.qoh -= qty;
	}
	
	public int getNetPrice() {
        return  this.price + this.price * 12 / 100;	
	}
	
}
public class TestProduct {

	public static void main(String[] args) {
       Product p1 = new Product("iPhone 13", 88000);
       p1.buy(10);
       p1.sell(3);
       p1.print();
       System.out.println(p1.getNetPrice());
	}

}
