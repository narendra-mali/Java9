

import java.io.*;

abstract class car {

	abstract void mileage();

	abstract void price();

	void seater () {

		System.out.println("Four Seater");
	}
}

class car1 extends car {
	
	void mileage() {

		System.out.println("Excellent mileage");
	}
	
	void price() {
	
		System.out.println("Affordable price");
	}
}

class MainCar {

	public static void main(String[] args) {

		car1 c1 = new car1();
		c1.seater();
		c1.mileage();
		c1.price();

		car c = new car1();
		c.seater();
		c.mileage();
		c.price();

	}
}
