

interface A {

	void m1();
}

interface B extends A {

	void m2();
}

class AB implements B {

	public void m1() {
	
		System.out.println("In m1");
	}

	public void m2() {
	
		System.out.println("In m2");
	}
}

class Test {

	public static void main(String[] args) {
	
		AB obj = new AB();
		obj.m1();
		obj.m2();

		A ref1 = new AB();
		ref1.m1();
	//	ref1.m2();		//error

		B ref2 = new AB();
		ref2.m1();
		ref2.m2();
	}
}
