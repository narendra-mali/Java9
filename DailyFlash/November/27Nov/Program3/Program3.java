

class Base {

	void m1() {
	
		System.out.println("Base class method");
	}
}

class Derived extends Base {

	void m1() {
	
		System.out.println("Derived class method");
	}
}

class Demo {

	public static void main(String[] args) {
	
		Derived obj = new Derived();
		obj.m1();

		Base obj1 = new Derived();
		obj1.m1();
	}
}

/*
 * It is not possible to call base class methods from the derived class object
 */
