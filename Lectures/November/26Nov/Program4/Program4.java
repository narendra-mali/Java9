

class Demo {

	void m1(int ... varg) {			// 0 or more parameters

		System.out.println("Variable Arguments method");
	}

	void m1(int x) {

		System.out.println("Int method");
	}
}

class Test {

	public static void main(String[] args) {

		Demo obj = new Demo();

		obj.m1();			//Variable Arguments method
		obj.m1(20,21);			//Variable Arguments method
		obj.m1(10);			//Int method
	//	obj.m1(10.5f);			//error
		obj.m1('A');			//Int method
	}
}
