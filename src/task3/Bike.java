package task3;


public class Bike {
	String name;
	int cc;
	int speed;
	int price;
	
	

	public Bike() {
		this.name="Unknown";
		this.cc=0;
		this.speed=0;
		this.price=0;
	}
	public Bike(String name, int cc, int speed, int price) {
		super();
		this.name = name;
		this.cc = cc;
		this.speed = speed;
		this.price = price;
	}

	public void display() {
		System.out.println("name of bike "+name+" cc is "+cc+"cc "+"speed is "+speed+"KPH "+" and price is "+price);
	}
	
	public void display(String name, int cc, int speed, int price) {
		System.out.println("name of bike "+name+" cc is "+cc+"cc "+"speed is "+speed+"KPH "+" and price is "+price);
	}
	
	
	public static void main(String[] args) {
		Bike bike=new Bike();
		bike.display();
		Bike bike2=new Bike("karizma", 223, 130, 145000);
		bike2.display();
		Bike bike3=new Bike();
		bike3.display("R15", 155, 125,135000);
	}

}
