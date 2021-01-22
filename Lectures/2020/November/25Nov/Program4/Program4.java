

class OverloadDemo {

	void m1(int x) {
	
		System.out.println("Int in m1");
	}

	void m1(float x) {
	
		System.out.println("Float in m1");
	}
}

class Test {

	public static void main(String[] args) {
	
		OverloadDemo obj = new OverloadDemo();
		obj.m1('A');
		obj.m1(10);
		obj.m1(50l);
	//	obj.m1(20.5);		//Error
		obj.m1(20.5f);
	}
}
