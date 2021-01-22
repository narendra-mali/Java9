


class Demo {

	void m1(Object s1) {

		System.out.println("Object method");
	}

	void m1(String s2) {

		System.out.println("String method");
	}
}

class Test {

	public static void main(String[] args) {

		Demo obj = new Demo();

		obj.m1("Shashi");		//String method
		obj.m1(new Object());		//Object method
		obj.m1(null);			//String method
	}
}
