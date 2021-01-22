

class Demo {

	void m1(char x) {
	
		System.out.println("In method m1 - char");
	}

	void m1(int y) {
	
		System.out.println("In method m1 - Int");
	}

	public static void main(String[] args) {
	
		Demo obj = new Demo();

		obj.m1('A');
		obj.m1(10);
	}
}
