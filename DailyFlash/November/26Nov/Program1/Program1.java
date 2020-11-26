

class Festivles {
	
	System.out.println("!!! Indian Festivles !!!");
	public void enjoy() {
	
		System.out.println("All are Happy");
	}

	public void gifts() {
	
		System.out.println("All gets Gifts");
	}

	public void sweets() {

                System.out.println("Enjoy eating sweets");
        }
}

class Diwali extends Festivals {

	System.out.println("Diwali Festival......");
	
	public void crackers() {
	
		System.out.println("Burn Crackers");
	}
}

class Rakshabandhan extends Festivals {

	System.out.println("Rakshabandhan Festivals......");

	public void rakhi() {
	
		System.out.println("Tie Rakhi to brothers");
	}
}

class MakarSankranti extends Festivals {

	System.out.println("MakarSankranti Festivals.......");

	public void kite() {
	
		System.out.println("Everyone Flies kite");
	}
}

class IndianFes {

	public static void main(String[] args) {
	
		Diwali obj1 = new Diwali();
		Rakshabandhan obj2 = new Rakshabandhan();
		MakarSankranti obj3  = new MakarSankranti();

		obj1.enjoy();
	//	obj2.enjoy();
	//	obj3.enjoy();
	}
}
