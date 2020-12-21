

class Parent {

	void m1() {
	
		System.out.println("In m1 - Parent");
	}
}

class Child extends Parent {

	final void m1() {

                System.out.println("In m1 - Child");
        }

	public static void main(String[] args) {
	
		Child c = new Child();
		c.m1();
	}
}

/*
 * In m1 - Child
 */
